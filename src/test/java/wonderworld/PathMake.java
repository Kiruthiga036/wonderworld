package wonderworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PathMake {
         public static void main(String[] args) throws InterruptedException {
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\wonderworld\\driver\\chromedriver.exe");
        	 ChromeOptions options=new ChromeOptions();
        	 options.addArguments("--remote-allow-origins=*");
 	  	    WebDriver driver=new ChromeDriver(options);
 	  	    driver.navigate().to("https://www.naukri.com/");
 	        driver.manage().window().maximize();
 	       
 	        WebElement registerbtn= driver.findElement(By.id("register_Layer"));
 	        registerbtn.click();
 	      
 	        WebElement mainheader= driver.findElement(By.xpath("//h1[contains(text(),'Create your Naukri profile')]"));
	        String word=mainheader.getText();
	        System.out.println(word);
	        
 	        WebElement name = driver.findElement(By.xpath("//input[@type='text' and @id='name']"));
 	        name.sendKeys("Kiruthiga");
 	       String attribute= name.getAttribute("value");
 	       System.out.println("attribute value---- "+attribute);
 	       
 	        WebElement mail=driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']"));
 	        mail.sendKeys("msprasanth06@gmail.com");
 	       
 	        WebElement password=driver.findElement(By.xpath("//input[@type='password' or @id='password']"));
 	        password.sendKeys("yrsikss67");
 	       String attribute1= password.getAttribute("value");
 	       System.out.println(attribute1);
 	      
 	       WebElement num=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
 	        num.sendKeys("7643380428");
 	      
 	        WebElement experience=driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]"));
 	        experience.click();
 	       
 	        WebElement selectbtn=driver.findElement(By.xpath("//span[@class='chk-label']"));
 	        selectbtn.click();
 	        WebElement registerbutton=driver.findElement(By.xpath("//button[contains(text(),'Register now')]"));
 	        registerbutton.click();
 	        
 	         
         
         }

		
		}

		
		

		
		

