package StepDefinitions;


import Pages.AddEmployeePage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.PersonalDetailsPage;
import Utils.CommonMethods;

public class PageInitializers {

    public static LoginPage login;
    public static AddEmployeePage addEmp;
    public static DashboardPage dash;
    public static PersonalDetailsPage personalDetailsPage;

    public static void initializePageObjects(){
        login=new LoginPage();
        addEmp=new AddEmployeePage();
        dash=new DashboardPage();
        personalDetailsPage=new PersonalDetailsPage();
    }
}