package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DatePickerPage extends BasePage{
    private WebElement dateBox;
    private WebElement dateAndTimeBox;


    public DatePickerPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDateBox() {
        this.dateBox = getDriver().findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        return dateBox;
    }

    public WebElement getDateAndTimeBox() {
        this.dateAndTimeBox =getDriver().findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));
        return dateAndTimeBox;
    }

    public DatePickerPage clearDateBox() {
        for(int i=0; i<10; i++) {
            getDateBox().sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public DatePickerPage setDate(String date) {
        getDateBox().sendKeys(date);
        getDateBox().sendKeys(Keys.ENTER);
        return this;
    }

    public DatePickerPage setDateAndTime(String dateAndTime) {
        for(int i=0; i<21; i++) {
            getDateAndTimeBox().sendKeys(Keys.BACK_SPACE);
        }
        getDateAndTimeBox().sendKeys(dateAndTime);
        getDateAndTimeBox().sendKeys(Keys.ENTER);
        return this;
    }

    public DatePickerPage open() {
        getDriver().get("https://demoqa.com/date-picker");
        return this;
    }
}
