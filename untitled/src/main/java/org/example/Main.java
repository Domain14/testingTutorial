package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
   public static WebDriver driver;
   public void LaunchPage(){
       String dir = System.getProperty("user.dir");
       System.setProperty("WebDriver.chrome.driver",dir + "/src/main/resources/chromedriver");
       driver = new ChromeDriver();
       driver.get("https://www.discovery.co.za/");

   }
   public void searchProduct() throws InterruptedException {
       driver.findElement(By.id("APjFqb")).sendKeys("Ntebaleng");
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/mobile-promo/div/div/div/div[2]/g-flat-button")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

   }
    public static void main(String[] args) throws InterruptedException {

        Main obj = new Main();
        obj.LaunchPage();
        obj.searchProduct();




    }
}