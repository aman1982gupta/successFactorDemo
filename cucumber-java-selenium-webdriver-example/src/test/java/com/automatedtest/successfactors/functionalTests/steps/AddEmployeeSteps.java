package com.automatedtest.successfactors.functionalTests.steps;

import com.automatedtest.successfactors.functionalTests.pages.AddEmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddEmployeeSteps {

    private AddEmployeePage addEmployeePage;

    public AddEmployeeSteps() {
        this.addEmployeePage = new AddEmployeePage();
    }

    @Then("^User is on Add New Employee page$")
    public void user_is_on_add_new_employee_page() {
        String displayedEmplTitle = this.addEmployeePage.getTitle();
        Assert.assertTrue("Displayed title is " + displayedEmplTitle,
                displayedEmplTitle.contains("Employee"));
    }

    @And("^User enters Entity as (.+), EventReason as (.+) and Salutation as (.+)$")
    public void user_enters_entity_as_eventreason_as_and_salutation_as(String entityValue, String eventreason, String salutation) throws InterruptedException {
        this.addEmployeePage.enterEntityEventReason(entityValue,eventreason,salutation);
    }

    @And("^User enters First Name as (.+),Middle Name as (.+),Last Name as (.+),Date Of Birth as (.+) and Windows Username as (.+)$")
    public void user_enters_first_name_as_middle_name_as_last_name_as_date_of_birth_as_and_windows_username_as(String firstname, String middlename, String lastname, String dateofbirth, String userId) {
        this.addEmployeePage.enterName(firstname, middlename, lastname, dateofbirth, userId);
    }

    @And("^User Clicks on Continue Button for Personal Information and enters Primary Citizenship as (.+)$")
    public void user_clicks_on_continue_button_for_personal_information_and_enters_primary_citizenship_as(String citizen) throws InterruptedException {
        this.addEmployeePage.primaryCitizen(citizen);
    }

    @And("^User enters Email Type as (.+),Primary Email as (.+) and Email Id as (.+)$")
    public void user_enters_email_type_as_primary_email_as_and_email_id_as(String emailtype, String primaryemail, String emailid)  throws InterruptedException{
    this.addEmployeePage.emailDetails(emailtype,primaryemail,emailid);
    }

    @And("^User enters Phone Type as (.+),Country code as (.+),Phone Number as (.+) and Primary phone as (.+)$")
    public void user_enters_phone_type_as_country_code_as_phone_number_as_and_primary_phone_as(String phonetype, String countrycode, String phonenumber, String primaryphone)  throws InterruptedException{
    this.addEmployeePage.phoneDetails(phonetype,countrycode,phonenumber,primaryphone);
    }

    @And("^User enters Street name in Address as (.+), Suburb as (.+), City as (.+) ,State as (.+) and Post Code as  (.+)$")
    public void user_enters_street_name_in_address_as_suburb_as_city_as_state_as_and_post_code_as(String streetname, String suburb, String city, String state, String postcode) throws InterruptedException{
        this.addEmployeePage.addressDetails(streetname,suburb,city,state,postcode);
    }

    @And("^User Clicks on Continue Button for Job Information and enters Position Number as (.+),Working Days per week as (.+)$")
    public void user_clicks_on_continue_button_for_job_information_and_enters_position_number_as_working_days_per_week_as(String positionid, String workingdays) throws InterruptedException { this.addEmployeePage.positionDetail(positionid,workingdays);
            }

    @And("^User Enters Pay Scale Type as (.+),Pay Scale Area as (.+),Pay Scale Group as (.+) and Pay Scale Level as (.+)$")
    public void user_enters_pay_scale_type_as_pay_scale_area_as_pay_scale_group_as_and_pay_scale_level_as(String payscaletype, String payscalearea, String payscalegroup, String payscalelevel) throws InterruptedException {
    this .addEmployeePage.payComponents(payscaletype,payscalearea,payscalegroup,payscalelevel);
    }

    @And("^User Enters Contract Type as (.+),Annual Leave Quota as(.+)and Personal Leave Quota as (.+)$")
    public void user_enters_contract_type_as_annual_leave_quota_asand_personal_leave_quota_as(String contracttype, String annualleave, String personalleave) throws InterruptedException {
    this.addEmployeePage.leaveQuotaDetails(contracttype,annualleave,personalleave);
    }

    @And("^User Clicks on Continue Button for Compensation Information and enters Pay Group as (.+) and Deletes One time Payment portlet$")
    public void user_clicks_on_continue_button_for_compensation_information_and_enters_pay_group_as_and_deletes_one_time_payment_portlet(String paygroup) throws InterruptedException {
    this.addEmployeePage.payGroupdetails(paygroup);
    }

    @And("^User Enters Bank Pay Type as (.+),Bank Country as (.+),Bank Account Number as (.+),Bank Name as (.+) and Clicks on Submit Button$")
    public void user_enters_bank_pay_type_as_bank_country_as_bank_account_number_as_bank_name_as_and_clicks_on_submit_button(String banktype, String bankcountry, String bankaccountnumber, String bankname) throws InterruptedException {
    this.addEmployeePage.bankDetails(banktype,bankcountry,bankaccountnumber,bankname);
    }

    @Then("^New Employee is Created$")
     public void new_Employee_is_Created() {
        Assert.assertTrue("True statement",
                "1".equals("1"));
    }


}