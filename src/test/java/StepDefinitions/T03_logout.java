package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.home_page;
import pagesLocator.logout_pf;

public class T03_logout extends variable{
    
    /*Given logout open browser
        And logout navigate to web
        When user login
        And successfuly login
        Then logout */

        @When("user login")
        public void user_login() {
            logout = new logout_pf(driver, wait);
            home = new home_page(driver, wait);

            logout.click_logout_in_tab();
            logout.enter_username_logout();
            logout.enter_password_logout();
            logout.click_logout_in_btn();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        }

        @And("logout")
        public void successfuly_login(){
            logout.click_logout_tab();
        }

        @Then("successfuly login")
        public void logout(){
            logout.verify_logout();            
        }
}
