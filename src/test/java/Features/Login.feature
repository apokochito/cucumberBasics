Feature: LoginFeature
  This Feature deals with the login functionality of the application

  Scenario: Use Cucumber with Selenium
    Given I navigate to login window on the website
    And I enter the following for Login
      | userName  | password  |
      | adminUser | adminPass |
    And I click login button
    Then I should see the UserDetails page

