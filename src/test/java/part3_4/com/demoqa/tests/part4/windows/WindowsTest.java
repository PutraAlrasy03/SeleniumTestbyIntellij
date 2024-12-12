package part3_4.com.demoqa.tests.part4.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL(){
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURl = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL,expectedURl, "Actual and expected URl do not match");
    }
}
