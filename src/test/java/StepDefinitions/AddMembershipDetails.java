package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddMembershipDetails extends CommonMethods {

    @When("user enters a valid email {string} and password {string}:")
    public void user_enters_a_valid_email_and_password(String string, String string2) {
        sendText(login.usernameTextBox, string);
        sendText(login.passwordTextBox, string2);
    }

    @When("clicks on My info")
    public void clicks_on_my_info() {
        doClick(dash.myInfoTab);
    }

    @When("clicks on Memberships")
    public void clicks_on_memberships() {
        doClick(personalDetailsPage.membershipsTab);
    }

    @When("clicks on Add")
    public void clicks_on_add() {
        doClick(membershipsPage.addMemebershipBtn);

    }

    @Then("user selects MembershipType")
    public void user_selects_membership_type() throws InterruptedException {
        Select sel = new Select(addMembershipDetailsPage.membershipDropdown);
        sel.selectByValue("991");
        Thread.sleep(2000);

    }

    @Then("user selects Subscription Paid By")
    public void user_selects_subscription_paid_by() throws InterruptedException {
        Select sel = new Select(addMembershipDetailsPage.subscriptionPaidByDD);
        sel.selectByValue("Company");
        Thread.sleep(2000);
    }

    @Then("user enters Subscription Amount")
    public void user_enters_Subscription_amount() {
        sendText(addMembershipDetailsPage.subscriptionAmountBox, "50");
    }

    @Then("user selects Currency")
    public void user_selects_currency() throws InterruptedException {
        Select sel = new Select(addMembershipDetailsPage.currencyBox);
        sel.selectByVisibleText("United States Dollar");
        Thread.sleep(3000);

    }

    @Then("user selects Subscription Commence Date")
    public void user_selects_subscription_commence_date() throws InterruptedException {
        doClick(addMembershipDetailsPage.subCommenceDate);
        Select sel = new Select(addMembershipDetailsPage.commenceMonth);
        sel.selectByVisibleText("May");
        sel = new Select(addMembershipDetailsPage.commenceYear);
        sel.selectByVisibleText("2020");
        // doClick(addMembershipDetailsPage.subCommenceDate);

        boolean isFound = false;
        while (!isFound) {
            for (WebElement day : addMembershipDetailsPage.days) {
                String day_text = day.getText();
                if (day_text.equalsIgnoreCase("20")) {
                    day.click();
                    isFound = true;
                    break;
                }
            }
        }
        Thread.sleep(5000);
    }

    @Then("user selects Subscription Renewal Date")
    public void user_selects_subscription_renewal_date() throws InterruptedException {
        doClick(addMembershipDetailsPage.subRenewalDate);
        Select sel = new Select(addMembershipDetailsPage.commenceMonth);
        sel.selectByVisibleText("Oct");
        sel = new Select(addMembershipDetailsPage.commenceYear);
        sel.selectByVisibleText("2024");
        Thread.sleep(5000);

        boolean isFound = false;
        while (!isFound) {
            for (WebElement day : addMembershipDetailsPage.days) {
                String day_text = day.getText();
                if (day_text.equalsIgnoreCase("7")) {
                    day.click();
                    isFound = true;
                    break;
                }
            }
        }
        Thread.sleep(5000);
    }

    @Then("user clicks on membership save button")
    public void user_clicks_on_membership_save_button() {
        doClick(addMembershipDetailsPage.btnSaveMembership);
    }

    @When("selects to delete a certain Memberships")
    public void selects_to_delete_a_certain_memberships() throws InterruptedException {
        for (int i = 0; i < assignedMembershipsPage.assignedMemberships.size(); i++) {
//            extract the text
            String text = assignedMembershipsPage.assignedMemberships.get(i).getText();
            if (text.equalsIgnoreCase("Tennis")) {
                System.out.println(text + " i = " + i);
                System.out.println("check the check box");
                driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]")).click();
                //break;
            }
        }
        Thread.sleep(12000);
    }
}