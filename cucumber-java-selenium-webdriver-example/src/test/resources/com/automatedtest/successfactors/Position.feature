Feature: Position

  Scenario Outline: Create new Position
    Given A user navigates to LoginPage
    When User enters username as <userName> and password as <password>
    And User clicks on login button
    Then page title is "Home"
    When Search for Manage Positions
    Then User is on manage position page
    And you click on Create New Dropdown
    And Select value as Position
    And User enters Entity as <entity>, BusinessUnit as <businessUnit>, Department as <department> and  Team as <team>
    And User enters Cost Center as <costCentre>, Employee Group as <employeeGroup> Employee Sub Group as <employeeSubGroup> and Direct/Indirect position as <directPosition>
    And User Enters Standard Weekly Hours as <weeklyHours> and Position Title as <positionTitle>
    And User enters Job Classification as <jobClassification>,Approval Status as <approvalStatus> and VacancyStatus as <vacancyStatus>
    And User enters Position Grade as <positionGrade>, Location as <localSite>,L400 Reporting as <reportL400>
    And User enters Collar Colour as <collarColour>,MTP Function as <functionMTP>,Mass Position as <massPosition>
    And User Attaches Position Description and Click on Save Button
    Then Position created page is displayed



    Examples:
      | userName |password| entity|businessUnit|department|team|costCentre|employeeGroup|employeeSubGroup|directPosition|weeklyHours|positionTitle|jobClassification|approvalStatus|vacancyStatus|positionGrade|localSite|reportL400|collarColour|functionMTP|massPosition|
      | DXC_SANKET | Welcome@1234| RDA | VSAP_RDA | IT    |IT  |RDA1415   |Regular      |Hourly Full Time|0001          |38         |Demo Position 5|OTHER            |Approved      |OPN          |12           |Melbourne|L400P2    |White       |IT         |Yes         |




