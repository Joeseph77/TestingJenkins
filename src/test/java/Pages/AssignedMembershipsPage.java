package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AssignedMembershipsPage extends CommonMethods {
    public AssignedMembershipsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//table[@class='table hover']/tbody/tr/td[2]")
    public List<WebElement> assignedMemberships;

}
