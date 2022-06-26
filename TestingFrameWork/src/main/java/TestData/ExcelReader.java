package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String excelFilePath=System.getProperty("user.dir")+"\\TestDataArea\\TestData.xlsx";
	
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	File file = new File(excelFilePath);
	FileInputStream inputStream = new FileInputStream(file);
	public ExcelReader() throws IOException
	{
		workBook= new XSSFWorkbook(inputStream);
	}
	public String getTestData(String sheetName,int rowNum,int colNum)
	{
		sheet=workBook.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		
		return cell.getStringCellValue();
	}
	public int getIntegerTestData(String sheetName,int rowNum,int colNum)
	{
		sheet=workBook.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		int cellValue=(int) cell.getNumericCellValue();
		return cellValue;
	}
}
