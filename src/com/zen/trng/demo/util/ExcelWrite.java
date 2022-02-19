package com.zen.trng.demo.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void writeExcel(ArrayList<String> arr1,ArrayList<String> arr2) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data"); // creating sheet
		XSSFCell cell1 = null,cell2=null;
		XSSFRow row;
		int rowNum = 0;
		Iterator<String> arrItr1 = arr1.iterator(); // Iterating over the arraylist
		Iterator<String> arrItr2 = arr1.iterator();
		while (arrItr1.hasNext()) {
			if (sheet.getRow(rowNum) == null) {
				row = sheet.createRow(rowNum); // creating row
				if (row.getCell(0) == null) {
					cell1 = row.createCell(0); // creating cell
					cell2 = row.createCell(1); // creating cell
				}
			}else {
				row = sheet.getRow(rowNum); // getting specific row
				cell1 = row.getCell(0); // getting specific cell
				cell2 = row.getCell(1); // getting specific cell
			}
			cell1.setCellValue(arrItr1.next()); // Entering value to the cell
			cell2.setCellValue(arrItr2.next());
			rowNum++;
		}	

		FileOutputStream fileOutputStream = new FileOutputStream("./Output/exceloutput.xlsx");
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		workbook.close();
	}

}
