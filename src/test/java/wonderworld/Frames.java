package wonderworld;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	   	 ChromeOptions options=new ChromeOptions();
	   	 options.addArguments("--remote-allow-origins=*");
		  	    WebDriver driver=new ChromeDriver(options);
		  	 
		  	    driver.navigate().to("https://www.flipkart.com/");
		        driver.manage().window().maximize();
		        driver.findElement(By.xpath("(//a[@class=\"_1BJVlg _11MZbx\"])[1]//preceding-sibling::a[@class=\"_3490ry\"]")).click();
}
}