package waiter;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaiterTests extends BaseTests {
    @Test
    public void checkHiddenElement(){
        var dynamicLoading = homePage.clickDynamicLoading();
        dynamicLoading.clickHiddenElementLink();
        dynamicLoading.clickStartButton();
        assertEquals(dynamicLoading.getLoadedText(), "Hello World!");
    }
}
