package StepDefinitions;

import org.openqa.selenium.WebDriver;

import pagesLocator.aboutus_page;
import pagesLocator.cart_page;
import pagesLocator.contactus_page;
import pagesLocator.home_page;
import pagesLocator.login_page;
import pagesLocator.logout_pf;
import pagesLocator.signup_page;

public class variable {
    public static WebDriver driver;

    static login_page login;
    static logout_pf logout; 
    static signup_page signup;
    static aboutus_page aboutus;
    static contactus_page contact;
    static home_page home;
    static cart_page cart;
}
