package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/span");

    public boolean isProductsHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
