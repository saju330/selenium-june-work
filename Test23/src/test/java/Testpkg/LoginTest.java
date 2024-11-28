package Testpkg;





	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import pagepkg.LoginPage;

	public class LoginTest {

	    WebDriver driver;
	    LoginPage loginPage;

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://keralaproperty.in/member/login/");
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testUserLogin() {
	        loginPage.loginUser("Jayesh", "123456");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}


