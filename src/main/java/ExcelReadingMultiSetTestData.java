import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReadingMultiSetTestData {
    static ExcelUtils excelUtils = new ExcelUtils();
    static int numOfRows = 0;
    static int numOfCols = 0;
    static String key;
    static String value;
    static String sheetName = "Department";
    static String testName;
    static XSSFSheet sheet;

    static Map<String, Map<Integer, Map<String, String>>> completeTestData = new HashMap<>();

    public static void main(String[] args) throws IOException {
        excelUtils.setExcelFile("./", "src/main/resources/sample-xlsx-file.xlsx");

        numOfRows = excelUtils.getRowCount(sheetName);
        numOfCols = excelUtils.getLastColumnNumber(sheetName, "#", 1);
        System.out.println("numOfRows : " + numOfRows + "         numOfCols:  " + numOfCols);

        for (int i = 2; i < numOfRows; i++) {
            completeTestData.put("testCase001", iterationData());
        }
        completeTestData.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
    }

    public static Map<Integer, Map<String, String>> iterationData() {
        Map<Integer, Map<String, String>> testIterationData = new HashMap<>();
        for (int i = 2; i < numOfRows; i++) testIterationData.put(i - 1, iterationData(i, numOfCols));
        return testIterationData;
    }

    public static Map<String, String> iterationData(int rowNum, int numOfCols) {
        Map<String, String> iterationData = new HashMap<>();
        for (int j = 0; j < numOfCols; j++) {
            String key = excelUtils.getCellDataFromTestDataSheet(sheetName, 1, j);
            String value = excelUtils.getCellDataFromTestDataSheet(sheetName, rowNum, j);
            iterationData.put(key, value);
            //System.out.print(excelUtils.getCellDataFromTestDataSheet(sheetName, rowNum, j)+ "\t");
        }
        return iterationData;
    }

}
