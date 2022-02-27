package com.JabaTalks.Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	static String search[] = new String[10];
	static Workbook wb;

	// Function to Read the data values from Excel File
	public String[] readExcel() throws Exception {
		File obj = new File(System.getProperty("user.dir")+"\\resources\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(obj);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		search[0] = sh.getRow(2).getCell(1).toString();
		search[1] = sh.getRow(3).getCell(1).toString();
		search[2] = sh.getRow(4).getCell(1).toString();
		fis.close();
		return search;
	}

}
