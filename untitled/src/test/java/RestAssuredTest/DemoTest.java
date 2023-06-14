package RestAssuredTest;

import Pages.SwagLabs;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoTest {
    private static WebDriver driver;
    public static void main(String[] args) {
        setUp();
        loginToSwagsLab();
        tearDown();


    }
    public static void setUp(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("Webdriver.chrome.driver", projectPath+"/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    public static void loginToSwagsLab(){
        SwagLabs swagLabsObj = new SwagLabs();
        swagLabsObj.populateUserName(driver).sendKeys("standard_user");
        swagLabsObj.populatePassword(driver).sendKeys("secret_sauce");
        swagLabsObj.login(driver).sendKeys(Keys.RETURN);
    }
    public static void tearDown(){
        driver.quit();
    }
}
