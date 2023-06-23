package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{
    private WebElement expandAllBtn;
    private WebElement desktopCheckBox;
    private WebElement reactCheckBox;
    private WebElement officeCheckBox;
    private WebElement generalCheckBox;
    private WebElement excelFileCheckBox;
    private WebElement successTextDesktop;

    private WebElement successTextNotes;
    private WebElement successTextCommands;
    private WebElement successTextReact;
    private WebElement successTextGeneral;
    private WebElement getSuccessTextExcelFile;


    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getExpandAllBtn() {
        this.expandAllBtn = getDriver().findElement(By.xpath("//button[@title='Expand all']//*[name()='svg']"));
        return expandAllBtn;
    }

    public WebElement getDesktopCheckBox() {
        this.desktopCheckBox = getDriver().findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        return desktopCheckBox;
    }

    public WebElement getReactCheckBox() {
        this.reactCheckBox = getDriver().findElement(By.xpath("//span[contains(text(),'React')]"));
        return reactCheckBox;
    }

    public WebElement getOfficeCheckBox() {
        this.officeCheckBox = getDriver().findElement(By.xpath("//span[contains(text(),'Office')]"));
        return officeCheckBox;
    }

    public WebElement getGeneralCheckBox() {
        this.generalCheckBox = getDriver().findElement(By.xpath("//span[contains(text(),'General')]"));
        return generalCheckBox;
    }

    public WebElement getExcelFileCheckBox() {
        this.excelFileCheckBox = getDriver().findElement(By.xpath("//span[contains(text(),'Excel File.doc')]"));
        return excelFileCheckBox;
    }

    public WebElement getSuccessTextDesktop() {
        this.successTextDesktop = getDriver().findElement(By.xpath("//span[normalize-space()='desktop']"));
        return successTextDesktop;
    }

    public WebElement getSuccessTextNotes() {
        this.successTextNotes = getDriver().findElement(By.xpath("//span[normalize-space()='notes']"));
        return successTextNotes;
    }

    public WebElement getSuccessTextCommands() {
        this.successTextCommands = getDriver().findElement(By.xpath("//span[normalize-space()='commands']"));
        return successTextCommands;
    }

    public WebElement getSuccessTextReact() {
        this.successTextReact = getDriver().findElement(By.xpath("//span[normalize-space()='react']"));
        return successTextReact;
    }

    public WebElement getSuccessTextGeneral() {
        this.successTextGeneral = getDriver().findElement(By.xpath("//span[normalize-space()='general']"));
        return successTextGeneral;
    }

    public WebElement getGetSuccessTextExcelFile() {
        this.getSuccessTextExcelFile = getDriver().findElement(By.xpath("//span[normalize-space()='excelFile']"));
        return getSuccessTextExcelFile;
    }
    public CheckBoxPage clickExpandAll() {
        getExpandAllBtn().click();
        return this;
    }

    public CheckBoxPage clickDesktopCheckBox() {
        getDesktopCheckBox().click();
        return this;
    }

    public CheckBoxPage clickReactCheckBox() {
        getReactCheckBox().click();
        return this;
    }

    public CheckBoxPage clickOfficeCheckBox() {
        getOfficeCheckBox().click();
        return this;
    }

    public CheckBoxPage clickGeneralCheckBox() {
        getGeneralCheckBox().click();
        return this;
    }

    public CheckBoxPage clickExcelFileCheckBox() {
        getExcelFileCheckBox().click();
        return this;
    }

    public CheckBoxPage open() {
        getDriver().get("https://demoqa.com/checkbox");
        return this;
    }




}

