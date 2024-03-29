import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.TemporalUnit;


public class HomePage extends BasePage {

    private By mobileLink = By.cssSelector(".nav-1 a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MobilePage clickMobileLink() {
        driver.findElement(mobileLink).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleIs("Mobile"));
        return new MobilePage(driver);
    }
}