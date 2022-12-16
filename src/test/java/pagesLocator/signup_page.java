package pagesLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup_page {
    WebDriver driver;

    By txt_signUpUsername = By.id("sign-username");
    By txt_signUpPassword = By.id("sign-password");
    By signup_tab = By.id("signin2");
    By signup_close_btn = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[1]");
    By signup_button = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");
    By signup_x_btn = By.xpath("//*[@id='signInModal']/div/div/div[1]/button[1]");

    
    String signUpOldName = "evan";
    String signUpNewName = "evan1241";    
    String signUpPassword = "1234567890";

    public signup_page(WebDriver driver){
        this.driver = driver;
    }

    public void enter_sigup_newname(){
        driver.findElement(txt_signUpUsername).sendKeys(signUpNewName);
    }

    public void enter_sigup_oldname(){
        driver.findElement(txt_signUpUsername).sendKeys(signUpOldName);
    }

    public void enter_sigup_password(){
        driver.findElement(txt_signUpPassword).sendKeys(signUpPassword);
    }

    public void click_sigup_tab() throws InterruptedException{
        driver.findElement(signup_tab).click();
        Thread.sleep(2000);
    }

    public void click_sigup_button(){
        driver.findElement(signup_button).click();
    }

    public void click_sigup_closeButton(){
        driver.findElement(signup_close_btn).click();
    }

    public void click_sigup_xButton(){
        driver.findElement(signup_x_btn).click();
    }

    public void signup_alert_accept(){
        driver.switchTo().alert().accept();
    }

}
