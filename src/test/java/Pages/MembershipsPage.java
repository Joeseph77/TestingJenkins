package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MembershipsPage extends CommonMethods {
    public MembershipsPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input#btnAddMembershipDetail")
    public WebElement addMemebershipBtn;
}
