package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By checkOutButton = By.xpath("//button[@id = 'checkout']");
    private By continueShoppingButton = By.xpath("//button[@id = 'continue-shopping']");

}
