package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("^User is on net banking login page$")
    public void user_is_on_net_banking_login_page(){
    //code to navigate to login url
        System.out.println("Code to navigate to login url");
    }
    @When("^User logs into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_into_application_with_username_and_password(String arg1, String arg2){
    //code to login with username and password
        System.out.println("Logged in with username and password");
        System.out.println(arg1 + " " + arg2);
    }
    @Then("^Home Page is displayed$")
    public void home_page_is_displayed(){
    //home page validation
        System.out.println("Home page validated");
    }
    @And("^Card details are \"([^\"]*)\"$")
    public void card_details_are(String str) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(str);
    }
}
