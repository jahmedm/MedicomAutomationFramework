Feature: ImageX to ImageX transfer
  @test02
  Scenario Outline: user able to transfer file from one imageX to another imageX
    Given user launch the Medicom browser
    When User Enter username and password
    Then user clicks on signin
    Then user clicks on share study
    Then user clicks on ImageX
    Then user search patient By "<LastName>" and "<FirstName>"
    Then user select patient and clicks on Review selection
    Then user clicks on select recipient button
    Then user clicks on contacts
    Then user select imagex from contactlist and clicks on confirm slection
    Then user clicks on send for transfer the study
    Then user verify the outgoing file
    And user switch the space
    Then Study should be available on recepient imageX at receiving file menu
    Examples:
   |LastName||FirstName|
   |       smith||    jack|


