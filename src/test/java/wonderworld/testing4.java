package wonderworld;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class testing4 {
	 public static void main(String[] args) throws InterruptedException, IOException, AWTException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	 
	  	    driver.navigate().to("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        
	        
	        WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	        search.sendKeys("nothing",Keys.ENTER);
	        driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
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
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File s=ts.getScreenshotAs(OutputType.FILE);
	        System.out.println(s);
	       
	        File g=new File("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\flipkart1.png");   
	        FileUtils.copyFile(s, g);
	        Actions b=new Actions(driver);
	        b.contextClick().build().perform();
	         Thread.sleep(2000);
	        Robot r=new Robot();
	        r.keyPress(KeyEvent.VK_DOWN);
	         r.keyRelease(KeyEvent.VK_DOWN);
	         Thread.sleep(2000);
	         r.keyPress(KeyEvent.VK_ENTER);
	         r.keyRelease(KeyEvent.VK_ENTER);
	        
	         driver.switchTo().window(parentwindow);
	         WebElement search1= driver.findElement(By.xpath("//input[@class='zDPmFV']"));
             b.keyDown(search1,Keys.CONTROL.BACK_SPACE).sendKeys(search1,"lgtv",Keys.ENTER).keyUp(search1,Keys.CONTROL.BACK_SPACE).build().perform();
         
           driver.findElement(By.xpath("(//div[@class='KzDlHZ' or text()='LG LR57 80 cm (32 inch) HD Ready LED Smart WebOS TV 2025 Edition with | Alpha5 Gen 6 AI Processor | 10...'])[1]")).click();
           Thread.sleep(2000);
           Set<String> allwindows1=driver.getWindowHandles();
	       System.out.println(allwindows1);
	       for (String id : allwindows1) {
	    	   if(!id.equals(parentwindow)) {
	    		   driver.switchTo().window(id);
	    	   }
	       }
	       Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	      
	        TakesScreenshot tk=(TakesScreenshot)driver;
	        File s1=tk.getScreenshotAs(OutputType.FILE);
	        System.out.println(s1);
	       
	        File g1=new File("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\flipkart2.png");   
	        FileUtils.copyFile(s1, g1); 
	        
	        driver.findElement(By.xpath("//span[text()='Place Order']")).click(); 
	        
	      
	        
	        driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']")).sendKeys("9500821949");
	        
	        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();  
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@class='r4vIwl zgwPDa Jr-g+f']")).sendKeys("765456");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
		   
		    
}
}
