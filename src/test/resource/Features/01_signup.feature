Feature: signup popup feature
    
    @signup
    Scenario: test popup apearnes
        
        When click signup tab
        And signin screen popup
        When click without data
        And accept the alert
        When enter data
        And click signup button
        When fail
        And retype data
      #  Then success