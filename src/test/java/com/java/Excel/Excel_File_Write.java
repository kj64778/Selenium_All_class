package com.java.Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_File_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String path = System.getProperty("user.dir");
//		File file = new File(path+"\\Excel\\ExcelFileWrite.xlsx");
//			XSSFWorkbook workbook = new XSSFWorkbook(path+"\\Excel\\ExcelFileWrite.xlsx");
//		
//		XSSFSheet shet = workbook.getSheet("Sheet");
//		
//		Row row = shet.createRow(0);
//		
//		Cell cell = (Cell) row.createCell(0);
//		
//		FileOutputStream output = new FileOutputStream(path+"path+\"\\\\Excel\\\\ExcelFileWrite.xlsx");
//		
//	workbook.write(output);;
//	

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet spreadsheet = workbook.createSheet("Test_Data");
		
		XSSFRow row;
		
		
		int rowid = 0;
		 int cellid = 0;
		row = spreadsheet.createRow(rowid++);
		
		 XSSFCell cell=row.createCell(cellid++);
		
//		Cell cell = row.createCell(cellid++);
		 
		 cell.setCellValue("Hello Tester");
		 
		 
		 FileOutputStream out = new FileOutputStream(
		            new File("D:\\Java workspace\\SeleniumDemo\\Excel\\ExcelFileWrite.xlsx"));
		  
		        workbook.write(out);
		        out.close();
		
		
		

	}

}
