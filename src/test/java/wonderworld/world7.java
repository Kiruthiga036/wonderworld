package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class world7 {
	 public static void main(String[] args) throws InterruptedException   {
	  	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://www.naukri.com/");
	        driver.manage().window().maximize();
	        WebElement skillname= driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]"));
	        skillname.sendKeys("Testing Manager");
	        WebElement search= driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
	        search.click();
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        driver.navigate().back();
	        WebElement location=driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
	        location.sendKeys("Bangalore");
	        Thread.sleep(3000);
	        driver.close();
	         

}

	
		
	}

