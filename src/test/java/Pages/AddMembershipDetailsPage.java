package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddMembershipDetailsPage extends CommonMethods {
    public AddMembershipDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    //  @FindBy(id = "membership_membership")
    @FindBy(xpath = "//select[@name='membership[membership]']")
    public WebElement membershipDropdown;

    @FindBy(css = "select#membership_subscriptionPaidBy")
    public WebElement subscriptionPaidByDD;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subscriptionAmountBox;

    @FindBy(css = "select#membership_currency")
    public WebElement currencyBox;

    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement subCommenceDate;

    @FindBy(css = "select.ui-datepicker-month")
    public WebElement commenceMonth;

    // @FindBy(xpath= "//select[@class='ui-datepicker-year']")
    @FindBy(css = "select.ui-datepicker-year")
    public WebElement commenceYear;

    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement subRenewalDate;
    @FindBy(css = "input#btnSaveMembership")
    public WebElement btnSaveMembership;


    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> days;

}
