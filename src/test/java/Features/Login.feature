Feature: LoginFeature
  This Feature deals with the login functionality of the application

  Scenario: Use Cucumber with Selenium
    Given I navigate to login window on the website
    And I enter the following for Login
      | userName  | password  |
      | adminUser | adminPass |
    And I click login button
    Then I should see the UserDetails page

  Scenario: Use Cucumber with Selenium thread II
    Given I navigate to login window on the website
    And I enter the following for Login
      | userName  | password  |
      | adminUser | adminPass |
    And I click login button
    Then I should see the UserDetails page

#  Scenario: Login with correct username and password
#     Given I navigate to login window on the website
#     And I enter the users email address as Email:admin
#     And I want to see how this step looks with cucumber-java8
#     And I enter the following for Login
#      | userName  | password  |
#      | adminUser | adminPass |
#    And I click login button
#    Then I should see the UserDetails page
#    And I get an 200 http response

#  Scenario Outline: Login with correct username and password using scenario outline
#    Given I navigate to login window on the website
#    And I enter <userName> and <password> for Login
#    And I click login button
#    Then I should see the UserDetails page

#    Examples:
#      | userName | password    |
#      | Mario    | MyMarioPass |
#      | John     | MyJohnPass  |
#      | Clark    | MyClarkPass |