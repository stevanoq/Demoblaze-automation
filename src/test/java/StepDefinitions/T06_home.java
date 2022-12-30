package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.aboutus_page;
import pagesLocator.home_page;

public class T06_home extends variable{
    /*And tab home
        When try move category
        And try next and pevious
        When try to add cart
        Then back to home */

        @And("tab home")
        public void tab_home() throws InterruptedException {
            home = new home_page(driver, wait);
            home.click_home_tab();
        }

        @When("move phone category and check")
        public void move_phone_category_and_check() throws InterruptedException{
          //  Thread.sleep(2000);
            home.click_phone();
            home.check_phone_name("Samsung galaxy s6");
            home.check_phone_name("Nokia lumia 1520");
            home.check_phone_name("Nexus 6");
            home.check_phone_name("Samsung galaxy s7");
            home.check_phone_name("Iphone 6 32gb");
            home.check_phone_name("Sony xperia z5");
            home.check_phone_name("HTC One M9");
        }

        @And("move laptop category and check")
        public void move_laptop_category_and_check() throws InterruptedException{
            home.click_laptop();
            home.check_laptop_name("Sony vaio i5");
            home.check_laptop_name("Sony vaio i7");
            home.check_laptop_name("MacBook air");
            home.check_laptop_name("Dell i7 8gb");
            home.check_laptop_name("2017 Dell 15.6 Inch");
            home.check_laptop_name("MacBook Pro");
        }

        @When("move monitor category and check")
        public void move_monitor_category_and_check() throws InterruptedException{
            home.click_monitor();
            home.check_monitor_name("Apple monitor 24");
            home.check_monitor_name("ASUS Full HD");
        }

        @And("check next and previous button")
        public void check_next_and_previous_button() throws InterruptedException{
            home.click_home_tab();
            home.click_next();
            home.check_laptop_name("MacBook air");
            home.check_laptop_name("Dell i7 8gb");
            home.check_laptop_name("2017 Dell 15.6 Inch");
            home.check_laptop_name("MacBook Pro");
            home.check_monitor_name("ASUS Full HD");
            home.click_previous();
           // home.check_phone_name("Samsung galaxy s6");
            home.check_phone_name("Nokia lumia 1520");
            home.check_phone_name("Nexus 6");
            home.check_phone_name("Samsung galaxy s7");
            home.check_phone_name("Iphone 6 32gb");
            home.check_phone_name("Sony xperia z5");
            home.check_phone_name("HTC One M9");
            home.check_laptop_name("Sony vaio i5");
            home.check_laptop_name("Sony vaio i7");
            home.check_monitor_name("Apple monitor 24");
        }

        @Then("check button right and left")
        public void check_button_right_and_left() throws InterruptedException{
            home.click_home_tab();
            home.click_btn_kiri();
            home.click_btn_kanan();
        }



}
