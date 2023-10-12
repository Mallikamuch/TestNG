package com.app.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
String excelfilepath = "C:\\Users\\sonal\\Desktop\\mytestdata\\testdata1.xlsx";


// Give the location of  the file

File excelfile = new File(excelfilepath);

// fetch the file

FileInputStream fis = new FileInputStream(excelfile);

// Create object of the workbook

XSSFWorkbook workbook = new XSSFWorkbook(fis);

// fetch the sheet from the workbook ==> give the correct sheet name

   XSSFSheet sheet = workbook.getSheet("Sheet1");

   
   
  int rows = sheet.getLastRowNum();
  
  System.out.println("number of rows" + rows);
  
  
  
  int col = sheet.getRow(1).getLastCellNum();
  
  System.out.println("number of columns" + col);
  
 
  
  for(int r=0; r<rows;r++)
  {
	  
	XSSFRow row = sheet.getRow(r);
	
	  
	  for(int c=0;c<col;c++)
	  {
		 XSSFCell cell = row.getCell(c);
		
		 
		CellType cellType = cell.getCellType();
		
		switch(cellType)
		{
		case STRING:
		System.out.print(cell.getStringCellValue());
		break;
		case NUMERIC:
			System.out.print(cell.getNumericCellValue());
			break;
		}
		
		System.out.println(" ");
	  }
	  
	  System.out.println();
  }
  
  
 workbook.close();		

	}

}
