import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

public class HomePageTests {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

}
