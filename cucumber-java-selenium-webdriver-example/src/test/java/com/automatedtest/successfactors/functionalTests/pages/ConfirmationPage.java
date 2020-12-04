package com.automatedtest.successfactors.functionalTests.pages;

import com.automatedtest.successfactors.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Position Dates')]")
    private WebElement positionCreated;

    public String getPositionCreatedText(){
        wait.forLoading(10);
        return positionCreated.getText();
    }


}
