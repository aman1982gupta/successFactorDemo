package com.automatedtest.successfactors.functionalTests.pages;

import com.automatedtest.successfactors.basepage.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePositionPage extends BasePage {

//    private static final String HOME_PAGE_URL = "https://www.google.";

    @FindBy(id = "9__pageTitle")
    private WebElement positionTitle;

    @FindBy(id = "48__write_toggle")
    private WebElement createNewDropdown;

    @FindBy(xpath = "//a[@title='Position']")
    private WebElement selectPosition;

//        @FindBy(id ="51_item1")
//    private WebElement selectPosition;

    @FindBy(id = "249__title")
    private WebElement orgInfo;

    @FindBy(id = "259__write_toggle")
    private WebElement entityBox;

    @FindBy(id = "259__write")
    private WebElement entityValue;

    @FindBy(id = "301__write_toggle")
    private WebElement businessUnitBox;

    @FindBy(id = "301__write")
    private WebElement businessUnitValue;

    @FindBy(id = "343__write_toggle")
    private WebElement departmentBox;

    @FindBy(id = "343__write")
    private WebElement departmentValue;

    @FindBy(id = "385__write_toggle")
    private WebElement teamBox;

    @FindBy(id = "385__write")
    private WebElement teamValue;

    @FindBy(id = "427__write_toggle")
    private WebElement costCentreBox;

    @FindBy(id = "427__write")
    private WebElement costCentreValue;

    @FindBy(id = "465__write_toggle")
    private WebElement employeeGroupBox;

    @FindBy(id = "465__write")
    private WebElement employeeGroupValue;

    @FindBy(id = "483__write_toggle")
    private WebElement employeeSubGroupBox;

    @FindBy(id = "483__write")
    private WebElement employeeSubGroupValue;

    @FindBy(id = "509__write_toggle")
    private WebElement directPositionBox;

    @FindBy(id = "509__write")
    private WebElement directPositionValue;

    @FindBy(id = "498__write")
    private WebElement weeklyHoursValue;

    @FindBy(id = "596__write")
    private WebElement positionNameValue;

    @FindBy(id = "701__write_toggle")
    private WebElement jobClassificationBox;

    @FindBy(id = "701__write")
    private WebElement jobClassificationValue;


    @FindBy(id = "739__write_toggle")
    private WebElement approvalStatusBox;

    @FindBy(id = "739__write")
    private WebElement approvalStatusValue;


    @FindBy(id = "757__write_toggle")
    private WebElement vacancyStatusBox;

    @FindBy(id = "757__write")
    private WebElement vacancyStatusValue;

    @FindBy(id = "915__write_toggle")
    private WebElement positionGradeBox;

    @FindBy(id = "915__write")
    private WebElement positionGradeValue;

    @FindBy(id = "861__write_toggle")
    private WebElement localSiteBox;

    @FindBy(id = "861__write")
    private WebElement localSiteValue;

    @FindBy(id = "1019__write_toggle")
    private WebElement reportL400Box;

    @FindBy(id = "1019__write")
    private WebElement reportL400Value;

    @FindBy(id = "1055__write_toggle")
    private WebElement collarColourBox;

    @FindBy(id = "1055__write")
    private WebElement collarColourValue;

    @FindBy(id = "1077__write_toggle")
    private WebElement functionMTPBox;

    @FindBy(id = "1077__write")
    private WebElement functionMTPValue;

    @FindBy(id = "1184__write_toggle")
    private WebElement massPositionBox;

    @FindBy(id = "1184__write")
    private WebElement massPositionValue;

    @FindBy(id = "attachment_alt")
    private WebElement clickAttachment;

    @FindBy(xpath = "//input[@name='fileData1']")
    private WebElement selectDocument;

    @FindBy(xpath = "//button[normalize-space()=\"Upload\"]")
    private WebElement uploadButton;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    private WebElement saveButton;

    public ManagePositionPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return positionTitle.getText();
    }

    public void clickCreateNewDropdown() throws InterruptedException {

        Thread.sleep(2000);
        createNewDropdown.click();
         Thread.sleep(2000);
    }

    public void positionValue(String position) throws InterruptedException {
        selectPosition.click();
        Thread.sleep(5000);
    }


    public void enterFoundationObject(String entity, String businessUnit, String department, String team) throws InterruptedException {
        selectFromDropdown(entityBox, entityValue, entity);
        selectFromDropdown(businessUnitBox, businessUnitValue, businessUnit);
        selectFromDropdown(departmentBox, departmentValue, department);
        selectFromDropdown(teamBox, teamValue, team);

    }

    public void enterOrgInfo(String costCentre, String employeeGroup, String employeeSubGroup, String directPosition) throws InterruptedException {
        selectFromDropdown(costCentreBox, costCentreValue, costCentre);
        selectFromDropdown(employeeGroupBox, employeeGroupValue, employeeGroup);
        selectFromDropdown(employeeSubGroupBox, employeeSubGroupValue, employeeSubGroup);
        selectFromDropdown(directPositionBox, directPositionValue, directPosition);

    }

    public void positionName(String weeklyHours,String positionTitle){
        weeklyHoursValue.sendKeys(weeklyHours);
        weeklyHoursValue.sendKeys(Keys.TAB);
        positionNameValue.sendKeys(positionTitle);
        positionNameValue.sendKeys(Keys.TAB);

    }

    public void enterJobInfo(String jobClassification, String approvalStatus, String vacancyStatus) throws InterruptedException {
        //weeklyHoursValue.sendKeys(weeklyHours);
        Thread.sleep(4000);
        selectFromDropdown(jobClassificationBox, jobClassificationValue, jobClassification);
        selectFromDropdown(approvalStatusBox, approvalStatusValue, approvalStatus);
        selectFromDropdown(vacancyStatusBox, vacancyStatusValue, vacancyStatus);
    }

    public void enterSalaryDetails(String positionGrade, String localSite, String reportL400) throws InterruptedException {
        selectFromDropdown(positionGradeBox, positionGradeValue, positionGrade);
        Thread.sleep(2000);
        selectFromDropdown(localSiteBox, localSiteValue, localSite);
        Thread.sleep(2000);
        selectFromDropdown(reportL400Box, reportL400Value, reportL400);

    }

    public void enterAdditionalDetails(String collarColour, String functionMTP, String massPosition) throws InterruptedException {
        selectFromDropdown(collarColourBox, collarColourValue, collarColour);
        selectFromDropdown(functionMTPBox, functionMTPValue, functionMTP);
        selectFromDropdown(massPositionBox, massPositionValue, massPosition);

    }

    void selectFromDropdown(WebElement drop, WebElement dropValue, String value) throws InterruptedException {
        drop.click();
        Thread.sleep(2000);
        dropValue.sendKeys(value);
        Thread.sleep(2000);
        dropValue.sendKeys(Keys.ARROW_DOWN.toString());
        dropValue.sendKeys(Keys.ENTER.toString());
    }


    public void uploadDocument() throws InterruptedException {
        clickAttachment.click();
        Thread.sleep(2000);

        selectDocument.sendKeys("G:\\Create Position.docx");

        Thread.sleep(2000);

        uploadButton.click();

        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        saveButton.click();
        Thread.sleep(20000);
    }

}
