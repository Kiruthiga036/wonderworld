package wonderworld;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class PathMake4 {
	 public static void main(String[] args) throws InterruptedException, AWTException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	        Actions b=new Actions(driver);
	         search.sendKeys("mobilephone",Keys.ENTER);
	         Thread.sleep(2000);
	         Robot r=new Robot();
	         r.keyPress(KeyEvent.VK_END);
	         r.keyRelease(KeyEvent.VK_END);
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("(//a[@class='bXmsT+'])[10]")).click();
	         b.contextClick().build().perform();
	         Thread.sleep(2000);
	         r.keyPress(KeyEvent.VK_DOWN);
	         r.keyRelease(KeyEvent.VK_DOWN);
	         Thread.sleep(2000);
	         r.keyPress(KeyEvent.VK_ENTER);
	         r.keyRelease(KeyEvent.VK_ENTER);
	         r.keyPress(KeyEvent.VK_HOME);
	         r.keyRelease(KeyEvent.VK_HOME);
	         
	        
	        
	         
}
}