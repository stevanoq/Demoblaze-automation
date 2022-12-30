package pagesLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aboutus_page {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement aboutus_tab;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")
    WebElement close_button_aboutus;

    @FindBy(xpath ="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement x_button_boutus;

    @FindBy(id = "videoModalLabel")
    WebElement aboutus_title;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]")
    WebElement aboutus_vid;

    public aboutus_page(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void taping_aboutus() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(aboutus_tab));
        Thread.sleep(1000);
        aboutus_tab.click();
    }

    public void click_x_btn_aboutus(){
        wait.until(ExpectedConditions.elementToBeClickable(x_button_boutus));
        x_button_boutus.click();
    }

    public void click_close_btn_aboutus(){
        wait.until(ExpectedConditions.elementToBeClickable(close_button_aboutus));
        close_button_aboutus.click();
    }

    public void verify_aboutus(){
        wait.until(ExpectedConditions.visibilityOf(aboutus_title));
    }

    public void verify_aboutus_vid(){
        wait.until(ExpectedConditions.visibilityOf(aboutus_vid));
        aboutus_vid.isDisplayed();
    }
    
}
