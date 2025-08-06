package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class testing1 {
	 public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://demoqa.com/select-menu");
	        driver.manage().window().maximize();
	        WebElement colour=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	        Select s=new Select(colour);
	       // s.selectByIndex(7);
	       // s.selectByValue("4");
	        s.selectByVisibleText("Blue");
	        
	        boolean multi=s.isMultiple();
	        System.out.println(multi);
	        
}
}