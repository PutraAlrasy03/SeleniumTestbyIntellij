package Part2.com.saucedemo.test.products;

import Part2.com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.
                logIntoApplication("standard_user", "secret_sauce");
        assertTrue("Products page header is not displayed", productsPage.isProductsHeaderDisplayed());
    }

}
