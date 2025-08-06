package wonderworld;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class testing2 {
	 public static void main(String[] args) throws InterruptedException, AWTException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://demoqa.com/select-menu");
	        driver.manage().window().maximize();
	        WebElement button1=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	        Select s=new Select(button1);
	        boolean c=s.isMultiple();
	        System.out.println(c);
	       // s.selectByIndex(2);
	       // s.selectByValue(Audi);
	        s.selectByVisibleText("Volvo");
	       
	        
	        
	        
	        
	        
	        
	        
	        
	       
}

}