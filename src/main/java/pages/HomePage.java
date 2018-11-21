package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage
{
    @FindBy(how = How.NAME,using = "q")
    public WebElement searchBar;

    public void searchForCats(String someText)
    {
        searchBar.sendKeys(someText);
        searchBar.submit();
    }
}
