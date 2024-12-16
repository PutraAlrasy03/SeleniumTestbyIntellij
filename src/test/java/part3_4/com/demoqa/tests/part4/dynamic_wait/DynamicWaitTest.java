package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DynamicWaitTest extends BaseTest {


    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicPropeties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText,expectedText, "\n Actual and expected text do not match \n");
    }


    public void testProgressBar(){
        var progressBarPage = homePage.gotWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgessValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue,expectedValue, "\n Value is not 100% \n");
    }
}
