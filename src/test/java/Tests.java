import org.testng.annotations.Test;

public class Tests extends SetUpScenario {


    @Test()
    public void openHomePage() {
        homePage.openHomePage();
    }

    @Test()
    public void openComputerPage() {
        computersPage.openComputersPage();
    }

    @Test()
    public void openDesktopPage(){
        desktopsPage.openDesktopPage();
    }

    @Test()
    public void openFirstDesktopInTheList(){
        desktopsPage.openFirstDesktopInTheList();
    }

}
