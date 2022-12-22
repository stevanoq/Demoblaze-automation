Feature: logout testing

    @logout
    Scenario: logout fucyionality testing
        When user login
        And logout
        Then successfuly login 