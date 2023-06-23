package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    private WebElement doubleClickMeBtn;
    private WebElement rightClickMeBtn;
    private WebElement clickMeBtn;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement dynamicClickMessage;


    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickMeBtn() {
        this.doubleClickMeBtn = getDriver().findElement(By.xpath("//button[@id='doubleClickBtn']"));
        return doubleClickMeBtn;
    }

    public WebElement getRightClickMeBtn() {
        this.rightClickMeBtn= getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        return rightClickMeBtn;
    }

    public WebElement getClickMeBtn() {
        this.clickMeBtn = getDriver().findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//div[2]//div[3]//button"));
        return clickMeBtn;
    }

    public WebElement getDoubleClickMessage() {
        this.doubleClickMessage = getDriver().findElement(By.xpath("//p[@id='doubleClickMessage']"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        this.rightClickMessage = getDriver().findElement(By.xpath("//p[@id='rightClickMessage']"));
        return rightClickMessage;
    }

    public WebElement getDynamicClickMessage() {
        this.dynamicClickMessage = getDriver().findElement(By.xpath("//p[@id='dynamicClickMessage']"));
        return dynamicClickMessage;
    }

    public ButtonsPage doubleClickDoubleClickMeBtn() {
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getDoubleClickMeBtn()).perform();
        return this;
    }

    public ButtonsPage rightClickRightClickMeBtn() {
        Actions actions = new Actions(getDriver());
        actions.contextClick(getRightClickMeBtn()).perform();
        return this;
    }

    public ButtonsPage clickClickMeBtn() {
        getClickMeBtn().click();
        return this;
    }

    public ButtonsPage open() {
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }


}
