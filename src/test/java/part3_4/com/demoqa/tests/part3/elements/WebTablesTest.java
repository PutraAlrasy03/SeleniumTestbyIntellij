package part3_4.com.demoqa.tests.part3.elements;

import org.junit.Assert;
import org.junit.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTablesTest extends BaseTest {

    @Test
    public void testWebTable(){

        String email = "alden@example.com";
        String expectedAge = "34";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);

        Assert.assertEquals("\n Actual & Expected Ages do not match \n", expectedAge, actualAge);
    }
}
