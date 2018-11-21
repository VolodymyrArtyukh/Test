package com.apple.tests;

import com.apple.settings.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearResultPage;

public class TestCase extends BaseTest
{
    HomePage myGoogleHomePage;
    SearResultPage resultPage;

    @Test
    public void shouldSearchForCatImages()
    {
        myGoogleHomePage = PageFactory.initElements(driver, HomePage.class);
        resultPage = PageFactory.initElements(driver, SearResultPage.class);

        myGoogleHomePage.searchForCats("Cats");
        resultPage.goToImagesLink();

        System.out.println("Test class");

    }




}
