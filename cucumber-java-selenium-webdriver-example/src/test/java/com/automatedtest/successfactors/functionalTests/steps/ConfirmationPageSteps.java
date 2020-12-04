package com.automatedtest.successfactors.functionalTests.steps;

import com.automatedtest.successfactors.functionalTests.pages.ConfirmationPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ConfirmationPageSteps {

    private ConfirmationPage confirmationPage;

    public ConfirmationPageSteps() {
        this.confirmationPage = new ConfirmationPage();
    }

//    @Then("^Position created page is displayed$")
//    public void position_created_page_is_displayed() {
//        String displayedText = this.confirmationPage.getPositionCreatedText();
//        Assert.assertTrue("Displayed text is " + displayedText,
//                displayedText.contentEquals("Position Dates"));
//    }
}

