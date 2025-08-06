package wonderworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class world4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver3\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();


}
}
