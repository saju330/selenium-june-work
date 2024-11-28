package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
	
		//chromedriver
		//edgedriver
		//firefoxdriver
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com"); 
		
		String actualtitle =driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
		    System.out.println	("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
		
		

	} 

}
