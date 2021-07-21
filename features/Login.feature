feature:Login
  
  Scenario: Successful Login with valid credentials
    Given User Launch Chrome browser
    And User opens URL "https://admin-demo.nopcommerce.com/login"
    When User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then page Title should be "Dashboard/nopcommerce adminstration"
    When User click on Log out link 
    Then page title shoud be "Your strore.Login"
    And close the browser
	