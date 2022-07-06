package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

public class TestUtil {
	
		public static long PAGE_LOAD_TIME=20;
		public static long IMPLICT_WAIT=40;
		public static String TestData_Sheet_Path="C:\\Users\\eclipse-workspace\\Aulas_Project\\src\\main\\java\\testData\\TestData.xlsx";
		static Workbook book;
		static Sheet sheet;
		static JavascriptExecutor js;
		
		public static Object[][] getTestData(String sheetName)
		{
			FileInputStream fis = null;
			try
			{
				fis = new FileInputStream(TestData_Sheet_Path);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			try
			{
				book = WorkbookFactory.create(fis);
			}
			catch(InvalidFormatException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			sheet=book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++)
			{
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
				{
					data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				}
			}
			return data;
		}

	}

