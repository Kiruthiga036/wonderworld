package wonderworld;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class jacksparrow {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	   	 ChromeOptions options=new ChromeOptions();
	   	 options.addArguments("--remote-allow-origins=*");
		  	    WebDriver driver=new ChromeDriver(options);
		  	 
		  	    driver.navigate().to("https://www.facebook.com/");
		        driver.manage().window().maximize();
		        
		        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		        String attribute=name.getAttribute("value");
		        System.out.println("Name "+attribute);
		        JavascriptExecutor j=(JavascriptExecutor)driver;
		        j.executeScript("arguments[0].setAttribute('value','kiruthiga')",name);
		       Object script= j.executeScript("return arguments[0].getAttribute('value')", name);
		       System.out.println(script);
		        
}
}