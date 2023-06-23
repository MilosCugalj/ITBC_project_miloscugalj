package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProgressBarTest extends BaseTest {

    @Test
    public void progressionBarTest() throws InterruptedException {
        getProgressBarPage().open()
                .clickStartButton();
        getWait().until(ExpectedConditions.visibilityOf(getProgressBarPage().getResetButton()));
        getProgressBarPage().clickResetButton();
        //Thread.sleep(6000);
        //getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // getWait().until(ExpectedConditions.domPropertyToBe(getProgressBarPage().getProgressBar(), "width", " 57%"));
       // getWait().until(ExpectedConditions.domAttributeToBe(getProgressBarPage().getProgressBar(), "aria-valuenow", "57"));
        //getProgressBarPage().clickStartButton();

    }
}
