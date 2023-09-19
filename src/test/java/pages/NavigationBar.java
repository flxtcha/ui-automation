package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationBar {

    public static void clickAboutUs(WebDriver webDriver){
        webDriver.findElement(By.xpath("//*[@id=\"menu-primary-menu-1\"]/li[5]/a")).click();
    }

    public static void clickAboutUsMenu(WebDriver webDriver) throws ElementNotInteractableException{

        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(webDriver, duration);
        try {
            WebElement aboutMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-about-menu-1\"]/li[1]/a")));
            aboutMenu.click();
        }   catch (ElementNotInteractableException e){
            System.out.println("Error grabbing:" + e.getMessage());
        }
    }
}