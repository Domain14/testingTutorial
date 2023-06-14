package RestAssuredTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo_TestWeb {
  WebDriver driver;

  @BeforeMethod
    public void setUp(){
      String dir = System.getProperty("user.dir");
      System.setProperty("Webdriver.chrome.driver",dir+"/src/main/resources/chromedriver");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.get("https://www.saucedemo.com/");

  }

  @Test(priority = 1)
    public void standardUserlogin() throws InterruptedException {
        login("standard_user");
    }


   @Test(priority = 2)
   public void problemUserLogin() throws InterruptedException {
      login("problem_user");
   }
    public void login(String userName) throws InterruptedException {
      driver.findElement(By.id("user-name")).sendKeys(userName);
        String test = driver.findElement(By.id("login_credentials")).getText();
        String password =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]")).getText().trim();

        password = password.substring(password.indexOf(":",0)+1).trim();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.quit();

        // boolean errorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).isDisplayed();
//    //System.out.println(errorLogin);
//
////    if(errorLogin) {
////      System.out.println("Invalid login");
////    }else{
////        System.out.println("Successfully logged in");
////
////      }
    }


  }





