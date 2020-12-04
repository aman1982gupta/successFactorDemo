package com.automatedtest.successfactors.functionalTests.pages;

import com.automatedtest.successfactors.basepage.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage{

    @FindBy(id = "bizXSearchField-I")
    private WebElement searchButton;

    @FindBy(id = "bizXSearchField-I")
    private WebElement manageP;

    @FindBy(xpath = "//li[contains(text(),'Manage Positions')]")
    private WebElement searchedItem;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void click_on_search_button(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
//        wait.forLoading(5);
        searchButton.click();
    }

    public void search_for_something(String manage) throws InterruptedException{
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOf(searchButton));
        wait.forLoading(10);
        searchButton.click();
        manageP.sendKeys(manage);
        Thread.sleep(2000);
        manageP.sendKeys(Keys.ENTER.toString());
        Thread.sleep(2000);
        manageP.sendKeys(Keys.ENTER.toString());
    }

    public void clickSearchedItem(){
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOf(searchedItem));
  //      searchedItem.click();
//        wait.forLoading(5);
    }


}
