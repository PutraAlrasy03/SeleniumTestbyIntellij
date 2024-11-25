package part3_4.com.demoqa.tests.part4.screenshots;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenShotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor(){
        var praticeFormPage = homePage.goToForms().clickPraticeForm();
        praticeFormPage.clickSubmitButton();
    }
}
