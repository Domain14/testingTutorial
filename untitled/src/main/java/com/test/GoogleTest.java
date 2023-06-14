package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;

public class GoogleTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        String dir = System.getProperty("user.dir");
        System.setProperty("WebDriver.chrome.driver",dir + "/src/main/resources/chromedriver");
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.google.com");
       // driver.findElement(By.id("APjFqb")).sendKeys("Discovery");

    }
public void getData(){
    System.out.printf("hello");
}
    @Test(priority = 1)
    public void googleTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);
        getData();
        driver.findElement(By.id("APjFqb")).sendKeys("Discovery");
    }

    @Test(priority = 2)
    public void googleLogoTest(){
        boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
    }



    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}


