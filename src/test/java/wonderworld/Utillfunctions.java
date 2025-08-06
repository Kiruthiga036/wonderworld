package wonderworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Utillfunctions {
	

		static WebDriver driver;

		public static void launch() {
	 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");

			ChromeOptions options =new ChromeOptions();

			options.addArguments("--remote-allow-origins=*");

			 driver=new ChromeDriver(options);

		}

		public static void URL(String url) {

			driver.get(url);

		}

		public static void maximize() {

			driver.manage().window().maximize();

		}

		 public static String getCurrentURL() {

			 String CurrentUrl = driver.getCurrentUrl();

			 return CurrentUrl;

		 }
	 
		 public static void type(WebElement ele,String val) {

			 ele.sendKeys(val);

		 }

		 public static void btnclick(WebElement ele) {

			 ele.click();

		 }

		 public static void closeBrowser() {

			 driver.quit();

		 }

		 public static void rightclick(WebElement ele) {

			 Actions a =new Actions(driver);

			 a.contextClick(ele).perform();

		 }

	}
	 

