package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    //Locators
    private By usernameField = By.xpath(".//input[@name = 'user-name']");

    private By passwordField = By.xpath(".//input[@name = 'password']");

    private By loginButton = By.xpath(".//input[@name = 'login-button']");



    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method set Username
    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    //Method set Password
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    //Method click login Button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    //Method login
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}