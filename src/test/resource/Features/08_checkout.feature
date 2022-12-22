Feature: checkout feature
    @checkout
    Scenario: checkout functionality testing
        When user login
        When user click cart
        And check cart items
        When user click delete button
        And check item deleted is gone
        When user click place order button
        And user not enter order data
        When user order with order data
        And succesfull order
        Then logout

    
    