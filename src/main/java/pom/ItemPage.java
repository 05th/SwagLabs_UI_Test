package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private WebDriver driver;

    private By backToProductsButton = By.xpath("//button[@id = 'back-to-products']");
    private By addToCartButton = By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']");

}
