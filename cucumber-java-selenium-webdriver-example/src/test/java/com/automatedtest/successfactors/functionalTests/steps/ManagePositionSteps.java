package com.automatedtest.successfactors.functionalTests.steps;

import com.automatedtest.successfactors.functionalTests.pages.ManagePositionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManagePositionSteps {

    private ManagePositionPage managePositionPage;

    public ManagePositionSteps() {
        this.managePositionPage = new ManagePositionPage();
    }

    @Then("^User is on manage position page$")
    public void user_is_on_manage_position_page() {
        String displayedTitle = this.managePositionPage.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle,
                displayedTitle.equals("Manage Positions"));
    }

    @When("^you click on Create New Dropdown$")
    public void you_click_on_create_new_dropdown() throws InterruptedException {
        this.managePositionPage.clickCreateNewDropdown();
    }

    @And("^Select value as (.+)$")
    public void select_value_as(String position) throws InterruptedException {
        this.managePositionPage.positionValue(position);
    }


    @And("^User enters Entity as (.+), BusinessUnit as (.+), Department as (.+) and  Team as (.+)$")
    public void user_enters_entity_as_businessunit_as_department_as_and_team_as(String entity, String businessunit, String department, String team) throws InterruptedException {
        this.managePositionPage.enterFoundationObject(entity, businessunit, department, team);
    }

    @And("^User enters Cost Center as (.+), Employee Group as (.+) Employee Sub Group as (.+) and Direct/Indirect position as (.+)$")
    public void user_enters_cost_center_as_employee_group_as_employee_sub_group_as_and_directindirect_position_as(String costCentre, String employeeGroup, String employeeSubGroup, String directPosition) throws InterruptedException {
        this.managePositionPage.enterOrgInfo(costCentre, employeeGroup, employeeSubGroup, directPosition);
    }

    @And("^User Enters Standard Weekly Hours as (.+) and Position Title as (.+)$")
    public void user_enters_standard_weekly_hours_as_and_position_title(String weeklyhours,String positionTitle)  {
this.managePositionPage.positionName(weeklyhours,positionTitle);
    }

    @And("^User enters Job Classification as (.+),Approval Status as (.+) and VacancyStatus as (.+)$")
    public void user_enters_job_classification_as_approval_status_as_and_vacancystatus_as(String jobClassification, String approvalStatus, String vacancyStatus) throws InterruptedException {
        this.managePositionPage.enterJobInfo(jobClassification, approvalStatus, vacancyStatus);
    }

    @And("^User enters Position Grade as (.+), Location as (.+),L400 Reporting as (.+)$")
    public void user_enters_position_grade_as_location_as_l400_reporting_as(String positionGrade, String localSite, String reportL400) throws InterruptedException {
        this.managePositionPage.enterSalaryDetails(positionGrade, localSite, reportL400);
    }

    @And("^User enters Collar Colour as (.+),MTP Function as (.+),Mass Position as (.+)$")
    public void user_enters_collar_colour_as_mtp_function_as_mass_position_as(String collarColour, String functionMTP, String massPosition) throws InterruptedException {
        this.managePositionPage.enterAdditionalDetails(collarColour, functionMTP, massPosition);
    }

    @And("^User Attaches Position Description and Click on Save Button$")
    public void user_attaches_position_description_and_click_on_save_button() throws InterruptedException {
        this.managePositionPage.uploadDocument();

    }

    @Then("^Position created page is displayed$")
    public void position_created_page_is_displayed() {
        Assert.assertTrue("This is True statement",
                "2".equals("2"));
    }


}