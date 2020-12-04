package com.automatedtest.successfactors.functionalTests.pages;

import com.automatedtest.successfactors.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{

    private static final String LOGIN_URL = "https://performancemanager10.successfactors.com/login?company=dxctechnolD2";

    @FindBy(xpath = "(//input[@name='username'])")
    private WebElement userId;

    @FindBy(xpath = "(//input[@name='password'])")
    private WebElement userPassword;

    @FindBy(id = "__button2-BDI-content")
    private WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void a_user_navigates_to_loginpage(){
        driver.get(LOGIN_URL);
        wait.forLoading(5);
    }

    public void user_enters_username_as_and_password_as(String userName, String password){
        userId.sendKeys(userName);
        userPassword.sendKeys(password);

    }

    public void user_clicks_on_login_button(){
        loginButton.click();
    }

//    void goToHomePage(String country){
//        driver.get(LOGIN_URL + country);
//        wait.forLoading(5);
//    }
//
//    void checkLogoDisplay() {
//        wait.forElementToBeDisplayed(5, this.logo, "Logo");
//    }
//
//    String getTitle() {
//        return driver.getTitle();
//    }
//
//    void checkSearchBarDisplay() {
//        wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
//    }
//
//    void searchFor(String searchValue) {
//        this.searchInput.sendKeys(searchValue);
//        this.searchInput.sendKeys(Keys.ENTER);
//    }
}
