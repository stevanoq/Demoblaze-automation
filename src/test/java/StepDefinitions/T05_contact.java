package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pagesLocator.contactus_page;

public class T05_contact extends variable{
    /* And click contactus
        When enter contact
        And not enter contact */

    @And("click contactus")
    public void click_contactus() {
        contact = new contactus_page(driver, wait);
        contact.click_contact_tab();
    }

    @When("enter contact")
    public void enter_contact() {
        contact.input_email_contact();
        contact.input_name_contact();
        contact.input_message();
        contact.click_contact_btn();
        contact.alert_accept_contact();
        contact.click_contact_tab();
    }

    @And("not enter contact")
    public void not_enter_contact() {
        contact.click_contact_btn();
        contact.alert_accept_contact();
        contact.click_contact_tab();
        contact.input_email_contact();
        contact.click_close_btn_contact();
        contact.click_contact_tab();
        contact.click_contact_btn();
        contact.alert_accept_contact();
    }
}
