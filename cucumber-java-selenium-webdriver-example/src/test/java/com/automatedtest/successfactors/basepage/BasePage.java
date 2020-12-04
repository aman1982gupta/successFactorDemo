package com.automatedtest.successfactors.basepage;

import com.automatedtest.successfactors.infrastructure.driver.Setup;
import com.automatedtest.successfactors.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
