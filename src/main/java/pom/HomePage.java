package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PrivateKey;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private final By logoApp = By.xpath(".//div[@class = 'app_logo']");
    private final By soppingCart = By.xpath(".//a[@class = 'shopping_cart_link']");

    // Goods
    private final By item0 = By.xpath(".//div[contains(text(), 'Sauce Labs Bike Light')]");
    private final By item1 = By.xpath(".//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]");
    private final By item2 = By.xpath(".//div[contains(text(), 'Sauce Labs Onesie')]");
    private final By item3 = By.xpath(".//div[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]");
    private final By item4 = By.xpath(".//div[contains(text(), 'Sauce Labs Backpack')]");
    private final By item5 = By.xpath(".//div[contains(text(), 'Sauce Labs Fleece Jacket')]");

    //Buttons "add"
    private final By addButton0 = By.xpath(".//button[@id = 'add-to-cart-sauce-labs-bike-light'");
    private final By addButton1 = By.xpath(".//button[@id = 'add-to-cart-sauce-labs-bolt-t-shirt'");
    private final By addButton2 = By.xpath(".//button[@id = add-to-cart-sauce-labs-onesie'");
    private final By addButton3 = By.xpath(".//button[@id = 'add-to-cart-sauce-labs-bike-light'");
    private final By addButton4 = By.xpath(".//button[@id = 'add-to-cart-sauce-labs-bike-light'");
    private final By addButton5 = By.xpath(".//button[@id = 'add-to-cart-sauce-labs-bike-light'");

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextLogoApp() {
        return driver.findElement(logoApp).getText();
    }

    public void clickOnItem() {
        driver.findElement(item0).click();
    }


    //Methods
    public void addItemToCard () {
        driver.findElement(addButton0).click();
    }

}