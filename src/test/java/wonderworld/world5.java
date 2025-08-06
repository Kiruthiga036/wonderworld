package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class world5 {
       public static void main(String[] args) throws InterruptedException {
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
          ChromeOptions options=new ChromeOptions();
          options.addArguments("--remote-allow-origins=*");
    	   WebDriver driver=new ChromeDriver(options);
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
         WebElement username= driver.findElement(By.id("email"));
         username.sendKeys("Kiruthiga");
         WebElement password =driver.findElement(By.name("pass"));
         password.sendKeys("uyihnnn987");
         Thread.sleep(3000);
         WebElement loginbtn=driver.findElement(By.name("login"));
         loginbtn.click();
       
       }
}
