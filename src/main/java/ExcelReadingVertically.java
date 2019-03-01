import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReadingVertically {
    static ExcelUtils excelUtils = new ExcelUtils();
    static ExcelUtils toolDetailsExcel = new ExcelUtils();
    static final String platFormSheetName = "functional-android-devices";
    static int numOfRows = 0;
    static int numOfCols = 0;
    static String key;
    static String value;

    static HashMap<String, Map<String, String>> completeData = new HashMap<String, Map<String, String>>();

    public static void main(String[] args) throws IOException {

        excelUtils.setExcelFile("./", "src/main/resources/Android.xlsx");
        toolDetailsExcel.setExcelFile("./", "src/main/resources/ToolDetails.xlsx");

        numOfRows = excelUtils.getLastRowNumber(platFormSheetName, "EndOfRows");
        numOfCols = excelUtils.getLastColumnNumber(platFormSheetName, "EndOfColumns");

        System.out.println("numOfRows : " + numOfRows + "         numOfCols:  " + numOfCols);

        for (int rowNum = 0; rowNum < numOfRows; rowNum++) {
            String className = excelUtils.getCellData(platFormSheetName, rowNum, 1);
            String classRunMode = excelUtils.getCellData(platFormSheetName, rowNum, 2);
            if (classRunMode.equalsIgnoreCase("Y")) {
                className = excelUtils.getCellData(platFormSheetName, rowNum, 1);

                int classNameColumnNumberInTestData = excelUtils.testCaseColumnNumber(Constants.TEST_DATA_WORKSHEET,
                        className, 0);
                int numberOfRowsInTestDataSheet = excelUtils.getLastRowNumber(Constants.TEST_DATA_WORKSHEET,
                        Constants.END_OF_ROWS);
                completeData.put(className,
                        classSpecificData(classNameColumnNumberInTestData, numberOfRowsInTestDataSheet));

                for (Map.Entry<String, Map<String, String>> entry : completeData.entrySet()) {
                    String k = entry.getKey();
                    Map<String, String> v = entry.getValue();
                    System.out.println(k + "   :  " + v);
                }
                //String[] testCases = getTestCasesOfSpecificClass(excelUtils.getCellData(platFormSheetName, rowNum, 1));
            }
        }
    }

    public static HashMap<String, String> classSpecificData(int classNameColumnNumberInTestData,
                                                            int numberOfRowsInTestDataSheet) {
        HashMap<String, String> classSpecificData = new HashMap<String, String>();

        for (int rowNumber = 2; rowNumber < numberOfRowsInTestDataSheet; rowNumber++) {
            key = excelUtils.getCellDataFromTestDataSheet(Constants.TEST_DATA_WORKSHEET, rowNumber, 1);
            value = excelUtils.getCellDataFromTestDataSheet(Constants.TEST_DATA_WORKSHEET, rowNumber,
                    classNameColumnNumberInTestData);

            classSpecificData.put(key, value);
        }

        classSpecificData = getToolDetails(classSpecificData);
        //classSpecificData = getTickDetails(classSpecificData);
        classSpecificData = getPlaceDetails(classSpecificData);

        return classSpecificData;
    }

    public static HashMap<String, String> getToolDetails(HashMap<String, String> classSpecificData) {

        String tool = classSpecificData.get("toolName");
        String sheetName = "functional" + "-" + Constants.TOOLS_DETAILS_WORKSHEET;

        if (tool != null && !tool.equalsIgnoreCase("")) {

            int toolRowNumberInToolDetails = toolDetailsExcel.startRowToolNumber(sheetName, tool);
            int lastColumnNumberOfToolDetailsSheet = toolDetailsExcel.getLastColumnNumber(sheetName,
                    Constants.END_OF_COLUMNS);

            for (int columnNumber = 1; columnNumber < lastColumnNumberOfToolDetailsSheet; columnNumber++) {
                key = toolDetailsExcel.getCellData(sheetName, 0, columnNumber);
                value = toolDetailsExcel.getCellData(sheetName, toolRowNumberInToolDetails, columnNumber);
                classSpecificData.put(key, value);
            }
        }
        return classSpecificData;
    }

    public static HashMap<String, String> getPlaceDetails(HashMap<String, String> classSpecificData) {

        String placeType = classSpecificData.get("placeType");
        String sheetName = Constants.PLACE_DATA_WORKSHEET;

        if (placeType != null && !placeType.equalsIgnoreCase("")) {

            int numberOfRowsInPlaceDataSheet = excelUtils.getLastRowNumber(sheetName, Constants.END_OF_ROWS);
            int placeTypeColumnNumberInTestData = excelUtils.testCaseColumnNumber(sheetName, placeType, 0);

            for (int rowNumber = 2; rowNumber < numberOfRowsInPlaceDataSheet; rowNumber++) {
                key = excelUtils.getCellDataFromTestDataSheet(sheetName, rowNumber, 1);
                value = excelUtils.getCellDataFromTestDataSheet(sheetName, rowNumber, placeTypeColumnNumberInTestData);

                classSpecificData.put(key, value);
            }
        }
        return classSpecificData;
    }


    public static String[] getTestCasesOfSpecificClass(String className) {
        String[] testCasesWithRunModeasY = new String[numOfRows];
        int startingRow = excelUtils.startRow(platFormSheetName, className, 0);
        String nextClassName;
        String testCaseName;
        String testCaseRunMode;
        int counter = 0;

        for (int i = startingRow; i < numOfRows; i++) {
            nextClassName = excelUtils.getCellData(platFormSheetName, i, 1);
            testCaseName = excelUtils.getCellData(platFormSheetName, i, 4);
            testCaseRunMode = excelUtils.getCellData(platFormSheetName, i, 5);

            if (nextClassName.length() > 0 && !nextClassName.equalsIgnoreCase(className)) {
                break;
            }

            if ((nextClassName == "" || nextClassName.equalsIgnoreCase(className))
                    && (testCaseRunMode.equalsIgnoreCase("Y")
                    || (testCaseRunMode.equalsIgnoreCase("N")))) {
                testCasesWithRunModeasY[counter] = testCaseName;
                System.out.println(className + "	-	" + testCaseName);
                counter++;
            }

        }
        String[] testCasesForXml = new String[counter];

        for (int i = 0; i < counter; i++) {
            testCasesForXml[i] = testCasesWithRunModeasY[i];
        }

        return testCasesForXml;
    }
}
