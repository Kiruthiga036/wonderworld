package wonderworld;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;


public class Utillpackage1 extends  Utillpackage{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 
		  	    launch();
		  	  Properties prop=new Properties();
	    	  prop.load(new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\test.properties"));
	    	 String s= prop.getProperty("URL");
	    	 URL(s);
	    	 maximize();
	    	String currentUrl=getCurrentURL();
	    	 System.out.println(currentUrl);
	    	
	    	 
	    	 String name= prop.getProperty("Friends");
	    	 type(driver.findElement(By.xpath("//input[@type='text']")),name);
	    	 
	    	 String pass= prop.getProperty("Relation");
	    	 type(driver.findElement(By.name("pass")),pass);
	    	 rightclick(driver.findElement(By.xpath("//div[@class='_8ice']")));
	    	 btnclick(driver.findElement(By.xpath("//button[@name='login']")));
	    	
		  	    
		  	 
}
}