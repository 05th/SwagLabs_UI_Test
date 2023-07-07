package pom;

import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.XPATH, using = ".//input[@name = 'user-name']")
    private SelenideElement usernameField;
    @FindBy(how = How.XPATH, using = ".//input[@name = 'password']")
    private SelenideElement passwordField;
    @FindBy(how = How.XPATH, using = ".//input[@name = 'login-button']")
    private SelenideElement loginButton;

}
