package tests;

import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @Test
    public void radioBtnTest() {
        getRadioButtonPage().open()
                .clickYesRadioBtn();
        assertVisibilityOfElements(getRadioButtonPage().getYesMessage());
        getRadioButtonPage().clickImpressiveRadioBtn();
        assertVisibilityOfElements(getRadioButtonPage().getImpressiveMessage());
        getRadioButtonPage().tryClickNoRadioBtn();
    }
}
