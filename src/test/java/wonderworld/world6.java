package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class world6 {
	 public static void main(String[] args) throws InterruptedException {
  	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
  	   WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.id("usernameField"));
         username.sendKeys("kiruthiga");
        WebElement password =driver.findElement(By.id("passwordField"));
       password.sendKeys("uyihnnn987");
       WebElement show=driver.findElement(By.className("fs13"));
       show.click();
       Thread.sleep(3000);
       WebElement hide=driver.findElement(By.className("fs13"));
       hide.click();
	 }
}
