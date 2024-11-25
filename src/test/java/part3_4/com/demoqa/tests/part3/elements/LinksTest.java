package part3_4.com.demoqa.tests.part3.elements;


import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clikcBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400")&& actualResponse.contains("Bad Request"), "\n Actual Reponse("+actualResponse +"\n Does not contain '400' and 'Bad Request' ");
    }
}
