package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        doClick(addEmp.pimTab);

    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        doClick(addEmp.addEmp);
    }

    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {

        sendText(addEmp.firstNameTextBox, ConfigReader.getPropertyValue("firstname"));


        sendText(addEmp.middleNameTextBox, ConfigReader.getPropertyValue("middlename"));


        sendText(addEmp.lastNameTextBox, ConfigReader.getPropertyValue("lastname"));

    }

    @When("user enters an employee id")
    public void user_enters_an_employee_id() {
        sendText(addEmp.empIDTextBox, ConfigReader.getPropertyValue("empid"));
    }

    @When("user enters an employee id {string}")
    public void user_enters_an_employee_id(String string) {
        sendText(addEmp.empIDTextBox, string);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {

        doClick(addEmp.saveBtn);
        Thread.sleep(3000);
    }

    @Then("new employee data is added")
    public void new_employee_data_is_added() {
        //     assertion that employee data is successfully added

        String actualText = personalDetailsPage.personalDetailsText.getText();
        String expText = "Personal Details";
        Assert.assertEquals(expText, actualText);

    }
}

