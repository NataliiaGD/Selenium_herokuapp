package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    public WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
//    public void clickDropdown(){
//        driver.findElement(By.id("dropdown")).click();
//    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
       List<WebElement> selectedElements =
               findDropdownElement().getAllSelectedOptions();
       return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
