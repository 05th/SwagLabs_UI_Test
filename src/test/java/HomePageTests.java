import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.CartPage;
import pom.HomePage;
import pom.LoginPage;

import static org.hamcrest.CoreMatchers.is;
public class HomePageTests {

    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CartPage cartPage = new CartPage(driver);
    private String username;
    private String password;

    @Before
    public void setUp() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    @DisplayName("Check logo name in header")
    public void checkLogoNameInHeader() {
        String actualResult = homePage.getTextLogoApp();
        String expectedResult = "Swag Labs";
        MatcherAssert.assertThat(actualResult, is(expectedResult));
    }
    @Test
    @DisplayName("Check the Item can be added in cart")
    public void checkTheItemAddedInCart() {
        homePage.clickOnItem();


    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
