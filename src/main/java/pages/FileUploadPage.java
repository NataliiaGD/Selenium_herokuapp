package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends HomePage{
    private WebDriver driver;
    public By inputField = By.id("file-upload");
    public By uploadButton = By.id("file-submit");
    public By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
