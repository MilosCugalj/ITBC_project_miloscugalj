package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private ResizablePage resizablePage;
    private RadioButtonPage radioButtonPage;
    private SliderPage sliderPage;
    private CheckBoxPage checkBoxPage;
    private DatePickerPage datePickerPage;
    private ProgressBarPage progressBarPage;
    private SelectablePage selectablePage;

    public BaseTest() {
    }

    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public IndexPage getIndexPage() {
        return indexPage;
    }
    public WebTablesPage getWebTablesPage(){
        return webTablesPage;
    }
    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }
    public ResizablePage getResizablePage() {
        return resizablePage;
    }
    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }
    public SliderPage getSliderPage() {
        return sliderPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }
    public DatePickerPage getDatePickerPage() {
        return datePickerPage;
    }

    public ProgressBarPage getProgressBarPage() {
        return progressBarPage;
    }

    public SelectablePage getSelectablePage() {
        return selectablePage;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome drajveri\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        indexPage = new IndexPage(driver, wait);
        webTablesPage = new WebTablesPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        resizablePage = new ResizablePage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        sliderPage = new SliderPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        datePickerPage = new DatePickerPage(driver, wait);
        progressBarPage = new ProgressBarPage(driver, wait);
        selectablePage = new SelectablePage(driver, wait);
    }

    @BeforeMethod
    public void beforeEachTest() {
        driver.manage().window().maximize();
    }


   @AfterClass

    public void cleanUp() {
        driver.close();
    }

    public void assertVisibilityOfElements(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

}
