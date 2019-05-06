package excelconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconnection {
	
	File fs;
	FileInputStream fis;
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	Row r;
	Cell cell;
	String filepath;
	
	public Excelconnection(String filepath, int sheetnum) {
		this.filepath=filepath;
		fs= new File(filepath);
		try {
			fis = new FileInputStream(fs);
			wb = new XSSFWorkbook(fis);
			sheet1 = wb.getSheetAt(sheetnum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public String excelread(int rownum,int cellnum) {
		
	if(sheet1.getRow(rownum-1).getCell(cellnum-1)==null)
	return null;
	
	else 
		return sheet1.getRow(rownum-1).getCell(cellnum-1).getStringCellValue();
			

		
	}

	public int lastRow() {
		
		return sheet1.getLastRowNum();
		
	}
	
	
		public void setData(int row,int col,String data) throws Throwable
			{  
				
				//sheet1 = wb.getSheetAt(sheetnumber-1);
			    r = sheet1.getRow(row-1);
				cell = r.createCell(col-1);
				cell.setCellValue(data);
				FileOutputStream fileOut = new FileOutputStream(filepath);
				wb.write(fileOut);
				fileOut.close();
			} 

	
}
