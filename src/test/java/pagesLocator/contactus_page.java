package pagesLocator;

import javax.swing.tree.ExpandVetoException;
import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactus_page {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement contactUs_tab;

    @FindBy(id = "recipient-email")
    WebElement email_input;

    @FindBy(id = "recipient-name")
    WebElement name_input;

    @FindBy(id = "message-text")
    WebElement txt_message;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
    WebElement contact_btn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement close_contact;

    public contactus_page(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void click_contact_tab(){
        wait.until(ExpectedConditions.visibilityOf(contactUs_tab)).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(contactUs_tab)).click();
        // contactUs_tab.click();
    }

    public void input_email_contact(){
        wait.until(ExpectedConditions.visibilityOf(email_input));
        email_input.sendKeys("user@example.com");
    }

    public void input_name_contact(){
        wait.until(ExpectedConditions.visibilityOf(name_input));
        name_input.sendKeys("user");
    }

    public void input_message(){
        wait.until(ExpectedConditions.visibilityOf(txt_message));
        txt_message.sendKeys("message test");
    }

    public void alert_accept_contact() {
        wait.until(ExpectedConditions.alertIsPresent());
        if(driver.switchTo().alert().getText().equalsIgnoreCase("Thanks for the message!!")){
            driver.switchTo().alert().accept();
        }
        
    }

    public void click_close_btn_contact(){
        wait.until(ExpectedConditions.elementToBeClickable(close_contact));
        close_contact.click();
    }

    public void click_contact_btn(){
        wait.until(ExpectedConditions.elementToBeClickable(contact_btn));
        contact_btn.click();
    }
}
