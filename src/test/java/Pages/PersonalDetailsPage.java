package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends CommonMethods {
    public PersonalDetailsPage() {
        //created a constructor to initialize the webelements with the driver
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Personal Details')]")
    public WebElement personalDetailsText;


}
