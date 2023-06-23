package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizablePage extends BasePage{
    private WebElement handleRestricted;
    private WebElement boxRestricted;
    private WebElement handleUnrestricted;
    private  WebElement boxUnrestricted;

    public ResizablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHandleRestricted() {
        this.handleRestricted = getDriver().findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
        return handleRestricted;
    }

    public WebElement getBoxRestricted() {
        this.boxRestricted = getDriver().findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));
        return boxRestricted;
    }

    public WebElement getHandleUnrestricted() {
        this.handleUnrestricted = getDriver().findElement(By.xpath("//div[@id='resizable']//span[@class='react-resizable-handle react-resizable-handle-se']"));
        return handleUnrestricted;
    }
    public WebElement getBoxUnrestricted() {
        this.boxUnrestricted = getDriver().findElement(By.xpath("//div[@id='resizable']"));
        return boxUnrestricted;
    }

    public ResizablePage resizeElement (WebElement resizableHandle, int x, int y) {
        Actions action = new Actions(getDriver());
        action.clickAndHold(resizableHandle).moveByOffset(x, y).perform();
        return this;
    }

    public ResizablePage open(){
        getDriver().get("https://demoqa.com/resizable");
        return this;
    }

}
