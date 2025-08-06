package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PathMake1 {
	 public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
    	 ChromeOptions options=new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
	  	    WebDriver driver=new ChromeDriver(options);
	  	    driver.navigate().to("https://www.oracle.com/in/artificial-intelligence/generative-ai/");
	        driver.manage().window().maximize();
	        WebElement javatext =driver.findElement(By.xpath("(//a[@class='aria-a'])[1]"));
	        String print=javatext.getText();
	        System.out.println(print);
	       String attribute=javatext.getAttribute("href");
	       System.out.println(attribute);
	      

}

	
}