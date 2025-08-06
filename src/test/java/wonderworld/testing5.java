package wonderworld;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testing5 {
	 public static void main(String[] args) throws InterruptedException, IOException, AWTException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	 
	  	    driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
	        driver.manage().window().maximize();
	        Robot r=new Robot();
	        r.keyPress(KeyEvent.VK_PAGE_DOWN);
	        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        
	        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	        String parentwindow= driver.getWindowHandle();
		       System.out.println("Parent Window------> "+ parentwindow);
		       
		       Set<String> allwindows=driver.getWindowHandles();
		       System.out.println(allwindows);
		       for (String id : allwindows) {
		    	   if(!id.equals(parentwindow)) {
		    		   driver.switchTo().window(id);
		    	   }
		       }
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.close();
	        driver.switchTo().window(parentwindow);
	        
	        driver.findElement(By.xpath("(//button[@class='whButtons'])[2]")).click();
	        Thread.sleep(3000);  
	        
	        driver.switchTo().window(parentwindow);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
	        Set<String> allwindows1=driver.getWindowHandles();
		       System.out.println(allwindows1);
		       for (String id : allwindows1) {
		    	   if(!id.equals(parentwindow)) {
		    		   driver.switchTo().window(id);
		    	   }
		       }
		       driver.manage().window().maximize();
		       Thread.sleep(3000);
		       driver.close();
		       
		       driver.switchTo().window(parentwindow);
		       
		       driver.findElement(By.xpath("(//button[@class='whButtons' or @id='newTabsBtn'])[4]")).click();
		     
		       driver.switchTo().window(parentwindow);
		       Thread.sleep(3000);
		      
		       driver.findElement(By.xpath("(//button[@class='whButtons' or @id='newTabsBtn'])[5]")).click();
		       Thread.sleep(2000);
		       driver.switchTo().window(parentwindow);
		       Thread.sleep(2000);
		       driver.quit();
		       
	 }	       
}