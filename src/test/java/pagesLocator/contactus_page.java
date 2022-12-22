package pagesLocator;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus_page {
    WebDriver driver;

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

    public contactus_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click_contact_tab(){
        contactUs_tab.click();
    }

    public void input_email_contact(){
        email_input.sendKeys("user@example.com");
    }

    public void input_name_contact(){
        name_input.sendKeys("user");
    }

    public void input_message(){
        txt_message.sendKeys("message test");
    }

    public void alert_accept_contact() throws InterruptedException{
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    public void click_close_btn_contact(){
        close_contact.click();
    }

    public void click_contact_btn(){
        contact_btn.click();
    }
}
