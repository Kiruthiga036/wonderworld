package wonderworld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class excelwrite3 {
      public static void main(String[] args) throws FileNotFoundException, IOException {
    	  Properties prop=new Properties();
    	  prop.load(new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\test.properties"));
    	 String s= prop.getProperty("Friends");
    	 System.out.println(s);
    	 String ss= prop.getProperty("Relative");
    	 System.out.println(ss);
}
}