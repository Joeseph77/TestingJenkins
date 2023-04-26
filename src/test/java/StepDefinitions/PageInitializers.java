package StepDefinitions;


import Pages.*;

public class PageInitializers {

    public static LoginPage login;
    public static AddEmployeePage addEmp;
    public static DashboardPage dash;
    public static PersonalDetailsPage personalDetailsPage;
    public static AddMembershipDetailsPage addMembershipDetailsPage;
    public static MembershipsPage membershipsPage;
    public static AssignedMembershipsPage assignedMembershipsPage;

    public static void initializePageObjects(){
        login=new LoginPage();
        addEmp=new AddEmployeePage();
        dash=new DashboardPage();
        personalDetailsPage=new PersonalDetailsPage();
        addMembershipDetailsPage = new AddMembershipDetailsPage();
        membershipsPage = new MembershipsPage();
        assignedMembershipsPage =new AssignedMembershipsPage();
    }
}