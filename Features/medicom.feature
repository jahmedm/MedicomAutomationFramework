Feature: patient link 
@test01
Scenario Outline: testing patient link
Given user enter medicom url
Then user click on patient login
Then user click on login
Then user enter "<username>" and "<password>"
Then user click on logintohome
Then user on patient link homepage
And user verify text
Then user click on profile menu
And click on sign out
Then sign out should be succesful
Examples:
|username||password|
|jaberahmednj@outlook.com||Rana8367|
  |jahmed@medicom.us       ||  Rana8367 |
  |jandjndas               ||5644564|