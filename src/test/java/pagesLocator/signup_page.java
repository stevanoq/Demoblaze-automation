package pagesLocator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup_page {
    WebDriver driver;
    WebDriverWait wait;
 
    By txt_signUpUsername = By.id("sign-username");
    By txt_signUpPassword = By.id("sign-password");
    By signup_tab = By.id("signin2");
    By signup_close_btn = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[1]");
    By signup_button = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");
    By signup_x_btn = By.xpath("//*[@id='signInModal']/div/div/div[1]/button[1]");

    
    String signUpOldName = "evan";
    String signUpNewName = "evan1244";    
    String signUpPassword = "1234567890";

    public signup_page(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void enter_sigup_newname(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txt_signUpUsername));
        driver.findElement(txt_signUpUsername).sendKeys(signUpNewName);
    }

    public void enter_sigup_oldname(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txt_signUpUsername));
        driver.findElement(txt_signUpUsername).sendKeys(signUpOldName);
    }

    public void enter_sigup_password(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txt_signUpPassword));
        driver.findElement(txt_signUpPassword).sendKeys(signUpPassword);
    }

    public void click_sigup_tab() {
        wait.until(ExpectedConditions.elementToBeClickable(signup_tab));
        driver.findElement(signup_tab).click();
    }

    public void click_sigup_button(){
        wait.until(ExpectedConditions.elementToBeClickable(signup_button));
        driver.findElement(signup_button).click();
    }

    public void click_sigup_closeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signup_close_btn));
        driver.findElement(signup_close_btn).click();
    }

    public void click_sigup_xButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signup_x_btn));
        driver.findElement(signup_x_btn).click();
    }

    public void signup_alert_accept(String expectedText){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        if (alert.getText().equalsIgnoreCase(expectedText)) {
            alert.accept();
        }
        
    }

}
