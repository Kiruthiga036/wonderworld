package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class PathMake3 {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver3\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new FirefoxDriver();
	  	    driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	        driver.manage().window().maximize();
	        WebElement source=driver.findElement(By.xpath("//*[@id=\"products\"]//li[2]//a"));
	       WebElement destination=driver.findElement(By.xpath("//*[@id=\"amt7\"]//li"));
	       Actions a=new Actions(driver);
	       a.clickAndHold(source).build().perform();
	       Thread.sleep(3000);
	       a.dragAndDrop(source, destination).build().perform();
	  
	       a.contextClick().build().perform();
	       

}
}