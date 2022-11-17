import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.ComputersPage;
import pages.DesktopsPage;
import pages.HomePage;

import java.time.Duration;

import static util.Constants.Contst.URL;

public class SetUpScenario {
    private WebDriver driver;
    protected HomePage homePage;
    protected ComputersPage computersPage;
    protected DesktopsPage desktopsPage;

    @BeforeClass
    protected void setUpBrowser() {
        WebDriverManager.chromedriver().setup();


    }

    @BeforeMethod
    protected void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get(URL);
        BasePage.setDriver(driver);
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopsPage();
    }

    @AfterClass
    public void tearDown() {
        driver.close();
       // driver.quit();
    }
}
