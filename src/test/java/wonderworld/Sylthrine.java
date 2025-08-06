package wonderworld;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sylthrine {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
   	 ChromeOptions options=new ChromeOptions();
   	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	 
	  	    driver.navigate().to("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
           search.sendKeys("fridge",Keys.ENTER);
           Thread.sleep(2000);
           driver.findElement(By.xpath("(//span[text()='Haier 185 L, 2 Star, Direct-Cool Single Door Refrigerator (HED-19TMS-N, Moon Silver)'])[1]")).click();
         
           WebElement text1=driver.findElement(By.xpath("(//span[text()='Haier 185 L, 2 Star, Direct-Cool Single Door Refrigerator (HED-19TMS-N, Moon Silver)'])[1] "));
           String text=text1.getText();
           System.out.println(text);
           
           String parentwindow= driver.getWindowHandle();
 	       System.out.println("Parent Window------> "+ parentwindow);
 	       
 	       Set<String> allwindows=driver.getWindowHandles();
 	       System.out.println(allwindows);
 	       for (String id : allwindows) {
 	    	   if(!id.equals(parentwindow)) {
 	    		   driver.switchTo().window(id);
 	    	   }
 	       }
           driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
           
           Thread.sleep(2000);
           
           driver.switchTo().window(parentwindow);
           
           driver.findElement(By.xpath("(//span[text()='Haier 165 L, 1 Star, Direct-Cool Single Door Refrigerator (HED-171RS-P, Red Mono)'])[1]")).click();
           WebElement text2=driver.findElement(By.xpath("//span[text()='10,990']"));
           String textele=text2.getText();
           System.out.println(textele);
           
 	       Set<String> allwindows1=driver.getWindowHandles();
 	       System.out.println(allwindows1);
 	       for (String id1 : allwindows1) {
 	    	   if(!id1.equals(parentwindow)) {
 	    		   driver.switchTo().window(id1);
 	    	   }
 	       }
           driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
           
           Thread.sleep(2000);
          
           
           driver.switchTo().window(parentwindow);
           
           driver.findElement(By.xpath("(//span[text()='Haier 185 L, 2 Star, Direct-Cool Single Door Refrigerator (HED-19TMS-N, Moon Silver)'])[2]")).click();
           Thread.sleep(2000);
           
           WebElement text3=driver.findElement(By.xpath("//span[text()='2 Star']"));
           Thread.sleep(2000);
           String textelem=text3.getText();
           System.out.println("Star Rating "+textelem);
           
           Set<String> allwindows2=driver.getWindowHandles();
 	       System.out.println(allwindows2);
 	       for (String id2 : allwindows2) {
 	    	   if(!id2.equals(parentwindow)) {
 	    		   driver.switchTo().window(id2);
 	    	   }
 	       }
          
           driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
           
           Thread.sleep(2000);
           
           //driver.findElement(By.xpath("(//input[@class='a-button-input'])[17]")).click();
           //driver.switchTo().window(parentwindow);
           
}
 	       }
	
	