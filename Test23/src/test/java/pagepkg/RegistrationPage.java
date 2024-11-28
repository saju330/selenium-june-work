package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;
    

    @FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
    WebElement loginSignupButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[2]/a")
    WebElement newUserButton;

    @FindBy(id = "listowner")
    WebElement listOwner;

    @FindBy(id = "utitle")
    WebElement name;

    @FindBy(id = "umail")
    WebElement email;

    @FindBy(id = "memberpass")
    WebElement password;

    @FindBy(id = "repass")
    WebElement confirmPassword;

    @FindBy(id = "umobile")
    WebElement phone;

    @FindBy(id = "sub_regbutton")
    WebElement createAccountButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void registerNewUser(String username, String userEmail, String userPassword, String userPhone) {
        loginSignupButton.click();
        newUserButton.click();
        listOwner.sendKeys("Builder");
        name.sendKeys(username);
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        confirmPassword.sendKeys(userPassword);
        phone.sendKeys(userPhone);
        createAccountButton.click();
    }
}
