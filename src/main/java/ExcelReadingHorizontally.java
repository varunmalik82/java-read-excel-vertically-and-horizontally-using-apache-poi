import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReadingHorizontally {

    static ExcelUtils excelUtils = new ExcelUtils();
    static int numOfRows = 0;
    static int numOfCols = 0;
    static String key;
    static String value;
    static String sheetName="Employee";
    static String testName;

    static HashMap<String, Map<String, String>> completeData = new HashMap<String, Map<String, String>>();

    public static void main(String[] args) throws IOException {
        excelUtils.setExcelFile("./", "src/main/resources/sample-xlsx-file.xlsx");
        numOfRows = excelUtils.getLastRowNumber(sheetName, "#");//excelUtils.getRowCount(sheetName);
        numOfCols =excelUtils.getLastColumnNumber(sheetName, "#"); //excelUtils.getColCount(sheetName);

       /* for(int i=0; i<numOfRows; i++){
            for(int j=0; j<numOfCols; j++){
                System.out.print(excelUtils.getCellDataFromTestDataSheet(sheetName, i, j)+ "\t");
            }
            System.out.println();
        }*/


        for(int i=0; i<numOfRows;){
            int numOfTestRows=3;
            int numOfTestCols =excelUtils.getLastColumnNumber(sheetName, "#", i+1);
            //System.out.println(excelUtils.getCellDataFromTestDataSheet(sheetName,i+1,i));
            testName = excelUtils.getCellDataFromTestDataSheet(sheetName, i, 0);
            completeData.put(testName, testSpecificData(i, numOfTestCols));
            i+=numOfTestRows+1;
        }
        completeData.forEach((k,v)->{
            System.out.println(k +" -> "+ v);
        });
        System.out.println( completeData.get("Test1").get("Salary"));
    }

    private static Map<String, String> testSpecificData(int rowNum, int numOfTestCols) {
        Map <String, String> testData = new HashMap<>();
        for(int j=0; j<numOfTestCols;j++ ){
            String key = excelUtils.getCellDataFromTestDataSheet(sheetName, rowNum+1, j);
            String value = excelUtils.getCellDataFromTestDataSheet(sheetName, rowNum+2, j);
            testData.put(key,value);
        }

        return testData;
    }
}
