package forgotPassword;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void retrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@example.com");
        //forgotPasswordPage.clickRetrievePassword();
        Assert.assertEquals(forgotPasswordPage.getTitleText(),"Forgot Password");
    }
}
