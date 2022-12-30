package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagesLocator.cart_page;
import pagesLocator.home_page;

public class T07_addToCart extends variable{
    /*And add phones to cart
     * Then check if all item in cart
     */
     @And("add phones to cart")
     public void add_phones_to_cart() throws InterruptedException {
         //home = new home_page(driver, wait);
         cart = new cart_page(driver, wait);
        home.add_to_cart_phones("Samsung galaxy s6");
        home.add_to_cart_phones("Nokia lumia 1520");
        home.add_to_cart_phones("Nexus 6");
        home.add_to_cart_phones("Samsung galaxy s7");
        home.add_to_cart_phones("Iphone 6 32gb");
        home.add_to_cart_phones("Sony xperia z5");
        home.add_to_cart_phones("HTC One M9");
     }

     @And("add laptops to cart")
     public void add_laptops_to_cart() throws InterruptedException {
        home.add_to_cart_laptops("Sony vaio i5");
        home.add_to_cart_laptops("Sony vaio i7");
        home.add_to_cart_laptops("MacBook air");
        home.add_to_cart_laptops("Dell i7 8gb");
        home.add_to_cart_laptops("2017 Dell 15.6 Inch");
        home.add_to_cart_laptops("MacBook Pro");
     }

     @And("add monitors to cart")
     public void add_monitors_to_cart() throws InterruptedException {
        home.add_to_cart_monitors("Apple monitor 24");
        home.add_to_cart_monitors("ASUS Full HD");
     }

     @Then("check if all items in cart")
     public void check_if_all_items_in_cart() {
        cart.click_cart_tab();
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
}
