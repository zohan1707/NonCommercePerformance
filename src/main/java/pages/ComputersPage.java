package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends BasePage {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/computers']")
    WebElement buttonComputers;

    public ComputersPage() {
        PageFactory.initElements(driver,this);
    }

    public ComputersPage openComputersPage(){
        buttonComputers.isDisplayed();
        buttonComputers.click();
        return this;
    }

}
