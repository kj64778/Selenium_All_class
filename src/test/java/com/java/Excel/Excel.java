package com.java.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");

		XSSFWorkbook xw = new XSSFWorkbook("D:\\Java workspace\\TestNG\\Excel\\Excel2nd.xlsx");

		XSSFSheet xs = xw.getSheet("Sheet1");

		System.out.println(xs.getPhysicalNumberOfRows());

		System.out.println(xs.getRow(0).getPhysicalNumberOfCells());

		System.out.println(xs.getRow(1).getCell(0).getStringCellValue());
		
		
	}

}
