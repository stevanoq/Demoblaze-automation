package pagesLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logout_pf {
    WebDriver driver;
    WebDriverWait wait;

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

    public logout_pf(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void enter_username_logout(){
        wait.until(ExpectedConditions.visibilityOf(logout_username));
        logout_username.sendKeys("evan1240");
    }
    
    public void enter_password_logout(){
        wait.until(ExpectedConditions.visibilityOf(logout_password));
        logout_password.sendKeys("1234567890");
    }

    public void click_logout_tab(){
        wait.until(ExpectedConditions.elementToBeClickable(logout_btn));
        logout_btn.click();
    }

    public void click_logout_in_btn(){
        wait.until(ExpectedConditions.elementToBeClickable(login_btn_));
        login_btn_.click();
    }

    public void click_logout_in_tab(){
        wait.until(ExpectedConditions.elementToBeClickable(login_tab_));
        login_tab_.click();
    }

    public void verify_logout(){
        wait.until(ExpectedConditions.visibilityOf(login_tab_));
        login_tab_.isDisplayed();
    }
}
