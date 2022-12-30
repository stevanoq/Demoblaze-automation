package StepDefinitions;

import org.openqa.selenium.By.ByXPath;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.aboutus_page;

public class T04_aboutus extends variable{
    /*When user login
    When user login
    And click about us tab
    When check close and x btn
    Then verify video */
    @And ("click about us tab")
    public void click_about_us_tab() throws InterruptedException {
        aboutus = new aboutus_page(driver, wait);
        aboutus.taping_aboutus();
    }

    @When("check close and x btn")
    public void check_close_and_x_tn() throws InterruptedException {
        aboutus.verify_aboutus();
        aboutus.click_close_btn_aboutus();
        aboutus.taping_aboutus();
        aboutus.verify_aboutus();
        aboutus.click_x_btn_aboutus();
        aboutus.taping_aboutus();
        aboutus.verify_aboutus();
    }

    @And("verify video")
    public void verify_video() {
        aboutus.verify_aboutus_vid();
        aboutus.click_x_btn_aboutus();
    }
}
