package wonderworld;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blackpearl {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
   	 ChromeOptions options=new ChromeOptions();
   	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	 
	  	    driver.navigate().to("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        WebElement endpage=driver.findElement(By.xpath("//a[text()='Twitter']"));
	        JavascriptExecutor j=(JavascriptExecutor)driver;
	        j.executeScript("arguments[0].scrollIntoView(true)", endpage);
	       WebElement header= driver.findElement(By.xpath("//span[text()='Air conditioners']"));
	       Thread.sleep(2000);
	        j.executeScript("arguments[0].scrollIntoView(false)", header);
	        
}
}