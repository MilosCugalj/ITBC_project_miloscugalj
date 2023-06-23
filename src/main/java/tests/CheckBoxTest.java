package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class CheckBoxTest extends BaseTest{

    @Test
    public void checkBoxTest() {
        getCheckBoxPage().open()
                .clickExpandAll()
                .clickDesktopCheckBox()
                .clickReactCheckBox();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
                getCheckBoxPage().clickOfficeCheckBox()
                        .clickOfficeCheckBox()
                        .clickGeneralCheckBox()
                        .clickExcelFileCheckBox();
        assertVisibilityOfElements(getCheckBoxPage().getSuccessTextDesktop());
        assertVisibilityOfElements(getCheckBoxPage().getSuccessTextNotes());
        assertVisibilityOfElements(getCheckBoxPage().getSuccessTextCommands());
        assertVisibilityOfElements(getCheckBoxPage().getSuccessTextReact());
        assertVisibilityOfElements(getCheckBoxPage().getSuccessTextGeneral());
        assertVisibilityOfElements(getCheckBoxPage().getGetSuccessTextExcelFile());


    }
}
