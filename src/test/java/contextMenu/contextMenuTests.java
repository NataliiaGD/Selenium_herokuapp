package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class contextMenuTests extends BaseTests {
    @Test
    public void contextClick(){
        var contextPage = homePage.clickContextMenu();
        contextPage.clickRightClick();
        assertEquals(contextPage.getPopUpText(), "You selected a context menu");
        contextPage.acceptPopUp();

    }
}
