package wonderworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel2 {
	public static void main(String[] args) throws IOException {
    	File f=new File("C:\\Users\\ADMIN\\Downloads\\Book1.xlsx");
    	FileInputStream s=new FileInputStream(f);
    	Workbook b=new XSSFWorkbook(s);
    	Sheet y=b.getSheet("Sheet1");
    	Row r=y.getRow(0);
    	Cell c= r.getCell(0);
    	System.out.println(c);
    	String actualvalue=c.getStringCellValue();
    	if (actualvalue.equals("Pink")) {
    	   c.setCellValue("Black");	
    	}
    	FileOutputStream fileoutput=new FileOutputStream(f);
    	b.write(fileoutput);
    	System.out.println("Updated Suceessfully");
    	
    	
    	
		  	 
		  	   

}
}