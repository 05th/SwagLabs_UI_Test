package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
 private WebDriver driver;
 private By closeMenuButton = By.xpath("//button[@id = 'react-burger-cross-btn']");
 private By allItemsLink = By.xpath("//a[@id = 'inventory_sidebar_link']");
 private By aboutLink = By.xpath("//a[@id = 'about_sidebar_link']");
 private By logOutLink = By.xpath("//a[@id = 'logout_sidebar_link']");
 private By resetAppLink = By.xpath("//a[@id = 'reset_sidebar_link']");

}
