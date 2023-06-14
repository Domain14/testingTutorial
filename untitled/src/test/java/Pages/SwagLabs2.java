package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabs2
{
    static WebDriver driver = null;
   static By username = By.id("user-name");
   static By password = By.id("password");
   static By login = By.id("login-button");

   public SwagLabs2(WebDriver driver){
       this.driver = driver;

   }



   // private static WebElement element = null;
    public  void populateUserName(String text){
     driver.findElement(username).sendKeys(text);

    }
    public void  populatePassword(String text){
     driver.findElement(password).sendKeys(text);

    }

    public void login(WebDriver driver){
     driver.findElement(login);

    }
}
