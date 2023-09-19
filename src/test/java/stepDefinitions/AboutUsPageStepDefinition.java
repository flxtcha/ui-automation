package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AboutUs;

import static org.junit.Assert.assertEquals;

public class AboutUsPageStepDefinition {

    private BrowserSetup browserSetup;

    public AboutUsPageStepDefinition(BrowserSetup browserSetup) {
        this.browserSetup = browserSetup;
    }

    @Then("I should be able to view the history of version1")
    public void iShouldBeAbleToViewTheHistoryOfVersion1() {
        String actualText = AboutUs.locateVersion1History(browserSetup.getDriver());
        assertEquals("Our History", actualText);
    }
}
