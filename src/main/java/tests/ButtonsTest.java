package tests;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{


    @Test
    public void doubleClick() {
        getButtonsPage().open()
                .doubleClickDoubleClickMeBtn();
        assertVisibilityOfElements(getButtonsPage().getDoubleClickMessage());
    }

    @Test
    public void rightClick() {
        getButtonsPage().open()
                .rightClickRightClickMeBtn();
        assertVisibilityOfElements(getButtonsPage().getRightClickMessage());
    }

    @Test
    public void dynamicClick() {
        getButtonsPage().open()
                .clickClickMeBtn();
        assertVisibilityOfElements(getButtonsPage().getDynamicClickMessage());
    }
   

}
