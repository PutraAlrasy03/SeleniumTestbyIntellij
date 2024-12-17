package part3_4.com.demoqa.tests.part4.interactions;

import com.demoqa.pages.widgets.SliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult(){
        int x = 180;
        int y = 0;

        var sliderPage = homePage.gotWidgets().clickSlider();
        sliderPage.moveSlider(x,y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "78";
        Assert.assertEquals(actualValue,expectedValue, " Actual and expected value do not match");
    }
}
