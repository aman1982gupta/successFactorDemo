package com.automatedtest.successfactors.functionalTests.pages;

import com.automatedtest.successfactors.basepage.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddEmployeePage extends BasePage {

//    private static final String HOME_PAGE_URL = "https://www.google.";

    @FindBy(id = "__title0-inner")
    private WebElement addNewEmployeeTitle;

    @FindBy(id = "__box0-arrow")
    private WebElement entityArrow;

    @FindBy(id = "__box0-inner")
    private WebElement entityBox;

    @FindBy(xpath = "//ul[@id='__box0-popup-list-listUl']/li")
    private List<WebElement> entityList;

    @FindBy(id = "__box1-arrow")
    private WebElement eventReasonArrow;

    @FindBy(id = "__box1-inner")
    private WebElement eventReasonBox;

    @FindBy(xpath = "//ul[@id='__box1-popup-list-listUl']/li")
    private List<WebElement> eventReasonList;

    @FindBy(id = "__box2-arrow")
    private WebElement salutationArrow;

    @FindBy(id = "__box2-inner")
    private WebElement salutationBox;

    @FindBy(xpath = "//ul[@id='__box2-popup-list-listUl']/li")
    private List<WebElement> salutationList;

    @FindBy(id = "__input0-inner")
    private WebElement firstNameValue;

    @FindBy(id = "__input1-inner")
    private WebElement middleNameValue;

    @FindBy(id = "__input2-inner")
    private WebElement lastNameValue;

    @FindBy(xpath = "//input[@id='__picker1-inner']")
    private WebElement dateOfBirthValue;

    @FindBy(id="__input5-inner")
    private WebElement userIdValue;

    @FindBy(id="__button20-BDI-content")
    private WebElement continueButtonPersInfo;

    @FindBy(id = "__box6-arrow")
    private WebElement citizenArrow;

    @FindBy(id = "__box6-inner")
    private WebElement citizenBox;

    @FindBy(xpath = "//ul[@id='__box6-popup-list-listUl']/li")
    private List<WebElement> citizenList;

    @FindBy(id="__button45-BDI-content")
    private WebElement addButtonEmail;

    @FindBy(id = "__box19-arrow")
    private WebElement emailTypeArrow;

    @FindBy(id = "__box19-inner")
    private WebElement emailTypeBox;

    @FindBy(xpath = "//ul[@id='__box19-popup-list-listUl']/li")
    private List<WebElement> emailTypeList;

    @FindBy(id = "__box20-arrow")
    private WebElement primaryEmailArrow;

    @FindBy(id = "__box20-inner")
    private WebElement primaryEmailBox;

    @FindBy(xpath = "//ul[@id='__box20-popup-list-listUl']/li")
    private List<WebElement> primaryEmailList;

    @FindBy(id="__input15-inner")
    private WebElement primaryEmailId;

    @FindBy(id="__button46-BDI-content")
    private WebElement addButtonPhone;

    @FindBy(id = "__box21-arrow")
    private WebElement phoneTypeArrow;

    @FindBy(id = "__box21-inner")
    private WebElement phoneTypeBox;

    @FindBy(xpath = "//ul[@id='__box21-popup-list-listUl']/li")
    private List<WebElement> phoneTypeList;

    @FindBy(id = "__box22-arrow")
    private WebElement countryCodeArrow;

    @FindBy(id = "__box22-inner")
    private WebElement countryCodeBox;

    @FindBy(xpath = "//ul[@id='__box22-popup-list-listUl']/li")
    private List<WebElement> countryCodeList;

    @FindBy(id="__input16-inner")
    private WebElement primaryPhoneNumber;

    @FindBy(id = "__box23-arrow")
    private WebElement primaryPhoneArrow;

    @FindBy(id = "__box23-inner")
    private WebElement primaryPhoneBox;

    @FindBy(xpath = "//ul[@id='__box23-popup-list-listUl']/li")
    private List<WebElement> primaryPhoneList;

    @FindBy(id="__input10-inner")
    private WebElement addressStreet;

    @FindBy(id="__input12-inner")
    private WebElement addressSuburb;

    @FindBy(id="__input13-inner")
    private WebElement addressCity;

    @FindBy(id = "__box18-arrow")
    private WebElement addressStateArrow;

    @FindBy(id = "__box18-inner")
    private WebElement addressStateBox;

    @FindBy(xpath = "//ul[@id='__box18-popup-list-listUl']/li")
    private List<WebElement> addressStateList;

    @FindBy(id="__input14-inner")
    private WebElement addressPostCode;

    @FindBy(id="__button44-BDI-content")
    private WebElement continueJobInfo;

    @FindBy(id = "__box24-arrow")
    private WebElement positionArrow;

    @FindBy(id = "__box24-inner")
    private WebElement positionBox;

    @FindBy(id = "__input24-inner")
    private WebElement weekHours;

    @FindBy(id = "__box40-arrow")
    private WebElement payScaleTypeArrow;

    @FindBy(id = "__box40-inner")
    private WebElement payScaleTypeBox;

    @FindBy(id = "__box41-arrow")
    private WebElement payScaleAreaArrow;

    @FindBy(id = "__box41-inner")
    private WebElement payScaleAreaBox;

    @FindBy(id = "__box42-arrow")
    private WebElement payScaleGroupArrow;

    @FindBy(id = "__box42-inner")
    private WebElement payScaleGroupBox;

    @FindBy(id = "__box43-arrow")
    private WebElement payScaleLevelArrow;

    @FindBy(id = "__box43-inner")
    private WebElement payScaleLevelBox;

    @FindBy(id = "detailsBtn_1-BDI-content")
    private WebElement showMoreBox;

    @FindBy(id = "__box48-arrow")
    private WebElement contractTypeArrow;

    @FindBy(id = "__box48-inner")
    private WebElement contractTypeBox;

    @FindBy(id = "__box53-arrow")
    private WebElement annualLeaveQuotaArrow;

    @FindBy(id = "__box53-inner")
    private WebElement annualLeaveQuotaBox;

    @FindBy(xpath = "//ul[@id='__box53-popup-list-listUl']/li")
    private List<WebElement> annualLeaveQuotaList;

    @FindBy(id = "__box54-arrow")
    private WebElement personalLeaveQuotaArrow;

    @FindBy(id = "__box54-inner")
    private WebElement personalLeaveQuotaBox;

    @FindBy(xpath = "//ul[@id='__box54-popup-list-listUl']/li")
    private List<WebElement> personalLeaveQuotaList;

    @FindBy(id = "__button68-BDI-content")
    private WebElement continueComp;

    @FindBy(id = "__box59-arrow")
    private WebElement payGroupArrow;

    @FindBy(id = "__box59-inner")
    private WebElement payGroupBox;

    @FindBy(id = "__button98-inner")
    private WebElement oneTimePaymentButton;

    @FindBy(id = "__box64-arrow")
    private WebElement bankPayTypeArrow;

    @FindBy(id = "__box64-inner")
    private WebElement bankPayTypeBox;

    @FindBy(xpath = "//ul[@id='__box64-popup-list-listUl']/li")
    private List<WebElement> bankPayTypeList;

    @FindBy(id = "__box65-arrow")
    private WebElement bankCountryArrow;

    @FindBy(id = "__box65-inner")
    private WebElement bankCountryBox;

    @FindBy(id = "__input34-inner")
    private WebElement bankAccount;

    @FindBy(id = "__box66-arrow")
    private WebElement bankNameArrow;

    @FindBy(id = "__box66-inner")
    private WebElement bankNameBox;

    @FindBy(id = "__button80-BDI-content")
    private WebElement submitButton;


    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return addNewEmployeeTitle.getText();
    }


    void selectFromList(WebElement dropdownArrow, WebElement dropdownBox, List<WebElement> dropdownList, String dropdownValue) throws InterruptedException {
        Thread.sleep(2000);
        dropdownArrow.click();
        Thread.sleep(2000);
        dropdownBox.click();
        System.out.println(dropdownList.size()+"     "+dropdownValue);
        Thread.sleep(2000);
        for(WebElement ew : dropdownList) {
            if (ew.getText().equalsIgnoreCase(dropdownValue)) {
                ew.click();
            }
        }
    }

    void dropdownSelect(WebElement arrow, WebElement box, String boxValue) throws InterruptedException {
        arrow.click();
        Thread.sleep(2000);
        box.sendKeys(boxValue);
        Thread.sleep(2000);
        box.sendKeys(Keys.ARROW_DOWN.toString());
        box.sendKeys(Keys.ENTER.toString());
    }


        public void enterEntityEventReason(String entityValue, String eventReason,String salutation) throws InterruptedException {
       selectFromList(entityArrow,entityBox,entityList,entityValue);
       selectFromList(eventReasonArrow,eventReasonBox,eventReasonList,eventReason);
       selectFromList(salutationArrow,salutationBox,salutationList,salutation);
    }

    public void enterName(String firstName,String middleName,String lastName,String dateOfBirth,String userId){
        firstNameValue.sendKeys(firstName);
        middleNameValue.sendKeys(middleName);
        lastNameValue.sendKeys(lastName);
        dateOfBirthValue.sendKeys(dateOfBirth);
        userIdValue.sendKeys(userId);
    }

    public void primaryCitizen (String citizen) throws InterruptedException{
        continueButtonPersInfo.click();
        Thread.sleep(5000);
       // selectFromList(citizenArrow,citizenBox,citizenList,citizen);
       // dropdownSelect(citizenArrow,citizenBox,citizen);

        citizenArrow.click();
        Thread.sleep(2000);
        citizenBox.sendKeys(citizen);
        Thread.sleep(2000);
        System.out.println(citizenList.size()+"     "+citizen);
        Thread.sleep(2000);
        for(WebElement ew : citizenList) {
            if (ew.getText().equalsIgnoreCase(citizen)) {
                ew.click();
            }
        }




    }

    public void emailDetails (String emailType,String primaryEmail,String emailId) throws InterruptedException{
        Thread.sleep(2000);
        addButtonEmail.click();
        selectFromList(emailTypeArrow,emailTypeBox,emailTypeList,emailType);
        selectFromList(primaryEmailArrow,primaryEmailBox,primaryEmailList,primaryEmail);
        primaryEmailId.sendKeys(emailId);
    }

    public void phoneDetails (String phoneType,String countryCode,String phoneNumber,String primaryPhone) throws InterruptedException{
        addButtonPhone.click();
        selectFromList(phoneTypeArrow,phoneTypeBox,phoneTypeList,phoneType);
        dropdownSelect(countryCodeArrow,countryCodeBox,countryCode);
        primaryPhoneNumber.sendKeys(phoneNumber);
        selectFromList(primaryPhoneArrow,primaryPhoneBox,primaryPhoneList,primaryPhone);
    }

    public void addressDetails(String streetAddress,String suburb,String city,String state,String postCode)throws InterruptedException{
        addressStreet.sendKeys(streetAddress);
        addressSuburb.sendKeys(suburb);
        addressCity.sendKeys(city);
        selectFromList(addressStateArrow,addressStateBox,addressStateList,state);
        addressPostCode.sendKeys(postCode);

    }

    public void positionDetail(String positionid,String workingdays) throws InterruptedException{
     continueJobInfo.click();
     Thread.sleep(5000);
     dropdownSelect(positionArrow,positionBox,positionid);
     Thread.sleep(5000);
     weekHours.sendKeys(workingdays);
    }

    public void payComponents(String payscaletype, String payscalearea, String payscalegroup, String payscalelevel) throws InterruptedException{
     dropdownSelect(payScaleTypeArrow,payScaleTypeBox,payscaletype);
        dropdownSelect(payScaleAreaArrow,payScaleAreaBox,payscalearea);
        dropdownSelect(payScaleGroupArrow,payScaleGroupBox,payscalegroup);
        dropdownSelect(payScaleLevelArrow,payScaleLevelBox,payscalelevel);
    }

    public void leaveQuotaDetails(String contracttype, String annualleave, String personalleave) throws InterruptedException{
      showMoreBox.click();
      Thread.sleep(4000);
      dropdownSelect(contractTypeArrow,contractTypeBox,contracttype);
      selectFromList(annualLeaveQuotaArrow,annualLeaveQuotaBox,annualLeaveQuotaList,annualleave);
      selectFromList(personalLeaveQuotaArrow,personalLeaveQuotaBox,personalLeaveQuotaList,personalleave);
    }

    public void payGroupdetails(String paygroup) throws InterruptedException{
        continueComp.click();
      Thread.sleep(10000);
      dropdownSelect(payGroupArrow,payGroupBox,paygroup);
      Thread.sleep(2000);
      oneTimePaymentButton.click();

    }

    public void bankDetails(String banktype, String bankcountry, String bankaccountnumber, String bankname) throws InterruptedException{

        Thread.sleep(2000);
     dropdownSelect(bankPayTypeArrow,bankPayTypeBox,banktype);
       Thread.sleep(2000);
     dropdownSelect(bankCountryArrow,bankCountryBox,bankcountry);
     bankAccount.sendKeys(bankaccountnumber);
     Thread.sleep(2000);
     dropdownSelect(bankNameArrow,bankNameBox,bankname);
     Thread.sleep(4000);
     submitButton.click();
    // Thread.sleep(20000);
    }


}

