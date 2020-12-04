Feature: Add Employee

  Scenario Outline: Create new Employee
  Given A user navigates to LoginPage
   When User enters username as <userName> and password as <password>
   And User clicks on login button
   Then page title is "Home"
    When Search for Add New Employee
    Then User is on Add New Employee page
    And User enters Entity as <entityValue>, EventReason as <eventReason> and Salutation as <salutation>
    And User enters First Name as <firstName>,Middle Name as <middleName>,Last Name as <lastName>,Date Of Birth as <dateOfBirth> and Windows Username as <userID>
    And User Clicks on Continue Button for Personal Information and enters Primary Citizenship as <citizen>
    And User enters Email Type as <emailType>,Primary Email as <primaryEmail> and Email Id as <emailId>
    And User enters Phone Type as <phoneType>,Country code as <countryCode>,Phone Number as <phoneNumber> and Primary phone as <primaryPhone>
    And User enters Street name in Address as <streetName>, Suburb as <suburb>, City as <city> ,State as <state> and Post Code as  <postCode>
   And User Clicks on Continue Button for Job Information and enters Position Number as <positionID>,Working Days per week as <workingDays>
   And User Enters Pay Scale Type as <payScaleType>,Pay Scale Area as <payScaleArea>,Pay Scale Group as <payScaleGroup> and Pay Scale Level as <payScaleLevel>
   And User Enters Contract Type as <contractType>,Annual Leave Quota as<annualLeave>and Personal Leave Quota as <personalLeave>
   And User Clicks on Continue Button for Compensation Information and enters Pay Group as <payGroup> and Deletes One time Payment portlet
   And User Enters Bank Pay Type as <bankType>,Bank Country as <bankCountry>,Bank Account Number as <bankAccountNumber>,Bank Name as <bankName> and Clicks on Submit Button
   Then New Employee is Created



    Examples:
      | userName |password| entityValue|eventReason|salutation|firstName|middleName|lastName|dateOfBirth|userID|citizen|emailType|primaryEmail|emailId|phoneType|countryCode|phoneNumber|primaryPhone|streetName|suburb|city|state|postCode|positionID|workingDays|payScaleType|payScaleArea|payScaleGroup|payScaleLevel|contractType|annualLeave|personalLeave|payGroup|bankType|bankCountry|bankAccountNumber|bankName|
      | DXC_SANKET | Welcome@1234| RDA (5490) | New Hire (HIRNEW)|Mr. |abcd | def    |fgh  |11 Apr 1980   |abcdser|India|Personal Email|Yes   |abcd@gmail.com|Home|AUS (+61)|456654456  |Yes         |76 New Street|Ivanhoe|Melbourne|Victoria|3079|00000983|5    |AUS         |salary      |SAL1         |01           |AUS         |20 Days     |10 Days     |M1      |Main Payment|AUS|11009900      |NAB     |




