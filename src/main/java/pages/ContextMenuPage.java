package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends HomePage{
    private WebDriver driver;
    public By clickBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickRightClick(){
        Actions actions = new Actions(driver);
        WebElement box = driver.findElement(clickBox);
        actions.contextClick(box).perform();
    }
    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }

}


