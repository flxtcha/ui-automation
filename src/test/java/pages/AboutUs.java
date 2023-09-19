package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUs {

    public static String locateVersion1History(WebDriver driver){
        WebElement history =  driver.findElement(By.cssSelector("#content > section.list--history > div > h3"));
        return history.getText();
    }
}
