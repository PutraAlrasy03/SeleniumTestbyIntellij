package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText  = By.xpath("//div[contains(text(),'small modal')]"); ///html/body/div[4]/div/div/div[2]
    private By closeButton = By.xpath("//*[@id=\"closeSmallModal\"]");

    public void clickSmallModalButton(){
        click(smallModalButton);
    }

    public String getsmallModalText(){
        return find(smallModalText).getText();
    }
    public void clickCloseButton(){
        click(closeButton);
    }
}
