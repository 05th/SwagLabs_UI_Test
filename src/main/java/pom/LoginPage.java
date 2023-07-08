package pom;

import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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