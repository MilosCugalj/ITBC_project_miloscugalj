package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest{

    @Test
    public void sliderTest() {
        getSliderPage().open()
               // .moveSlider(30)
                .moveSliderForOneUp()
                .moveSliderForOneRight()
                .moveSliderForOneLeft()
                .moveSliderForOneDown();
        Assert.assertEquals(getSliderPage().showSliderValue(), "25");
    }
}
