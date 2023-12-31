package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    public AddEmployeePage() {
        //created a constructor to initialize the webelements with the driver
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy (id="menu_pim_addEmployee")
    public WebElement addEmp;

    @FindBy(id= "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id= "middleName")
    public WebElement middleNameTextBox;

    @FindBy(id= "lastName")
    public WebElement lastNameTextBox;

    @FindBy(css = "input#employeeId")
    public WebElement empIDTextBox;

    @FindBy(id= "btnSave")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(),'Required')]")
    public WebElement validRequired;

    @FindBy(xpath = "//h1[contains(text(),'Add Employee')]")
    public WebElement addEmployeeText;
}
