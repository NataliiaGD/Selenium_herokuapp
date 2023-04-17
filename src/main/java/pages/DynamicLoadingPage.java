package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends HomePage{
    private WebDriver driver;
    public By hiddenElementLink = By.linkText("Example 1: Element on page that is hidden");
    public By startButton = By.cssSelector("#start button");
    public By loadingIndicator = By.id("loading");
    public By loadedText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void clickHiddenElementLink(){
        driver.findElement(hiddenElementLink).click();
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

}
