package wonderworld;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink1 {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
         ChromeOptions options=new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
   	   WebDriver driver=new ChromeDriver(options);
         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
         List<WebElement> links=driver.findElements(By.tagName("link"));
         Iterator<WebElement> li=links.iterator();
         while(li.hasNext()) {
        	WebElement lie= li.next();
        	String href=lie.getAttribute("href");
        	if(href.isEmpty() || href==null) {
        		System.out.println("given link is empty or null");
        	}
        	else {
        		try {
					HttpURLConnection http=(HttpURLConnection) (new URL(href)).openConnection();
					http.setRequestMethod("HEAD");
					http.connect();
					int responsecode=http.getResponseCode();
					if(responsecode==200) {
						System.out.println("Link is not broken "+href);
					}
					else {
						System.out.println("Link is broken "+href);
					}
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
         }
     }
}
