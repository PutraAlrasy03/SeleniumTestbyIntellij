package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By selectMenuItem = By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[9]/span");

    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}
