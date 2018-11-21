package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearResultPage
{
     @FindBy(how = How.LINK_TEXT,using = "Images")
     public WebElement catsImagesLinkLocator;

     public void  goToImagesLink()
     {
         catsImagesLinkLocator.click();
     }

}
