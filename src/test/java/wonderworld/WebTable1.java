package wonderworld;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable1 extends Utillpackage {
	static int rowsize1=0;
	static int columnsize=0;
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 
  	    launch();
  	    URL("https://demo.guru99.com/test/web-table-element.php");
  	    maximize();
  	    List<WebElement> tableheader=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
  	    int columnsize=tableheader.size();
  	    System.out.println("Header size "+columnsize);
  	    
  	    List<WebElement> rowsize=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
  	    int rowsize1=rowsize.size();
  	    System.out.println("RowSize "+rowsize1);
  	    
  	   /* for(int i=1; i<=rowsize1; i++) {
  	    	 for(int j=1; j<=columnsize; j++) {
  	    		WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
  	    	String text=eachele.getText();
  	    	if(text.contains("Ujjivan Financial")) {
  	    		System.out.println(text);
  	    		System.out.println("Row size "+i);
  	    		rowsize1=i;
  	    		System.out.println("columnsize "+j);
  	    		columnsize=j;
  	    	}
  }
  	      }
  	    System.out.println("..................................................");
  	    
  	    for(int i=1; i<rowsize1; i++) {
  	    	WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+columnsize+"]"));
  	    	String text=eachele.getText();
  	    	System.out.println(text);
  	    }
  	    
  	  System.out.println("..................................................");
  	  
  	  for(int j=1; j<=5; j++) {
  		 WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+rowsize1+"]//td["+j+"]"));
	    	String text2=eachele.getText();
	    	System.out.println(text2);
  	  }*/
  	    

  	 WebElement company=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Company']"));
  	 WebElement group=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Group']"));
  	 WebElement prev=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Prev Close (Rs)']"));
  	 WebElement current=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Current Price (Rs)']"));
  	 WebElement change=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='% Change']"));
  	 
  	    int companyIndex= tableheader.indexOf(company)+1;
  	    int groupIndex= tableheader.indexOf(group)+1;
  	    int prevIndex= tableheader.indexOf(prev)+1;
  	    int currentIndex= tableheader.indexOf(current)+1;
  	    int changeIndex= tableheader.indexOf(change)+1;
  	    
  	  for(int j=1; j<=rowsize1; j++) {
   		 WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]//td["+companyIndex+"]"));
 	    	String text2=eachele.getText();
 	    	System.out.println(text2);
   	  }
  	 System.out.println("..................................................");
  	 
  	for(int j=1; j<=rowsize1; j++) {
  		 WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]//td["+groupIndex+"]"));
	    	String text2=eachele.getText();
	    	System.out.println(text2);
  	}
  	System.out.println("..................................................");
  	for(int j=1; j<=rowsize1; j++) {
 		 WebElement eachele= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]//td["+currentIndex+"]"));
	    	String text2=eachele.getText();
  		    	System.out.println(text2);
  	}
}
}