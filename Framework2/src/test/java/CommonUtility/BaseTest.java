package CommonUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class BaseTest {

		public static WebDriver driver=null;


	public void getData(String excelSheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelSheetName);

		//to store rows count
		int totalrows = sheetname.getLastRowNum();
		System.out.println("R-count: " + totalrows);

		//To Store colimn count
		Row rowcell = sheetname.getRow(0);
		int totalcolumn = rowcell.getLastCellNum();
		System.out.println("C-count: " + totalcolumn);

		//Data formatter to make data common
		DataFormatter format = new DataFormatter();

		String testData[][] = new String[totalrows][totalcolumn];
		//i=row, j=column
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcolumn;j++)
			{
				testData[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j)) ;
				//System.out.println(testData[i-1][j]);
			}
		}

		System.out.println(testData[0][0]);
	}


	public String dataSelect(String key) throws IOException
	{
		FileReader srcFile = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\PropertFile\\cred.properties");

		Properties pt = new Properties();
		pt.load(srcFile);
		String value=pt.getProperty(key);
		return value;
	}


	public static void SelectDatafromExcel() throws IOException
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet("Sheet1");

		//to store rows count
		int totalrows = sheetname.getLastRowNum();
		System.out.println("R-count: " + totalrows);

		//To Store colimn count
		Row rowcell = sheetname.getRow(0);
		int totalcolumn = rowcell.getLastCellNum();
		System.out.println("C-count: " + totalcolumn);

		//Data formatter to make data common
		DataFormatter format = new DataFormatter();

		String testData[][] = new String[totalrows][totalcolumn];
		//i=row, j=column
		for(int r=1;r<=totalrows;r++)
		{
			for(int c=0;c<totalcolumn;c++)
			{
				testData[r-1][c]=format.formatCellValue(sheetname.getRow(r).getCell(c)) ;
				//System.out.println(testData[i-1][j]);
				//map.put(null, null)
			}
		}
	}
	
}




