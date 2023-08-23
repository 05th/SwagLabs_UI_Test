import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import pom.HomePage;
import pom.LoginPage;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LoginPageTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    //HomePage homePage = new HomePage(driver);
    private final String username;
    private final String password;
    private final boolean result;

    //Constructor
    public LoginPageTest(String username, String password, boolean result) {
        this.username = username;
        this.password = password;
        this.result = result;
    }

    //Input test data
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"standard_user", "secret_sauce", true},
                {"locked_out_user", "secret_sauce", false},
                {"problem_user", "secret_sauce", true},
                {"performance_glitch_user", "secret_sauce", true},
        };
    }

    //Open page
    @Before
    public void openPage() {
        driver.get("https://www.saucedemo.com/");
    }

    //Login method
    @Test
    public void loginTest() {
        loginPage.login(username, password);
        //homePage.waitForLoadPage();
        assertEquals(result, driver.findElement(By.xpath(".//div[@class = 'app_logo']")).isDisplayed());
    }

    //Close page
    @After
    public void tearDown() {
        driver.quit();
    }
}