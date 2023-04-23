package StepDefinitions;

//import Pages.DashboardPage;   ***  to delete // after code merging
import Pages.LoginPage;

public class PageInitializer {
    // this class will manage the object creation of different page objects in our framework
    // instead o calling the page objects again and again, this class will take good care of that step

    public static LoginPage login;
    //public static DashboardPage addEmployeePage;   ***to delete // after code merging
    public static void initializePageObjects(){
        login = new LoginPage();
     //   dashboardPage = new DashboardPage();        *** to delete // after code merging
    }
}
