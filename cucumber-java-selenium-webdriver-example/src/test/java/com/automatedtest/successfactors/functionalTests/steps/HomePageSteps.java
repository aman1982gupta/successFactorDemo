package com.automatedtest.successfactors.functionalTests.steps;

import com.automatedtest.successfactors.functionalTests.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void page_title_is_something(String title) {
        String displayedTitle = this.homePage.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                displayedTitle.contains(title));
    }

//    @When("^Click on Search Button$")
//    public void click_on_search_button(){
//        this.homePage.click_on_search_button();
//
//    }

    @When("^Search for (.+)$")
    public void search_for_something(String manage) throws InterruptedException {
        this.homePage.search_for_something(manage);
    }

}

