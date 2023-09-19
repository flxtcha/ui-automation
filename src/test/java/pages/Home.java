package pages;

import org.openqa.selenium.WebDriver;

public class Home {

    public static void navigateToUrl(WebDriver driver, String url){
        driver.navigate().to(url);
    }
}
