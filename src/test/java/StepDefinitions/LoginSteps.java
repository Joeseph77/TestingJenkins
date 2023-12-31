package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.PageInitializers.dash;
import static StepDefinitions.PageInitializers.login;

public class LoginSteps extends CommonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
        openBrowserAndLaunchApplication();

    }
    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
        sendText(login.usernameTextBox,"Admin");
        sendText(login.passwordTextBox,"Hum@nhrm123");

    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() {
        doClick(login.loginBtn);
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
//     assertion that you are logged in

        String actualMsg=dash.welcomeText.getText();
        String expMsg="Welcome Admin";
        Assert.assertEquals(expMsg,actualMsg);
    }

    @When("user enters a username {string} and password {string}")
    public void user_enters_a_username_and_password(String username, String password) {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(usernameTextBox,username);
        sendText(passwordTextBox,password);
    }
    @Then("the user is not logged in")
    public void the_user_is_not_logged_in() {
        System.out.println("the user is not logged in");
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
        sendText(login.usernameTextBox,username);
        sendText(login.passwordTextBox,password);
    }
    @Then("user see a message {string}")
    public void user_see_a_message(String expectedErrorMsg) {
        String actualError=login.errorLogin.getText();
        Assert.assertEquals(expectedErrorMsg,actualError);
    }
}

