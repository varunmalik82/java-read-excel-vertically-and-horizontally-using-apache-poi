import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

@SuppressWarnings({ "unused" })
public class ExcelUtils {
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFCell cell;
	public XSSFRow row;
	private FileInputStream in;
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;


	public void setExcelFile(String path, String file) throws IOException {
		System.out.println(path.concat(file));
		FileInputStream fs = new FileInputStream(path.concat(file));
		workbook = new XSSFWorkbook(fs);
	}

	public int startRow(String sheetName, String testCase, int startrow) {
		int testcaserownumber = 0;
		int totalrow = getRowCount(sheetName);

		for (int i = 0; i < totalrow; i++) {

			if (getCellData(sheetName, i, 1).contains(testCase)) {
				testcaserownumber = i;
				break;
			}
		}

		return testcaserownumber;
	}

	public int startRowToolNumber(String sheetName, String tool) {
		int testcaserownumber = 0;
		boolean found = false;
		int totalrow = getLastRowNumber(sheetName, "EndOfRows");

		for (int i = 0; i < totalrow; i++) {

			if (getCellData(sheetName, i, 1).contains(tool)) {
				testcaserownumber = i;
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("\n\n");
			System.out.println("\"" + tool + "\"" + " FOUND in " + sheetName);
			System.out.println("\n\n");
		} else {
			System.out.println("\n\n");
			System.out.println("\"" + tool + "\"" + " NOT FOUND in " + sheetName);
			System.out.println("\n\n");
		}

		return testcaserownumber;
	}

	public int getLastRowNumber(String sheetName, String endOfRowTest) {
		int lastRowNumber = 0;
		int totalrow = getRowCount(sheetName);

		for (int row = 0; row < totalrow; row++) {

			if (getCellData(sheetName, row, 0).contains(endOfRowTest)) {
				lastRowNumber = row;
				break;
			}
		}

		if (lastRowNumber == 0) {
			System.out.println("\n");
			System.out.println(endOfRowTest + " was not found in " + sheetName);
			System.out.println("\n\n");
		}

		return lastRowNumber;
	}

	public int getLastRowNumber(String sheetName, String endOfRowTest, int colNum) {
		int lastRowNumber = 0;
		int totalrow = getRowCount(sheetName);

		for (int row = 0; row < totalrow; row++) {

			if (getCellData(sheetName, row, colNum).contains(endOfRowTest)) {
				lastRowNumber = row;
				break;
			}
		}

		if (lastRowNumber == 0) {
			System.out.println("\n");
			System.out.println(endOfRowTest + " was not found in " + sheetName);
			System.out.println("\n\n");
		}
		return lastRowNumber;
	}

	public int getNumberOfSheetsInExcel(String path, String file) {

		int numberOfSheets = 0;
		try {

			FileInputStream fs = new FileInputStream(path.concat(file));
			workbook = new XSSFWorkbook(fs);
			numberOfSheets = workbook.getNumberOfSheets();

		} catch (Exception e) {
			System.out.println("FAILED WHILE FETHCHING THE NUMBER OF SHEETS IN EXCEL " + file);
		}
		return numberOfSheets;
	}

	public String getSheetNameAtIndex(String path, String file, int index) throws Exception {

		FileInputStream fs = new FileInputStream(path.concat(file));
		workbook = new XSSFWorkbook(fs);
		try {
			return workbook.getSheetName(index);

		} catch (Exception e) {
			System.out.println("FAILED WHILE FETHCHING THE NAME OF THE SHEET IN EXCEL AT INDEX " + index);
			System.out.println("RETUENING SHEET NAME AT INDEX ZERO");
			return workbook.getSheetName(0);
		}
	}

	public int getLastColumnNumber(String sheetName, String endOfColumnTest) {
		int lastColumnNumber = 0;
		int totalColumns = getColCount(sheetName);
		for (int col = 0; col < totalColumns; col++) {

			if (getCellData(sheetName, 0, col).contains(endOfColumnTest)) {
				lastColumnNumber = col;
				break;
			}
		}

		// Uncomment this later
		if (lastColumnNumber == 0) {
			 System.out.println("\n");
			 System.out.println(endOfColumnTest + " was not found in " + sheetName);
			 System.out.println("\n\n");
		}
		return lastColumnNumber;
	}

    public int getLastColumnNumber(String sheetName, String endOfColumnTest, int rowNum) {
        int lastColumnNumber = 0;
        int totalColumns = getColCount(sheetName, rowNum);
        for (int col = 0; col < totalColumns; col++) {

            if (getCellData(sheetName, rowNum, col).contains(endOfColumnTest)) {
                lastColumnNumber = col;
                break;
            }
        }

        // Uncomment this later
        if (lastColumnNumber == 0) {
            System.out.println("\n");
            System.out.println(endOfColumnTest + " was not found in " + sheetName);
            System.out.println("\n\n");
        }
        return lastColumnNumber;
    }

	public int testCaseColumnNumber(String sheetName, String testCase, int startrow) {
		int testCaseColumnNumber = 0;
		int totalcolumn = getColCountOfaRow(sheetName, 0);

		for (int i = 0; i < totalcolumn; i++) {

			if (getCellData(sheetName, 0, i).contains(testCase)) {
				testCaseColumnNumber = i;
				break;
			}
		}
		return testCaseColumnNumber;
	}

	public String getCellData(String sheetName, int rowNum, int colNum) {

		try {
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			String cellData = new String();
			if (cell.getCellType() == CellType.STRING) {
				cellData = cell.getStringCellValue();
				return cellData;
			} else if ((cell.getCellType() == CellType.BLANK) || (cell == null)) {
				cellData = "";
				return cellData;
			} else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
				cellData = String.valueOf(cell.getNumericCellValue());
			} else if (cell.getCellType() == CellType.NUMERIC) {
				String str = NumberToTextConverter.toText(cell.getNumericCellValue());
			}
			return cellData;
		} catch (Exception e) {
			/*int issueRowNumber = rowNum + 1;
			int issueColumnNumber = colNum + 1;
			System.out.println("Issue in sheet " + sheetName + "--Row number---" + issueRowNumber + "--Column number---"
					+ issueColumnNumber);
			e.printStackTrace();*/
			return "";
		}
	}

