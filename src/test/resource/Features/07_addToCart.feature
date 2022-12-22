Feature: add to cart feature
    @addToCart
    Scenario: add to cart functionality testing
        When user login
        And tab home
        When move phone category and check
        And add phones to cart
        When move laptop category and check
        And add laptops to cart
        When move monitor category and check
        And add monitors to cart
        Then check if all items in cart