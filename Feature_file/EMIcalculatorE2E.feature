Feature: EMI Calculator

  @sanity
  Scenario: Calculate EMI for Car Loan
    Given User already on emicalculator Website
    When User Click on Car Loan button
    And User filled amount in Car Loan Amount TextBox
    And User filled Interest Rate in Interest Rate TextBox
    And User filled Time Periood in Loan Tenure TextBox
    Then User click on Year to capture Months Details
    And User Print Output In console

  @sanity
  Scenario: Calculate EMI for Home Loan
    When User Click on the calculator in the MenuBar
    And User Click on the Home Loan
    And User Enter details
    Then User Print Data in console
    And Write all the details in Excel Sheet

  @sanity
  Scenario: EMI Calculator UI Validation
    Given User Click on the Calculator From Menu
    When User Click On the Loan Calculator
    Then EMI Calculator Text Validation
    And EMI Calculator TextBox validation
    And EMI Calculator Year To Month Conversion Validation
    And EMI calculator Sliders Validation

  @sanity
  Scenario: Loan Amount UI Validation
    Given User click on the Calculator From Menu
    When User Click on the Loan Calculator
    And User Click on the Loan Amount Calculator
    Then Loan Amount Calculator Text Validation
    And Loan Amount Calculator TextBox validation
    And Loan Amount Calculator Year To Month Conversion Validation
    And Loan Amount calculator Sliders Validation

  @sanity
  Scenario: Loan Tenure UI Validation
    Given User click on the Calculator From MenuBar
    When User click on the Loan Calculator
    Then User Click on the Loan Tenure Calculator
    Then Loan Tenure Calculator Text Validation
    Then Loan Tenure Calculator TextBox validation
    Then Loan Tenure calculator Sliders Validation
