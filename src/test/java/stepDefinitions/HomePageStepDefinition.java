package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.Home;

public class HomePageStepDefinition {

    private BrowserSetup browserSetup;

    public HomePageStepDefinition(BrowserSetup browserSetup) {
        this.browserSetup = browserSetup;
    }

    @Given("I have navigated to the version1 home page")
    public void iHaveNavigatedToTheVersion1HomePage() {
        WebDriver driver = browserSetup.getDriver();
        Home.navigateToUrl(driver, "https://version1.com");
    }

}
