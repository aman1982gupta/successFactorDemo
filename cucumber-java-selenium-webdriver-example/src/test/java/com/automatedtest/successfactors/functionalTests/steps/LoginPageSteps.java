package com.automatedtest.successfactors.functionalTests.steps;

import com.automatedtest.successfactors.functionalTests.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("^A user navigates to LoginPage$")
    public void a_user_navigates_to_loginpage() throws Throwable {
        this.loginPage.a_user_navigates_to_loginpage();
    }

    @When("^User enters username as (.+) and password as (.+)$")
    public void user_enters_username_as_and_password_as(String username, String password) {
        this.loginPage.user_enters_username_as_and_password_as(username, password);
    }

    @When("^User clicks on login button$")
    public void user_clicks_on_login_button() {
        this.loginPage.user_clicks_on_login_button();
    }

}
