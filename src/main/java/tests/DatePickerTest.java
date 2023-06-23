package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest{
    String dateOfBirth = "03/29/1981";

    String dateAndTimeofBirth = "March 29, 1981 2:00 AM";

    @Test
    public void datePickerTest() {
        getDatePickerPage().open()
                .clearDateBox()
                .setDate(dateOfBirth);
        Assert.assertEquals(getDatePickerPage().getDateBox().getAttribute("value"), dateOfBirth);
    }

    @Test
    public void dateAndTimePickerTest() {
        getDatePickerPage().open()
                .setDateAndTime(dateAndTimeofBirth);
        Assert.assertEquals(getDatePickerPage().getDateAndTimeBox().getAttribute("value"), dateAndTimeofBirth);
    }
}
