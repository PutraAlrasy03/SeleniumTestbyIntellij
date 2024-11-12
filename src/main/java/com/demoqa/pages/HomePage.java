package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ultilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[3]/h5");
    private String expectedText = "Book Store Application";

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
}
