package file;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class fileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        String absolutePath = "/Users/natalygordiyenko/IdeaProjects/AutomationUniversity/resources/chromedriver";
        uploadPage.uploadFile(absolutePath);
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver");
    }



}
