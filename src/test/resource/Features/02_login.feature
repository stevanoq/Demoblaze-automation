Feature: login feature
    
    @login
    Scenario: login testing feature

        When click login tab
        And click login without cridential
        When enter wrong cridential
        And  fail login
        When not enter password
        And fail login1
        When enter right cridential
        Then success login