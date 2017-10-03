package com.loginpagesetmore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.sun.media.sound.InvalidFormatException;


public class FileHandle {

	public ArrayList<String> testData = new ArrayList<String>();
	public void testValue() throws InvalidFormatException, IOException {
        //fis contains the sheet details in bytestream
		FileInputStream fis = new FileInputStream("/Users/sangeetha/Documents/LoginTestData.xlsx");
		Workbook wb = null;
		try {
			//byte stream into workbook
			wb = WorkbookFactory.create(fis);
		} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sheets containg the exact sheet which is fetched as 0
		Sheet sheets = wb.getSheetAt(0);
		Row rows = null;
		Cell cells = null;

		for (int i = 1; i <= sheets.getLastRowNum(); i++) {
			
			rows = sheets.getRow(i);
			//System.out.println(rows);

			for (int j = 0; j <2; j++) {
				
				if(rows == null)
				{
				  testData.add("");
	
				}
				else
				{
				
				
				cells = rows.getCell(j);
				System.out.println(cells);

				if (cells == null) {
					testData.add("");
				} else {
                    
					testData.add(cells.toString());
					System.out.println(cells.toString());
					
				}
				}
			}

		}
		// System.out.println("value");
		// System.out.println("cellBlank:"+Cell.CELL_TYPE_BLANK);
		
		System.out.println(testData.size());

	}

}
