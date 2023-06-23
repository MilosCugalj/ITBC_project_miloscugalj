package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTablesTest extends BaseTest {

    String validFirstName = "Jimmy";
    String invalidFirstName = "";
    String validLastName = "McNulty";
    String invalidLastName = "";
    String validEmail = "jimmymcnulty@bdp.org";
    String invalidEmail = "jimmy@bd.o";
    String validAge = "33";
    String invalidAge = "";
    String validSalary = "3000";
    String invalidSalary = "";
    String validDepartment = "BDP";
    String invalidDepartment = "";


    @Test(priority = 20)
    public void verifyWithAllValidInputs() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(validEmail)
                .enterAgeField(validAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        assertVisibilityOfElements(getWebTablesPage().getAddedRow());
    }

    @Test
    public void verifyWithInvalidFirstName() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(invalidFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(validEmail)
                .enterAgeField(validAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getFirstNameField().getCssValue("border-value"), "rgb(40, 167, 69)");
    }

    @Test
    public void verifyWithInvalidLastName() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(invalidLastName)
                .enterEmailField(validEmail)
                .enterAgeField(validAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getLastNameField().getCssValue("border-value"), "rgb(40, 167, 69)");

    }

    @Test
    public void verifyWithInvalidEmail() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(invalidEmail)
                .enterAgeField(validAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getEmailField().getCssValue("border-value"), "rgb(40, 167, 69)");

    }

    @Test
    public void verifyWithInvalidAge() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(validEmail)
                .enterAgeField(invalidAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getAgeField().getCssValue("border-value"), "rgb(40, 167, 69)");

    }

    @Test
    public void verifyWithInvalidSalary() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(validEmail)
                .enterAgeField(validAge)
                .enterSalaryField(invalidSalary)
                .enterDepartmentField(validDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getSalaryField().getCssValue("border-value"), "rgb(40, 167, 69)");
    }

    @Test
    public void verifyWithInvalidDepartment() {
        getWebTablesPage().open()
                .clickAddButton()
                .enterFirstNameField(validFirstName)
                .enterLastNameField(validLastName)
                .enterEmailField(validEmail)
                .enterAgeField(validAge)
                .enterSalaryField(validSalary)
                .enterDepartmentField(invalidDepartment)
                .clickSubmitButton();
        Assert.assertNotEquals(getWebTablesPage().getDepartmentField().getCssValue("border-value"), "rgb(40, 167, 69)");
    }


}
