package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[2]/span");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlert(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }
}
