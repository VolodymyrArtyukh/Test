package com.apple.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class BaseTest
{

    protected WebDriver driver;
    private final String URL = "https://www.google.com";

    @BeforeClass
    public void setProperty()
    {
       System.setProperty("webdriver.chrome.driver" ,  "/Users/volodymyr/IdeaProjects/Test/chromedriver");
    }

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
