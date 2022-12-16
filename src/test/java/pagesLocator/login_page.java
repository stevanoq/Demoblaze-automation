package pagesLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
    WebDriver driver;

    By txt_username = By.id("loginusername");
    By txt_password = By.id("loginpassword");
    By login_button = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[2]");
    By close_button = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[1]");
    By x_button = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
    By login_tab = By.id("login2");
    
    String username = "evan1240";
    String password = "1234567890";
    String wrong_password = "7890";

    public login_page(WebDriver driver){
        this.driver = driver;
    }

    public void enter_username(){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enter_password(){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void enter_wrong_password(){
        driver.findElement(txt_password).sendKeys(wrong_password);
    }

    public void click_btn_login(){
        driver.findElement(login_button).click();
    }

    public void click_btn_close(){
        driver.findElement(close_button).click();
    }

    public void click_btn_x(){
        driver.findElement(x_button).click();
    }

    public void click_login_tab(){
        driver.findElement(login_tab).click();
    }

    public void alert_oke(){
        driver.switchTo().alert().accept();
    }

    public void delete_password(){
        driver.findElement(txt_password).clear();
    }
}
