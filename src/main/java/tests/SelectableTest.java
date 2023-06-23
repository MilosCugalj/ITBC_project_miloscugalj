package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectableTest extends BaseTest{

    @Test
    public void verifyUserCanSelectAllButtonsInGrid() {
        getSelectablePage().open()
                .clickGridBtn()
                .clickOneBtn()
                .clickTwoBtn()
                .clickThreeBtn()
                .clickFourBtn()
                .clickFiveBtn()
                .clickSixBtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        getSelectablePage().clickSevenBtn()
                .clickEightBtn()
                .clickNineBtn();
        Assert.assertEquals(getSelectablePage().getOneBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getTwoBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getThreeBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getFourBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getFiveBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getSixBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getSevenBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getEightBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getNineBtn().getCssValue("background-color"), "rgba(0, 123, 255, 1)");

    }

    @Test
    public void verifyUserCanSelectAllButtonsInList() {
        getSelectablePage().open()
                .clickListFirstOption()
                .clickListSecondOption()
                .clickListThirdOption();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,100)", "");
                getSelectablePage().clickListFourthOption();
        Assert.assertEquals(getSelectablePage().getListFirstOption().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getListSecondOption().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getListThirdOption().getCssValue("background-color"), "rgba(0, 123, 255, 1)");
        Assert.assertEquals(getSelectablePage().getListFourthOption().getCssValue("background-color"), "rgba(0, 123, 255, 1)");

    }
}
