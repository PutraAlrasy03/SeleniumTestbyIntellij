package part3_4.com.demoqa.tests.part3.widgets;

import org.junit.Assert;
import org.junit.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSeletingDate(){
        String month = "December";
        String monthNumber = "12";
        String day = "15";
        String year ="2034";

        var datePickerPage = homePage.gotWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals("\n Actual & Expected Dates Do not Match" + "\n Actual Date: " + actualDate +"\n Expected Date: " + expectedDate,actualDate,expectedDate);
     }
}
