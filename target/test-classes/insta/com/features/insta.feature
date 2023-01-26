
Feature: Instagram Login Test Case-Automation 

  @Insta
  Scenario: Instagram Login With Valid Details
  Given User Browser Launch
  And User Navigate To Url
  And User Land On Login Page Successfull
  And User Enter Valid Username
  And User Enter Valid Password
  And User Click Login Button
  Then Loged In Successfull
    