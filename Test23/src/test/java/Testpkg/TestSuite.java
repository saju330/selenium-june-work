package Testpkg;


	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

import pagepkg.LoginPage;
import pagepkg.RegistrationPage;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class TestSuite {
		
	    WebDriver driver;
	    RegistrationPage registrationPage;
	    LoginPage loginPage;

	    @BeforeSuite
	    public void setUp() {
	        driver = new ChromeDriver();
	        registrationPage = new RegistrationPage(driver);
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testRegisterNewUserAndLogin() {
	        driver.get("http://www.keralaproperty.in");
	        registrationPage.registerNewUser("Jayesh", "Jayesh7926@gmail.com", "123456", "1234567890");

	        driver.get("https://keralaproperty.in/member/login/");
	        loginPage.loginUser("Jayesh", "123456");
	    }

	  
	    }
	



