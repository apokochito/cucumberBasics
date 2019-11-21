package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("^I navigate to login window on the website$")
    public void iNavigateToLoginWindowOnTheWebsite() {
        System.out.println("I'm navigating to the login window on the website");
    }

    @And("^I enter the UserName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void iEnterTheUserNameAsAndPasswordAs(String username, String password) throws Throwable {
        username = "myUsername";
        password = "myPassword";
        System.out.println("I enter the data for user: " + username + " | pass: " + password);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //List<List<String>> data = table.raw();

        //First way
        //System.out.println("Data: "+data.get(0).get(0));
        //System.out.println("Data: "+data.get(0).get(1));
        //System.out.println("Data: "+data.get(1).get(0));
        //System.out.println("Data: "+data.get(1).get(1));

        //Create an ArrayList, easy way
        List<User> users = new ArrayList<>();
        //Store all the users
        users = table.asList(User.class);
        for (User user: users) {
            System.out.println("The username is "+user.userName);
            System.out.println("The passwords is "+user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("I click the login button");
    }

    @Then("^I should see the UserDetails page$")
    public void iShouldSeeTheUserDetailsPage() {
        System.out.println("I should see the UserDetails page");
    }

    @And("^I enter ([^\"]*) and ([^\"]*) for Login$")
    public void iEnterUserNameAndPasswordForLogin(String userName, String password) {
        System.out.println("Username: "+userName);
        System.out.println("Password: "+password);
    }

    public class User {
        public String userName;
        public String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }
}