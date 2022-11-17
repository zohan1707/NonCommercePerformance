package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends BasePage {

    @FindBy(xpath = "//h2[@class='title']//a[@href = '/desktops']")
    WebElement buttonDesktops;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/computers']")
    WebElement buttonComputers;

    @FindBy(xpath = "//div[@class= 'details']//a[@href = '/build-your-own-computer']")
    WebElement firstDesktopInTheList;


    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    public DesktopsPage openDesktopPage(){
        buttonComputers.click();
        buttonDesktops.click();
        return this;
    }

    public DesktopsPage openFirstDesktopInTheList(){
        firstDesktopInTheList.click();
        return this;
    }
}
