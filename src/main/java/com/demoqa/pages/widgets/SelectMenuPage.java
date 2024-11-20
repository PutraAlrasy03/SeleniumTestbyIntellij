package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import java.util.List;
import static ultilities.DropDownUtility.*;
import static ultilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getSelectedOptionsFromStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}