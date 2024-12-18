package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){
       var textBoxPage = homePage.goToElements().clickTextBox();
       textBoxPage.setFullName("Putra Alrasy");
       textBoxPage.setEmail("dianaputra529@gmail.com");
       textBoxPage.setCurrentAddress("53-03 MidValley");
        textBoxPage.setCurrentAddress("Level 3");
        textBoxPage.setCurrentAddress("Kuala Lumpur");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Level 3"),"Actual address is not matched");

    }
}
