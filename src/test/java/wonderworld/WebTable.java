package wonderworld;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends Utillpackage{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	   	 
  	    launch();
  	    URL("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
  	    maximize();
  	    List<WebElement> tables=driver.findElements(By.tagName("table"));
  	    int size=tables.size();
  	    System.out.println("Table Size "+size);
  	    
  	    WebElement table1=tables.get(1);
  	    List<WebElement> tablerows=table1.findElements(By.tagName("tr"));
  	    int rowsize=tablerows.size();
  	    System.out.println("Row Size "+rowsize);
  	    
  	    WebElement trow1=tablerows.get(0);
	    List<WebElement> theaders=trow1.findElements(By.tagName("th"));
	    int theadersize =theaders.size();
	    System.out.println("Header size "+theadersize);
	    System.out.println("................................................................");     
  	 
	    for(int k=0; k<rowsize; k++) {
	    	WebElement headerrow=tablerows.get(k);
	    	List<WebElement> eachdata1=headerrow.findElements(By.tagName("th"));
	    	int datasize1=eachdata1.size();
	    	for(int j=0;j<datasize1; j++) {
	    		WebElement data=eachdata1.get(j);
	    		String text=data.getText();
	    		System.out.println("Topic List  "+text);
	    	}
	    }
	    
  
  	System.out.println("................................................................"); 
  	 for(int k=2; k<6; k++) {
	    	WebElement headerrow=tablerows.get(k);
	    	List<WebElement> eachdata1=headerrow.findElements(By.tagName("td"));
	    	int datasize1=eachdata1.size();
	    	for(int j=0;j<datasize1; j++) {
	    		WebElement data=eachdata1.get(j);
	    		String text=data.getText();
	    		System.out.println(text);
	    	}
	    }
  	    
  	    
 	System.out.println("................................................................");  
 	
 	for(int k=2; k<3; k++) {
    	WebElement headerrow=tablerows.get(k);
    	List<WebElement> eachdata1=headerrow.findElements(By.tagName("td"));
    	int datasize1=eachdata1.size();
    	for(int j=0;j<datasize1; j++) {
    		WebElement data=eachdata1.get(j);
    		String text=data.getText();
    		System.out.println("Bhurj kalifa");
      		System.out.println(text);
    		
    		
    		}
    	}
    
 	System.out.println("................................................................"); 	
	
	
 	 for(int k=2; k<rowsize; k++) {
	    	WebElement headerrow=tablerows.get(k);
	    	List<WebElement> eachdata1=headerrow.findElements(By.tagName("td"));
	    	int datasize1=eachdata1.size();
	    	for(int j=0;j<datasize1; j++) {
	    		WebElement data=eachdata1.get(j);
	    		String text=data.getText();
	    		if(text.equals("Saudi Arabia")) {
	    			System.out.println(text);
	    			System.out.println("Row no "+(k+1));
	    			System.out.println("column no "+(j+1));
	    		}
	    	}
	    }
 	
	 
	//if(text.equals("Saudi Arbaia")) {
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	/*for(int i=2; i<3; i++) {
	    	WebElement eachrow=tablerows.get(i);
	    	List<WebElement> eachdata=eachrow.findElements(By.tagName("td"));
	    	int datasize=eachdata.size();
	    	for(int j=0;j<datasize; j++) {
	    		WebElement data=eachdata.get(j);
	    		String text=data.getText();
	    		System.out.println(text);
	    	}
	    }*/
	    
 	/* System.out.println("................................................................");  
	  for(int k=0; k<2; k++) {
    	WebElement headerrow=tablerows.get(k);
    	List<WebElement> eachdata1=headerrow.findElements(By.tagName("td"));
    	int datasize1=eachdata1.size();
    	for(int j=0;j<datasize1; j++) {
    		WebElement data=eachdata1.get(j);
    		String text=data.getText();
    		System.out.println("Total "+text);
    	}
    }*/
  	    
  	 /*   WebElement trow1=tablerows.get(0);
  	    List<WebElement> theaders=trow1.findElements(By.tagName("td"));
  	    int theadersize =theaders.size();
  	    System.out.println(theadersize);
  	  WebElement thead1=theaders.get(2);
  	    String text= thead1.getText();
  	    System.out.println(text);*/
}
}