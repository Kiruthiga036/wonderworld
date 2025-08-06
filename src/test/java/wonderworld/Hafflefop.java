package wonderworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hafflefop {
        public static void main(String[] args) throws IOException {
        	File f=new File("C:\\Users\\ADMIN\\Downloads\\Book1.xlsx");
        	FileInputStream s=new FileInputStream(f);
        	Workbook b=new XSSFWorkbook(s);
        	
        	Sheet y=b.getSheet("Sheet1");
        	
        	Row r=y.getRow(1);
        	
        	Cell c= r.getCell(1);
        	System.out.println(c);
        	
        	
        	int type=c.getCellType();
        	System.out.println("Celltype "+type);
        	
        	if (type==1) {
        	String string=c.getStringCellValue();
        	System.out.println(string);
        } else if(type==0) {
        	if(DateUtil.isCellDateFormatted(c)) {
        		Date d=c.getDateCellValue();
        		SimpleDateFormat sd=new SimpleDateFormat("mm-dd-yyyy"); 
        		String datevalue=sd.format(d);
        		System.out.println("datevalue "+datevalue);
        	}else {
        		double numericCellvalue=c.getNumericCellValue();
        		long l=(long)numericCellvalue;
        		String numbervalue=String.valueOf(1);
        		System.out.println( "numbervalue "+numbervalue);
        	}
        }
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        		/*int rowcount=y.getPhysicalNumberOfRows();
        	System.out.println(rowcount);
        	for (int i=0; i<rowcount; i++) {
        		Row r=y.getRow(i);
        		
         	    
        		
        	int numberofcells=r.getPhysicalNumberOfCells();
        	System.out.println("Cell "+numberofcells);
        	for (int j=0; j<numberofcells; j++) {
        	    Cell cell=r.getCell(j);
        	    System.out.println("Cell Count "+cell);
        	    
        	}	
        	
        	}    	*/
        }
}
