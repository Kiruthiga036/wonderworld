package wonderworld;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Griffindor1 {
	 public static void main(String[] args) throws InterruptedException, IOException, AWTException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	 
	  	    driver.navigate().to("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        WebElement search=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
            search.sendKeys("bluetoothspeaker",Keys.ENTER);
            
            WebElement value=driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
            Select s=new Select(value);
            Thread.sleep(2000);
            s.selectByValue("2000");
            Thread.sleep(2000);
            WebElement value1=driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
            Select s1=new Select(value1);
            s1.selectByValue("7000");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
            
            String parentwindow= driver.getWindowHandle();
 	       System.out.println("Parent Window------> "+ parentwindow);
 	       
 	       Set<String> allwindows=driver.getWindowHandles();
 	       System.out.println(allwindows);
 	       for (String id : allwindows) {
 	    	   if(!id.equals(parentwindow)) {
 	    		   driver.switchTo().window(id);
 	    	   }
 	       }
            driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
            Thread.sleep(2000);
            driver.switchTo().window(parentwindow);
            driver.findElement(By.xpath("(//div[@class='zg-M3Z'])[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
            
            Set<String> allwindows1=driver.getWindowHandles();
  	       System.out.println(allwindows1);
  	       for (String id1 : allwindows1) {
  	    	   if(!id1.equals(parentwindow)) {
  	    		   driver.switchTo().window(id1);
  	    	   }
  	       }
  	     driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
  	   Thread.sleep(2000);
  	   driver.switchTo().window(parentwindow);
}
	 
}