	public String getCellDataFromTestDataSheet(String sheetName, int rowNum, int colNum) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		String cellData = new String();
		try {
			if (cell.getCellType() == CellType.STRING) {
				cellData = cell.getStringCellValue();
				return cellData;
			} else if ((cell.getCellType() == CellType.BLANK) || (cell == null)) {
				cellData = "";
				return cellData;
			} else if (cell.getCellType() == CellType.NUMERIC|| cell.getCellType() == CellType.FORMULA) {
				if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					cellData = dateFormat.format(cell.getDateCellValue());
				} else {
					cellData = String.valueOf(cell.getNumericCellValue());
				}
			}

			return cellData;
		} catch (NullPointerException e) {
			return "";
		} catch (Exception e) {
			int issueRowNumber = rowNum + 1;
			int issueColumnNumber = colNum + 1;
			System.out.println("Issue in sheet " + sheetName + "--Row number---" + issueRowNumber + "--Column number---"
					+ issueColumnNumber);
			e.printStackTrace();
			return "";
		}
	}

	/*
	 * this method gets the total number of rows in a sheet takes the input as
	 * sheetname returns an integer value
	 */
	public int getRowCount(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		int number = sheet.getLastRowNum();
		return number + 1;
	}

	public int getColCountOfaRow(String sheetName, int rownumber) {
		sheet = workbook.getSheet(sheetName);
		Row r = sheet.getRow(rownumber);
		return r.getLastCellNum();
	}

	public int getColCount(String sheetName) {
		try {
			sheet = workbook.getSheet(sheetName);
			Row r = sheet.getRow(0);
			int number = r.getLastCellNum();
			return number;
		} catch (Exception e) {
			return 0;
		}
	}

    public int getColCount(String sheetName, int rowNum) {
        try {
            sheet = workbook.getSheet(sheetName);
            Row r = sheet.getRow(rowNum);
            int number = r.getLastCellNum();
            return number;
        } catch (Exception e) {
            return 0;
        }
    }

	/*public void setTestDataFolder(String customTestDataFloderFlag) {

		try {

			if (BaseScreen.createFolderIfNotPresent(Constants.CUSTOM_TEST_DATA_FOLDER)) {
				File srcDir = new File(Constants.MAIN_TEST_DATA_PATH);
				File destDir = new File(Constants.CUSTOM_TEST_DATA_FOLDER);
				try {
					FileUtils.copyDirectory(srcDir, destDir);
				} catch (IOException e) {
					System.out.println(e.fillInStackTrace());
				}
			}

			if (customTestDataFloderFlag.equalsIgnoreCase("n")) {
				Constants.TEST_DATA_PATH = Constants.MAIN_TEST_DATA_PATH;
				System.out.println("Using test data from - " + Constants.TEST_DATA_PATH);
			} else {
				Constants.TEST_DATA_PATH = Constants.CUSTOM_TEST_DATA_FOLDER;
				System.out.println("Using test data from - " + Constants.TEST_DATA_PATH);
			}

		} catch (Exception e) {
			System.out.println("Error while setting test data Folder " + e.fillInStackTrace());
		}

	}*/

	public boolean setCellData(String path, String sheetName, String colName, int rowNum, String data, String sResult) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);

			if (rowNum <= 0)
				return false;

			int index = workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;

			sheet = workbook.getSheetAt(index);

			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return false;

			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);

			XSSFCellStyle style = workbook.createCellStyle();
			// set color


			if (cell == null)
				cell = row.createCell(colNum);

			cell.setCellValue(data);

			cell.setCellStyle(style);

			fileOut = new FileOutputStream(path);

			workbook.write(fileOut);

			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public int getCellRowNum(String sheetName, String colName, String cellValue, int colNum) {
		for (int i = 2; i <= getLastRowNumber(sheetName, cellValue, colNum) + 1; i++) {
			if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
				return i;
			}
		}
		return -1;

	}

	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			if (rowNum <= 0)
				return "";

			int index = workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if (index == -1)
				return "";

			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";
			cell = row.getCell(col_Num);

			if (cell == null)
				return "";

			if (cell.getCellType() == CellType.STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {

				String cellText = String.valueOf(cell.getNumericCellValue());

				return cellText;
			} else if (cell.getCellType() == CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist in xls";
		}

	}


}
