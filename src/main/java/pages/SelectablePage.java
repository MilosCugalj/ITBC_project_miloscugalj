package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectablePage extends BasePage{
    private WebElement listBtn;
    private WebElement gridBtn;
    private WebElement listFirstOption;
    private WebElement listSecondOption;
    private WebElement listThirdOption;
    private WebElement listFourthOption;
    private WebElement oneBtn;
    private WebElement twoBtn;
    private WebElement threeBtn;
    private WebElement fourBtn;
    private WebElement fiveBtn;
    private WebElement sixBtn;
    private WebElement sevenBtn;
    private WebElement eightBtn;
    private WebElement nineBtn;


    public SelectablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getListBtn() {
        this.listBtn = getDriver().findElement(By.xpath("//a[@id='demo-tab-list']"));
        return listBtn;
    }

    public WebElement getGridBtn() {
        this.gridBtn = getDriver().findElement(By.xpath("//a[@id='demo-tab-grid']"));
        return gridBtn;
    }

    public WebElement getListFirstOption() {
        this.listFirstOption = getDriver().findElement(By.cssSelector("div[id='demo-tabpane-list'] li:nth-child(1)"));
        return listFirstOption;
    }

    public WebElement getListSecondOption() {
        this.listSecondOption = getDriver().findElement(By.cssSelector("div[id='demo-tabpane-list'] li:nth-child(2)"));
        return listSecondOption;
    }

    public WebElement getListThirdOption() {
        this.listThirdOption = getDriver().findElement(By.cssSelector("div[id='demo-tabpane-list'] li:nth-child(3)"));
        return listThirdOption;
    }

    public WebElement getListFourthOption() {
        this.listFourthOption = getDriver().findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6'] li:nth-child(4)"));
        return listFourthOption;
    }

    public WebElement getOneBtn() {
        this.oneBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Two']"));
        return oneBtn;
    }
    public WebElement getTwoBtn() {
        this.twoBtn = getDriver().findElement(By.xpath("//li[normalize-space()='One']"));
        return twoBtn;
    }
    public WebElement getThreeBtn() {
        this.threeBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Three']"));
        return threeBtn;
    }
    public WebElement getFourBtn() {
        this.fourBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Four']"));
        return fourBtn;
    }
    public WebElement getFiveBtn() {
        this.fiveBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Five']"));
        return fiveBtn;
    }
    public WebElement getSixBtn() {
        this.sixBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Six']"));
        return sixBtn;
    }
    public WebElement getSevenBtn() {
        this.sevenBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Seven']"));
        return sevenBtn;
    }
    public WebElement getEightBtn() {
        this.eightBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Eight']"));
        return eightBtn;
    }
    public WebElement getNineBtn() {
        this.nineBtn = getDriver().findElement(By.xpath("//li[normalize-space()='Nine']"));
        return nineBtn;
    }

    public SelectablePage clickListBtn() {
        getListBtn().click();
        return this;
    }

    public SelectablePage clickGridBtn() {
        getGridBtn().click();
        return this;
    }

    public SelectablePage clickListFirstOption() {
        getListFirstOption().click();
        return this;
    }

    public SelectablePage clickListSecondOption() {
        getListSecondOption().click();
        return this;
    }

    public SelectablePage clickListThirdOption() {
        getListThirdOption().click();
        return this;
    }

    public SelectablePage clickListFourthOption() {
        getListFourthOption().click();
        return this;
    }

    public SelectablePage clickOneBtn() {
        getOneBtn().click();
        return this;
    }
    public SelectablePage clickTwoBtn() {
        getTwoBtn().click();
        return this;
    }
    public SelectablePage clickThreeBtn() {
        getThreeBtn().click();
        return this;
    }
    public SelectablePage clickFourBtn() {
        getFourBtn().click();
        return this;
    }
    public SelectablePage clickFiveBtn() {
        getFiveBtn().click();
        return this;
    }
    public SelectablePage clickSixBtn() {
        getSixBtn().click();
        return this;
    }
    public SelectablePage clickSevenBtn() {
        getSevenBtn().click();
        return this;
    }
    public SelectablePage clickEightBtn() {
        getEightBtn().click();
        return this;
    }

    public SelectablePage clickNineBtn() {
        getNineBtn().click();
        return this;
    }

    public SelectablePage open() {
        getDriver().get("https://demoqa.com/selectable");
        return this;
    }
}
