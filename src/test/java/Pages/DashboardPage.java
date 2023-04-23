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

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

}
