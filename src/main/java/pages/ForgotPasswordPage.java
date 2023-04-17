package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    public WebDriver driver;
    public By email = By.id("email");
    public By retrievePassword = By.id("form_submit");
    public By forgotPasswordTitle = By.xpath("/html/body/div[2]/div/div/h2");
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String emails){
        driver.findElement(email).sendKeys(emails);
    }
    public void clickRetrievePassword(){
        driver.findElement(retrievePassword).click();
    }
    public String getTitleText(){
        return driver.findElement(forgotPasswordTitle).getText();
    }


}
