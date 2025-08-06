package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class world8 {
	 public static void main(String[] args) throws InterruptedException   {
	  	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	  	   WebDriver driver=new ChromeDriver(options);
	  	 driver.navigate().to("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	        WebElement login= driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
	        login.click();
	        WebElement windowbtn=driver.findElement(By.xpath( "//a[@class='azBkHf']"));
	        windowbtn.click();
	        WebElement number= driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	        number.sendKeys("7548867476");
	        WebElement continuebtn= driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
	        continuebtn.click();
	        
	        
	 }
}
