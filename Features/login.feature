
Feature: Medicom Homepage feature



  Background: Login to Medicom HomePage
    Given user on Medicom Homepage
    Then  user enters username and password
    And user clicks on login
    Then user navigated to the Medicom Homepage



    Scenario: change password requirement
      Given user on Medicom Homepage
      Then user click on profile menu
      Then user clicks on My settings
      Then user clicks on secuirity
      Then user clicks on change password
      And user add values based on password requirements
      Then user can see the matched password requirements



      Scenario: check checkpoint is working
        Given user in the Medicom Homepage
        Then  click checkpoint
        Then user see the feature of the checkpoint

      Scenario: check internal prefetch is working
        Given user on login page
        Then click Internal prefetch
        Then user see the feature of the checkpoint