package com.java.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String path = System.getProperty("user.dir");
		
		XSSFWorkbook xwpath = new XSSFWorkbook(path+"\\Excel\\\\TestCase.xlsx");
		
		XSSFSheet sheet = xwpath.getSheet("Header Section");
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		
		System.out.println("-----------Search to Heder name---------------------------------- ");
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(0).getCell(2));
		System.out.println(sheet.getRow(0).getCell(3));
		System.out.println(sheet.getRow(0).getCell(4));
		System.out.println(sheet.getRow(0).getCell(5));
		System.out.println(sheet.getRow(0).getCell(6));
		
		
		System.out.println("--------------------cell no D4--------------------------");
		
		System.out.println(sheet.getRow(3).getCell(3));
		
		
		System.out.println("--------------------cell no E20--------------------------");
		
		System.out.println(sheet.getRow(19).getCell(4));
		
		
//		sheet.createTable();
		System.out.println(sheet.createTable());
		
		
		//Active Cell Location
//		sheet.getActiveCell();
		System.out.println(sheet.getActiveCell());
		
//		sheet.getProtect();
		System.out.println(sheet.getProtect());
		
		
//		sheet.setSheetPassword("123", null);
		
		
		System.out.println("-------------Sheet 2-------------------");
		XSSFSheet sheet2 = xwpath.getSheet("Footer Section");
		
		System.out.println(sheet2.getPhysicalNumberOfRows());
		System.out.println(sheet2.getRow(0).getPhysicalNumberOfCells());
		
		int rowcount = sheet2.getLastRowNum()-sheet2.getFirstRowNum();
		
		
		
		for(int i=0; i<rowcount; i++) {
			
			int cellcount = sheet2.getRow(i).getLastCellNum();
			
			for(int j=0; j<cellcount; j++) {
				System.out.print(sheet2.getRow(i).getCell(j));
			}
			System.out.println();
		}
		
		
		
	}

}
