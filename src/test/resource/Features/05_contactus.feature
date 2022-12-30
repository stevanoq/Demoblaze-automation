Feature: contact us
    @contactUs
    Scenario: testing contact us function
        Given user login
        And click contactus
        When enter contact
        And not enter contact
        Then logout