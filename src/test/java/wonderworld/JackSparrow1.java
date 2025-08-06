package wonderworld;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JackSparrow1 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	   	 ChromeOptions options=new ChromeOptions();
	   	 options.addArguments("--remote-allow-origins=*");
		  	    WebDriver driver=new ChromeDriver(options);
		  	 
		  	    driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		        driver.manage().window().maximize();
		        WebElement text=driver.findElement(By.xpath("//h3[text()='iFrame will not show if you have adBlock extension enabled']"));
		        JavascriptExecutor jk=(JavascriptExecutor)driver;
		        jk.executeScript("arguments[0].scrollIntoView(true)", text);
		        WebElement image=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		        driver.switchTo().frame(image);
		        WebElement image1=driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
		        image1.click();
}
}