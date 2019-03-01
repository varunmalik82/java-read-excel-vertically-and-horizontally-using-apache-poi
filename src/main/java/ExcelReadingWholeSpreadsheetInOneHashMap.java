import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExcelReadingWholeSpreadsheetInOneHashMap {
    static ExcelUtils excelUtils = new ExcelUtils();
    static String sheetName = "TestSteps";

    static int numOfTestSteps = 0;
    static String testStepId;

    public static void main(String[] args) throws IOException {

        excelUtils.setExcelFile("./", "src/main/resources/TestSuite.xlsx");
        Map<String, Map<String, Map<String, String>>> testCases = new HashMap();

        int testCasesRowCount = excelUtils.getRowCount("TestCases");
        int testStepsRowCount = excelUtils.getRowCount("TestSteps");
        int testStepsColCount = excelUtils.getColCount("TestSteps");
        System.out.println("testCasesRowCount - " + testCasesRowCount);
        System.out.println("testStepsRowCount - " + testStepsRowCount);
        System.out.println("testStepsColCount - " + testStepsColCount);
        String testCaseId ;

        for(int i=1; i<testCasesRowCount; i++){
            testCaseId = excelUtils.getCellData("TestCases", i, 0);
            testCases.put(testCaseId, getTestCase(testCaseId, testStepsRowCount));
        }

        System.out.println(testCases);
       //System.out.println(testCases.get("RMI-R2-UAT-UC2-TC003").get("TS010").get("Object"));
    }


    public static Map<String, Map<String, String>> getTestCase(String testCaseId, int testStepsRowCount) {
        Map<String, Map<String, String>> testCase = new HashMap();

        Set<Map.Entry<String, Integer>> testEntry = getTestCaseInfo(testCaseId, testStepsRowCount).entrySet();
        Iterator<Map.Entry<String, Integer>> testEntryIterator = testEntry.iterator();

        while (testEntryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = testEntryIterator.next();
            testCase.putAll(getTestSteps(entry.getKey(), entry.getValue()));
        }
        return testCase;
    }


    public static Map<String, Map<String, String>> getTestSteps(String testStepId, int rowNum) {
        Map<String, Map<String, String>> testSteps = new HashMap<>();
        if (excelUtils.getCellData(sheetName, rowNum, 1).equalsIgnoreCase(testStepId)) {
            testSteps.put(testStepId, getTestStep(rowNum));
        }
        //System.out.println(testSteps);
        return testSteps;
    }


    public static Map<String, String> getTestStep(int rowNum) {
        Map<String, String> testStep = new HashMap<>();
        testStep.put(excelUtils.getCellData(sheetName, 0, 2), excelUtils.getCellData(sheetName, rowNum, 2));
        testStep.put(excelUtils.getCellData(sheetName, 0, 3), excelUtils.getCellData(sheetName, rowNum, 3));
        testStep.put(excelUtils.getCellData(sheetName, 0, 4), excelUtils.getCellData(sheetName, rowNum, 4));
        testStep.put(excelUtils.getCellData(sheetName, 0, 5), excelUtils.getCellData(sheetName, rowNum, 5));
        testStep.put(excelUtils.getCellData(sheetName, 0, 6), excelUtils.getCellData(sheetName, rowNum, 6));
        testStep.put(excelUtils.getCellData(sheetName, 0, 7), excelUtils.getCellData(sheetName, rowNum, 7));
        testStep.put(excelUtils.getCellData(sheetName, 0, 8), excelUtils.getCellData(sheetName, rowNum, 8));
        return testStep;
    }

    public static Map<String, Integer> getTestCaseInfo(String testCaseId, int testStepsRowCount) {
        Map<String, Integer> testCaseInfo = new HashMap<>();
        for (int i = 0; i < testStepsRowCount; i++) {
            if (excelUtils.getCellData("TestSteps", i, 0).equalsIgnoreCase(testCaseId)){
                testCaseInfo.put(excelUtils.getCellData("TestSteps", i, 1), i);
            }
        }
        return testCaseInfo;
    }
}
