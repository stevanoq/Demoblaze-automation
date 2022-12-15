Feature: signup popup feature
    @signupPopup
    Scenario: test popup apearnes
        Given open browser
        And enter url
        When click signup tab
        And signin screen popup
        When click without data
        And accept the alert
        When enter data
        And click signup button
        When fail
        And retype data
        Then success