package pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private final String baseUrl = "https://www.saucedemo.com/";

    //Xpath locators
    @FindBy(how = How.XPATH, using = ".//input[@name = 'user-name']")
    private SelenideElement usernameField;
    @FindBy(how = How.XPATH, using = ".//input[@name = 'password']")
    private SelenideElement passwordField;
    @FindBy(how = How.XPATH, using = ".//input[@name = 'login-button']")
    private SelenideElement loginButton;

    //Method set Username
    public void setUsername (String username){
        usernameField.setValue(username);
    }
    //Method set Password
    public void setPassword (String password){
        passwordField.setValue(password);
    }
    //Method click login Button
    public void clickLoginButton(){
        loginButton.click();
    }

    //Method authorization
    public void login (String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}