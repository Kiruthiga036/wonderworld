package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testing3 {
	 public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://practice.expandtesting.com/dropdown");
	        driver.manage().window().maximize();
	        WebElement optionbtn=driver.findElement(By.xpath("//select[@id='dropdown']"));
	        Select s=new Select(optionbtn);
	        s.selectByValue("1");
	        WebElement number=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
	        Select r1=new Select(number);
	        r1.selectByIndex(3);
	        WebElement countrybtn=driver.findElement(By.id("country"));
	        Select r2=new Select(countrybtn);
	        r2.selectByVisibleText("Iceland");
	        
	        

}
}
