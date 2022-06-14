Feature: Application Login

 Scenario: Home Page Default Login
   Given User is on net banking login page
   When User logs into application with username "risha" and password "123"
   Then Home Page is displayed
   And Card details are "true"

 Scenario: Home Page Default Login
  Given User is on net banking login page
  When User logs into application with username "ruby" and password "1234"
  Then Home Page is displayed
  And Card details are "false"


