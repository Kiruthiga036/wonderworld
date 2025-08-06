package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PathMake2 {
	 public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	   WebDriver driver=new ChromeDriver(options);
	  	   
	  	   driver.navigate().to("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	      
	        WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
	        Actions a=new Actions(driver);
	        a.moveToElement(electronics).perform();
	        
	      
	       
	        driver.findElement(By.xpath("//a[text()='Gaming']")).click();
	       
	        
	        
}
}
