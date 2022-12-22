package StepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pagesLocator.cart_page;

public class T08_checkout extends variable{
    /*When user click cart
        And check cart items
        When user click delete button
        And check item deleted is gone
        When user click place order button
        And user not enter order data
        When user order with order data
        And succesfull order */

    @When("user click cart")
    public void user_click_cart() throws InterruptedException{
        cart = new cart_page(driver);

        cart.click_cart_tab();
        cart.verify_cart_page();
    }

    @And("check cart items")
    public void check_cart_items(){
        cart.check_cart("Samsung galaxy s6");
        cart.check_cart("Nokia lumia 1520");
        cart.check_cart("Nexus 6");
        cart.check_cart("Samsung galaxy s7");
        cart.check_cart("Iphone 6 32gb");
        cart.check_cart("Sony xperia z5");
        cart.check_cart("HTC One M9");

        cart.check_cart("Sony vaio i5");
        cart.check_cart("Sony vaio i7");
        cart.check_cart("MacBook air");
        cart.check_cart("Dell i7 8gb");
        cart.check_cart("2017 Dell 15.6 Inch");
        cart.check_cart("MacBook Pro");

        cart.check_cart("Apple monitor 24");
        cart.check_cart("ASUS Full HD");
    }

    @When("user click delete button")
    public void user_click_delete_button() throws InterruptedException{
        cart.click_bottom_delete_btn();
    }

    @And("check item deleted is gone")
    public void check_item_deleted_is_gone(){
        cart.check_item_table("60");
        cart.check_item_table("59");
        cart.check_item_table("58");
        cart.check_item_table("57");
    }

    @When ("user click place order button")
    public void user_click_place_order_button() throws InterruptedException{
        cart.click_place_order_btn();
    }

    @And ("user not enter order data")
    public void user_not_enter_order_data() throws InterruptedException{
        cart.click_purchase_btn();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }

    @When ("user order with order data")
    public void user_order_with_order_data() throws InterruptedException{
        cart.enter_name();
        cart.enter_country();
        cart.enter_city();
        cart.enter_card();
        cart.enter_month();
        cart.enter_year();
        cart.click_purchase_btn();
    }

    @When ("succesfull order")
    public void succesfull_order() throws InterruptedException{
        cart.check_ok_btn();
        cart.click_ok_btn();
    }
}
