package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends HomePage{
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
