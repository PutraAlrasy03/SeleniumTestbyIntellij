package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.id("currentAddress");
    private By submitButton = By.id("submit");
    private By currentAddrestResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name){
        scrollToElementJS(fullNameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB,email));
    }

    public void setCurrentAddress(String address){
        find(currentAddressField).sendKeys(address + Keys.ENTER);
//        set(currentAddressField, address + Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5,currentAddrestResult);
        return getText(currentAddrestResult);
    }
}