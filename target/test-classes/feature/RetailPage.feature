Feature: Retail Test Environment

  Background: 
    Given User is on retail Website
    When User click on myAccount
    And User click on login option
    And User enter userName "abdul.mansoor15@gmail.com" and password "123456"
    And User click on login button
    Then User should be logged into myAccount page
  @AWCC
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website     | taxID  | paymentMethod | Payee Name |
      | AWCC    | AWCC.us.com | 654321 | Cheque        | AWCC data center  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
  @AWCC
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | PINNumber | swiftCode | accountName | accountNumber |
      | AIB      | 123@cd    |    232323 | AWCC        | 5212521236251 |
    And User click on second continue button
    Then User should validate a success message

  @AWCC
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email              | telephone  |
      | Abdul     | Azizi    | abdul.mansoor15@gmail.com | 4445556667 |
    And User click on third continue button
    Then User should see a message Success: Your account has been successfully updated
