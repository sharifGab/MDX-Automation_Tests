Feature: Login Feature
  This Feature show user to login in Google

  Scenario: Login with username and password
    Given Navigate to login page
    And enter username as "admin" and password as "admin"
    And click the login button
    Then user form in now visible
    And Log out