package pagesLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_pf {
    WebDriver driver;
    @FindBy(id = "login2")
    WebElement login_tab_;
    
    @FindBy(id = "loginusername")
    WebElement logout_username;
    
    @FindBy(id = "loginpassword")
    WebElement logout_password;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[2]")
    WebElement login_btn_;

    @FindBy(id = "logout2")
    WebElement logout_btn;

    public logout_pf(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_username_logout(){
        logout_username.sendKeys("evan1240");
    }
    
    public void enter_password_logout(){
        logout_password.sendKeys("1234567890");
    }

    public void click_logout_tab(){
        logout_btn.click();
    }

    public void click_logout_in_btn(){
        login_btn_.click();
    }

    public void click_logout_in_tab(){
        login_tab_.click();
    }

    public void verify_logout(){
        login_tab_.isDisplayed();
    }
}
