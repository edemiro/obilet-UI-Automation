Feature: Create User Test

  Scenario: Go to obilet website and test create user

    Given The user Goes to obilet Home Page
    Then Home page is opened correctly
    When The user clicks on member login button
    Then membership pop up is displayed
    When The user clicks register button
    And The user type email "obiletdenemetest5@gmail.com" and password
    And The user click register button
    Then New user is created successfully is displayed

  Scenario: Search for a flight ticket

    Given The user Goes to Home Page
    And The user clicks the Flight tab
    Then The Search for a flight ticket page is opened
    When The user chooses from city to city
    And The user chooses Depart and Return date
    And The user clicks Find a Flight Ticket button
    Then Check The Flights are listed
    When The user chooses Depart flight
    And The user chooses Return flight
    Then Check payment page is opened
    And Check the Depart flight info is correct
    And Check the Return flight info is correct





