package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends CommonMethods {

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement PimOption;

    @FindBy (id = "welcome")
    public WebElement welcomeText;

    @FindBy (css = "a#menu_pim_viewMyDetails")
    public WebElement myInfoTab;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

}
