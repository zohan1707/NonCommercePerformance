import org.testng.annotations.Test;

public class Tests extends SetUpScenario {


    @Test(priority = 1)
    public void openHomePage() {
        homePage.openHomePage();
    }

    @Test(priority = 2)
    public void openComputerPage() {
        computersPage.openComputersPage();
    }

    @Test(priority = 3)
    public void openDesktopPage(){
        desktopsPage.openDesktopPage();
    }

    @Test(priority = 4)
    public void openFirstDesktopInTheList(){
        desktopsPage.openFirstDesktopInTheList();
    }

}
