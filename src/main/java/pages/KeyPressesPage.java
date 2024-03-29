package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends HomePage{

    public By inputField = By.id("target");
    public By resultText = By.id("result");

    private WebDriver driver;

    public KeyPressesPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p") + "3.14");
    }


}
