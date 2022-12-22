Feature: home feature 
    @home
    Scenario: home page testing
        When user login
        And tab home
        When move phone category and check
        And move laptop category and check
        When move monitor category and check
        And check next and previous button
        Then check button right and left