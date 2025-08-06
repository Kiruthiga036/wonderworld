package wonderworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class worldintro2 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.msedge.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver1\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new EdgeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();

}
	}

