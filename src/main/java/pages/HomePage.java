package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By dropdownLink = By.linkText("Dropdown");
    public By forgotPassword = By.linkText("Forgot Password");
    public By hovers = By.linkText("Hovers");
    public By keyPresses = By.linkText("Key Presses");
    public By jsAlerts = By.linkText("JavaScript Alerts");
    public By fileUpload = By.linkText("File Upload");
    public By contextMenu = By.linkText("Context Menu");
    public By frame = By.linkText("WYSIWYG Editor");
    public By dynamicLoading = By.linkText("Dynamic Loading");
    public By largeAndDeepDom = By.linkText("Large & Deep DOM");
    public By infiniteScroll = By.linkText("Infinite Scroll");
    public By multipleWindow = By.linkText("Multiple Windows");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPassword).click();
        return new ForgotPasswordPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
