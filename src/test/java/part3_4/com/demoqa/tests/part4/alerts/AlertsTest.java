package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    //@Test
    public void testInformationAlert() throws InterruptedException {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText,"\n Actual & Expected do not match");
        acceptAlert();
    }

    //@Test
    public void testConfirmationAlert(){

    var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
    alertsPage.clickConfirmationAlertButton();
    dismissAlert();
    String expectedConfirmationResult = "You selected Cancel";
    String actualConfirmationResult = alertsPage.getConfirmationResult();
    Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult,"\n You did not select cancel");
    }

    @Test
    public void testPromptAlert() {
        String alertText = "Putra Alrasy";
        String expectedResult = "You entered " + alertText;
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
        alertsPage.clikPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResutl();
        Assert.assertEquals(actualResult,expectedResult, "\n Actual and expected result are not match");
    }

}
