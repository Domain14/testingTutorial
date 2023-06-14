package com.test;

import org.testng.annotations.*;

public class TestNGBasics {
   //pre-conditions -- starting with @Before
    @BeforeSuite //1
    public void setUp()
    {
        System.out.println("Set up system property for chrome");
    }

    @BeforeTest //2
    public void LaunchBrowser()
    {
        System.out.println("Launch chrome");
    }
    @BeforeClass //3
    public void login()
    {
        System.out.println("Login");
    }
    @BeforeMethod //4
    public  void enterURL()
    {
        System.out.println("enter URL");
    }

    // Test cases -- starting with Test
    @Test //5
    public void googleTitleTest()
    {
        System.out.println("Google Title Test");
    }


    // Post conditions -- starting with @After
    @AfterTest //6
    public void LogOut()
    {
        System.out.println("Logout");
    }
    @AfterClass //7
    public void closeBrowser()
    {
        System.out.println("Close Browser");
    }
    @AfterTest //8
    public void deleteAllCookies()
    {
        System.out.println("Delete cookies");
    }

    @AfterSuite //9
    public void generateTestReports()
    {
        System.out.println("generate test reports");
    }
}
