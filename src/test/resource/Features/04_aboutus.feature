Feature: about us 
    @about
    Scenario: test about us
    When user login
    And click about us tab
    When check close and x btn
    And  verify video
    Then logout