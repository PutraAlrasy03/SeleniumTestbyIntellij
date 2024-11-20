package part3_4.com.demoqa.tests.part3.widgets;

import org.junit.Assert;
import org.junit.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMutliSelectDropDown(){
        var selectMenuPage = homePage.gotWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);


        selectMenuPage.deselectStandardMulti("saab");

        List<String> actualSelectedoptions = selectMenuPage.getSelectedOptionsFromStandardMultiOptions();
        Assert.assertTrue(actualSelectedoptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedoptions.contains("Opel"));
        Assert.assertFalse(actualSelectedoptions.contains("Saab"));
        Assert.assertTrue(actualSelectedoptions.contains("Audi"));
    }
}
