package wonderworld;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
    	File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\sample1.xlsx");
    	
    	Workbook b=new XSSFWorkbook();
    	Sheet y=b.createSheet("Sheet1");
    	Row r=y.createRow(0);
    	Cell c= r.createCell(0);
    	c.setCellValue("Hi friends");
    	FileOutputStream filestream=new FileOutputStream(f);
    	b.write(filestream);
    	System.out.println("Updated");
    	
    	
}
}