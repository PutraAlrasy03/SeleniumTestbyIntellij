package part3_4.com.demoqa.tests.part3.forms;

import org.junit.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPraticeForm();
        formsPage.clickFemaleRadioButton();
    }
}
