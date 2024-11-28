package pagepkg;

	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	    WebDriver driver;

	    @FindBy(id = "ulogin")
	    WebElement username;

	    @FindBy(id = "upass")
	    WebElement password;

	    @FindBy(id = "sub_logbtn")
	    WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void loginUser(String userUsername, String userPassword) {
	        username.sendKeys(userUsername);
	        password.sendKeys(userPassword);
	        loginButton.click();
	    }
	}



