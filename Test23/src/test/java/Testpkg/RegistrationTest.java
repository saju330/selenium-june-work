package Testpkg;





	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import pagepkg.RegistrationPage;
	
	public class RegistrationTest {
		

	
	    WebDriver driver;
	    RegistrationPage registrationPage;

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("http://www.keralaproperty.in");
	        registrationPage = new RegistrationPage(driver);
	    }

	    @Test
	    public void testRegisterNewUser() {
	        registrationPage.registerNewUser("Jayesh", "Jayesh7926@gmail.com", "123456", "1234567890");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}



