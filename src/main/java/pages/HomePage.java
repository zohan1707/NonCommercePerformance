package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(xpath = "//div[@class= 'currency-selector']")
    WebElement currencySelector;

    @FindBy(xpath = "//div[@id= 'nivo-slider']")
    WebElement tittle;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public HomePage openHomePage(){
        tittle.isDisplayed();
        currencySelector.click();
        return this;
    }




}
