package part3_4.com.demoqa.tests.part3.forms;

import org.junit.Assert;
import org.junit.Test;
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
        Assert.assertFalse("\n Reading checkbox is seleted\n", isReadingCheckboxSelected);
    }
}
