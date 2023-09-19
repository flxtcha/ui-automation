package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutUs;
import pages.NavigationBar;

public class NavigationStepDefinition {

    private BrowserSetup browserSetup;

    public NavigationStepDefinition(BrowserSetup browserSetup) {
        this.browserSetup = browserSetup;
    }

    @When("I navigate to the about us page")
    public void iNavigateToTheAboutUsPage() {
        NavigationBar.clickAboutUs(browserSetup.getDriver());
        NavigationBar.clickAboutUsMenu(browserSetup.getDriver());
    }
}
