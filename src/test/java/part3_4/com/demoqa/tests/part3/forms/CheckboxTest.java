package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox(){
        var formspage = homePage.goToForms().clickPraticeForm();
        formspage.clickSportsHobbyCheckbox();
        formspage.clickReadingHobbyCheckbox();
        formspage.clickMusicHobbyCheckbox();
        formspage.unclickReadingHobbyCheckbox();

        boolean isReadingCheckboxSelected = formspage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading checkbox is seleted\n");
    }
}
