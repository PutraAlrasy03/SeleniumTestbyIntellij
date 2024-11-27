package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() throws InterruptedException {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getsmallModalText();
        //System.out.println("Retrieved modal text: " + actualText);
        Thread.sleep(3000);
        //Assert.assertTrue(actualText.contains("small modal"),"\n The Message do not contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
        Thread.sleep(3000);
    }
}
