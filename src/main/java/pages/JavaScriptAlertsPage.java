package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends HomePage{
    private WebDriver driver;
    public By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    public By confirmAlertButton = By.xpath("//button[text() ='Click for JS Confirm']");
    public By promptAlertButton = By.xpath("//button[text()='Click for JS Prompt']");
    public By results = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
    public void triggerConfirm(){
        driver.findElement(confirmAlertButton).click();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void triggerPrompt(){
        driver.findElement(promptAlertButton).click();
    }
    public void alert_setInput(String text){
         driver.switchTo().alert().sendKeys(text);
    }
}
