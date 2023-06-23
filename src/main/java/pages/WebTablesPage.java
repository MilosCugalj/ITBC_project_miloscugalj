package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage {
    private WebElement addButton;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement ageField;
    private WebElement salaryField;
    private WebElement departmentField;
    private WebElement submitButton;
    private WebElement addedRow;

    public WebTablesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAddButton() {
        this.addButton = getDriver().findElement(By.xpath("//button[@id='addNewRecordButton']"));
        return addButton;
    }

    public WebElement getFirstNameField() {
        this.firstNameField = getDriver().findElement(By.xpath("//input[@id='firstName']"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        this.lastNameField = getDriver().findElement(By.xpath("//input[@id='lastName']"));
        return lastNameField;
    }

    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.xpath("//input[@id='userEmail']"));
        return emailField;
    }

    public WebElement getAgeField() {
        this.ageField = getDriver().findElement(By.xpath("//input[@id='age']"));
        return ageField;
    }

    public WebElement getSalaryField() {
        this.salaryField = getDriver().findElement(By.xpath("//input[@id='salary']"));
        return salaryField;
    }

    public WebElement getDepartmentField() {
        this.departmentField = getDriver().findElement(By.xpath("//input[@id='department']"));
        return departmentField;
    }

    private WebElement getSubmitButton() {
        this.submitButton = getDriver().findElement(By.xpath("//button[@id='submit']"));
        return submitButton;
    }

    public WebElement getAddedRow() {
        this.addedRow = getDriver().findElement(By.xpath("//span[@id='edit-record-4']//*[name()='svg']"));
        return addedRow;
    }

    public WebTablesPage clickAddButton() {
        getAddButton().click();
        return this;
    }

    public WebTablesPage enterFirstNameField(String firstName) {
        getFirstNameField().sendKeys(firstName);
        return this;
    }

    public WebTablesPage enterLastNameField(String lastName) {
        getLastNameField().sendKeys(lastName);
        return this;
    }

    public WebTablesPage enterEmailField(String email) {
        getEmailField().sendKeys(email);
        return this;
    }

    public WebTablesPage enterAgeField(String age) {
        getAgeField().sendKeys(age);
        return this;
    }

    public WebTablesPage enterSalaryField(String salary) {
        getSalaryField().sendKeys(salary);
        return this;
    }

    public WebTablesPage enterDepartmentField(String department) {
        getDepartmentField().sendKeys(department);
        return this;
    }

    public WebTablesPage clickSubmitButton() {
        getSubmitButton().click();
        return this;
    }

    public WebTablesPage open() {
        getDriver().get("https://demoqa.com/webtables");
        return this;
    }

}
