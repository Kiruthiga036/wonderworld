package wonderworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class worldintro1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	
	//driver.get("https://www.flipkart.com/");
	//driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().refresh();
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.close();
	
	
	}

}
