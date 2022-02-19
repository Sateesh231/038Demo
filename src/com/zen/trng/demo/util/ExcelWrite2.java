package com.zen.trng.demo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	
	public static void output1(String[] name, String[] price) {
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Products");
		for (int i = 0; i < 3; i++) {
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(name[i]);
			row.createCell(1).setCellValue(price[i]);
		}

		sheet.autoSizeColumn(0);
		
		//Writing the output to Excel file using FileOutputStream
		try {
			fos = new FileOutputStream("./Output/Products.xlsx");
			workbook.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
