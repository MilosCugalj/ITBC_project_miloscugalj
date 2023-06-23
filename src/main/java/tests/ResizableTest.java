package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ResizableTest extends BaseTest{

    int moveX = 200;
    int moveY = 50;


    @Test
    public void resizeRestrictedBox() {
        getResizablePage().open()
                .resizeElement(getResizablePage().getHandleRestricted(), moveX, moveY);
        Assert.assertEquals(getResizablePage().getBoxRestricted().getCssValue("height"), 200 + moveY + "px");
        Assert.assertEquals(getResizablePage().getBoxRestricted().getCssValue("width"), 200 + moveX + "px");
    }

    @Test
    public void resizeUnrestrictedBox() {
        getResizablePage().open();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
                getResizablePage().resizeElement(getResizablePage().getHandleUnrestricted(), moveX, moveY);
        Assert.assertEquals(getResizablePage().getBoxUnrestricted().getCssValue("height"), 200 + moveY + "px" );
        Assert.assertEquals(getResizablePage().getBoxUnrestricted().getCssValue("width"), 200 + moveX + "px");
    }

}
