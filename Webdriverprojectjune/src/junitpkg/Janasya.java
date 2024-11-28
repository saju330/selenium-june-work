package junitpkg;

import java.util.List;
import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;



public  class Janasya {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://janasya.com/");
		
		
	}
	@Test
	
	public void OpenJanasyaAndClickSaaga() throws IOException
	{
		//scroll the mouse to the new option
		WebElement ele = driver.findElement(By.xpath("//summary[normalize-space()='New']"));
		Actions action =new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		//click on saaga 
		driver.findElement(By.linkText("Saaga")).click();
		
		//count the number of links in the page
		List<WebElement> total_Links = driver.findElements(By.tagName("a"));
		int count = total_Links.size();
		System.out.println("The number of links available in this page: "+count);
		
		//verify the total number of links against the expected number of links
		int expected_number_of_links = 400; //Replace with the expected number of links
		if (count == expected_number_of_links)
		{
		  System.out.println("Test passed! Found"+count+"links.");
		}
		  else
		  {
			  System.out.println("Test Failed! Expected"+ expected_number_of_links+"links,but found"+ count+".");
		  }
		
		//takeScreenshot shot of the webpage
	   	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   	FileHandler.copy(src,new File("C:Screenshot021.png"));
        
		
	
	}
		

        			  
	}



