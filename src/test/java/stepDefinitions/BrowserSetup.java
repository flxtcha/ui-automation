package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ChromeWebDriver;

public class BrowserSetup {

    private WebDriver driver;

    @Before
    public void setupDriver(){
        driver = ChromeWebDriver.webDriver();
    }
    WebDriver getDriver(){
        return driver;
    }
    @After
    public void tearDownDriver(){
        driver.manage().deleteAllCookies();

        driver.quit();
    }

}
