package junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;


	public class Amazon1 {
	    EdgeDriver driver;
	    @Before
	    public void setUp()
	    {
	    
	    	driver=new EdgeDriver();
	    	driver.get("https://www.amazon.in/");
	    	driver.manage().window().maximize();
	    }
	
	    
	    @Test
	    public void Amazon()
	    {
	            // Click on the 'Mobiles' option
	            WebElement mobilesLink = driver.findElement(By.xpath("(//a[normalize-space()='Mobiles'])[1]"));
	            mobilesLink.click();

	            // Select a mobile phone from the list
	            WebElement Productlink = driver.findElement(By.xpath("(//img[@alt='heroalt1'])[1]"));
	            Productlink.click();
	            
	     
	            //click on cart add to cart button
	            driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	            
	            
	           //click on cart button
	            driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	            
	            //click on cart icon 
	            driver.findElement(By.id("nav-cart-count")).click();
	            
	            driver.findElement(By.id("nav-link-accountList")).click();
	   
	            
	            	
	            
	       	
	          
	      }	
	         
	        
	         }
	
	

		
	



