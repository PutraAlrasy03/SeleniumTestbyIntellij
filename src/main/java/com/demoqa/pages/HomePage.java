package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[3]/h5");
    private By elementsCard = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]/h5");
    private By widgetsCard =By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[3]/h5");
    private By alertsFrameWindowsCard = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[3]/h5");


    private String expectedText = "Forms";

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);

        WebElement element = driver.findElement(formsCard); // Find the WebElement
        String actualText = element.getText(); // Get the actual text of the element

        // Print the element text and check if it matches the expected text
        System.out.println("Clicking on element: " + actualText);

        if (actualText.equals(expectedText)) {
            System.out.println("Actual text matches expected text: " + expectedText);
        } else {
            System.out.println("Actual text does not match expected text. Expected: "
                    + expectedText + ", but got: " + actualText);
        }

        click(formsCard); // Perform the click action
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage gotWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new Alerts_Frames_WindowsPage();
    }
}
