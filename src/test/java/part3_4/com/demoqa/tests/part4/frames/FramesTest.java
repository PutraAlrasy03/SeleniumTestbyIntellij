package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrame();
        String actualBigBoxTest = framesPage.getTextInBigFrame();
        String expectedBigBoxTest = "This is a sample page";
        Assert.assertEquals(actualBigBoxTest,expectedBigBoxTest, "\n Actual and expected do not match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"Actual and Expected header text do no match");
    }
}