package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderPage extends BasePage{

    private WebElement slider;
    private WebElement sliderValue;

    public SliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSlider() {
        this.slider = getSlider().findElement(By.xpath("//input[@type='range']"));
        return slider;
    }

    public WebElement getSliderValue() {
        this.sliderValue = getDriver().findElement(By.xpath("//input[@id='sliderValue']"));
        return sliderValue;
    }

    public SliderPage moveSlider(int move) {
        getSlider().sendKeys(Keys.ARROW_UP);
        return this;
    }

    public SliderPage moveSliderForOneUp() {
        getSlider().sendKeys(Keys.ARROW_UP);
        return this;
    }
    public SliderPage moveSliderForOneRight() {
        getSlider().sendKeys(Keys.ARROW_RIGHT);
        return this;
    }
    public SliderPage moveSliderForOneDown() {
        getSlider().sendKeys(Keys.ARROW_DOWN);
        return this;
    }

    public SliderPage moveSliderForOneLeft() {
        getSlider().sendKeys(Keys.ARROW_LEFT);
        return this;
    }

    public SliderPage showSliderValue() {
        getSliderValue().getCssValue("value");
        return this;
    }

    public SliderPage open() {
        getDriver().get("https://demoqa.com/slider");
        return this;
    }
}
