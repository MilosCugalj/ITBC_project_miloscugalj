package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends BasePage{
    private WebElement startButton;
    private WebElement progressBar;

    private WebElement resetButton;


    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getStartButton() {
        this.startButton = getDriver().findElement(By.xpath("//button[@id='startStopButton']"));
        return startButton;
    }

    public WebElement getProgressBar() {
        this.progressBar = getDriver().findElement(By.xpath("//div[@role='progressbar']"));
        return progressBar;
    }

    public WebElement getResetButton() {
        this.resetButton = getDriver().findElement(By.xpath("//button[@id='resetButton']"));
        return resetButton;
    }

    public ProgressBarPage clickStartButton() {
        getStartButton().click();
        return this;
    }

    public ProgressBarPage getProgressCurrentValue() {
        getProgressBar().getDomProperty("aria-valuenow");
        return this;
    }

    public ProgressBarPage clickResetButton() {
        getResetButton().click();
        return this;
    }

    public ProgressBarPage open() {
        getDriver().get("https://demoqa.com/progress-bar");
        return this;
    }
}
