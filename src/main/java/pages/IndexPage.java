package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private WebElement elementsCard;

    public WebElement getElementsCard() {
        elementsCard = getDriver().findElement(By.xpath("//h5[normalize-space()='Elements']"));
        return elementsCard;
    }

    public IndexPage elementsCard() {
        getElementsCard().click();
        return this;
    }

    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        return this;
    }

}
