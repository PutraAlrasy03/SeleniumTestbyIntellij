package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static ultilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() throws InterruptedException {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlert();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText,"\n Actual & Expected do not match");
        acceptAlert();
    }
}
