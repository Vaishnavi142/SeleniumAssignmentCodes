package SeleniumCodeImpSnippets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AccessDataExcel 
{
  @Test
  
	  public void readExcel() throws IOException
		{
				
			File file =  new File("C:\\Users\\VAISHNA\\Downloads\\TestExcelSel.xlsx");
			System.out.println("File opened");
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook excel=  new XSSFWorkbook(inputStream); //xlsx
			//HSSFWorkbook excel= HSSFWorkbook(inputStream); //xls
			XSSFSheet sheet= excel.getSheetAt(0);			
			String data=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Data present in the excel: "+ data);
			XSSFCell data1=sheet.getRow(0).createCell(2);
			data1.setCellValue("Pass");
			XSSFCell data2=sheet.getRow(1).createCell(2);
			data2.setCellValue("Fail");
			FileOutputStream out= new FileOutputStream(file);
			excel.write(out);
			System.out.println("Data present in the excel: "+data1);
			System.out.println("Data present in the excel: "+data2);
			excel.close();
		}
  }

