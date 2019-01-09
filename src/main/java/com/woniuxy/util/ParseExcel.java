package com.woniuxy.util;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ParseExcel {

	public static void parseExcel(String path) {
		try {
			Workbook workbook = Workbook.getWorkbook(new File(path));
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			int columns = sheet.getColumns();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					Cell cell = sheet.getCell(j, i);
					String contents = cell.getContents();
					System.out.print(contents+"  ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
