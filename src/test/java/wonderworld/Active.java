package wonderworld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Active extends Utillfunctions {

	public static void main(String[]args) throws FileNotFoundException, IOException  {
		launch();
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\screenshot\\test.properties"));
		String K1=prop.getProperty("URL");
		
		URL(K1);
		maximize();
		 String CurrentUrl = driver.getCurrentUrl();
		 System.out.println(CurrentUrl);
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugun\\Downloads\\ch\\chromedriver-win32\\Chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		*/
		//rightclick(driver.findElement(By.xpath("//div[@class='_8ice']"));
		
		
		
}
}