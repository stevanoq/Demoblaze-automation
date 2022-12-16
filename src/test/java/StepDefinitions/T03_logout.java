package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.logout_pf;

public class T03_logout {
    WebDriver driver = null;
    logout_pf logout;
    /*Given logout open browser
        And logout navigate to web
        When user login
        And successfuly login
        Then logout */

        @Given("logout open browser")
        public void logout_open_browser(){
            System.setProperty("webdriver.chrome.driver",
                "/home/evan/Documents/MavenProjects/testing/src/test/resource/Drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        }

        @And("logout navigate to web")
        public void logout_navigate_to_web(){
            driver.navigate().to("https://www.demoblaze.com/");
        }

        @When("user login")
        public void user_login() throws InterruptedException{
            logout = new logout_pf(driver);

            logout.click_logout_in_tab();
            logout.enter_username_logout();
            logout.enter_password_logout();
            logout.click_logout_in_btn();

            Thread.sleep(3000);
        }

        @And("successfuly login")
        public void successfuly_login(){
            logout.click_logout_tab();
        }

        @Then("logout")
        public void logout(){
            logout.verify_logout();
            driver.close();
            driver.quit();
        }
}
