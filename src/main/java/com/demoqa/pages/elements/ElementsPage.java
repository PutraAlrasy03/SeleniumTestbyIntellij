package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[4]/span");
    private By linksMenuItem = By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[6]/span");

    public WebTablesPage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return new LinksPage();
    }
}
