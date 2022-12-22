package pagesLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
    WebDriver driver;

    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    WebElement home_tab;

    @FindBy(id = "cat")
    WebElement category_title;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/a[2]")
    WebElement phone_category;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/a[3]")
    WebElement laptop_category;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/a[4]")
    WebElement monitors_category;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/form[1]/ul[1]/li[1]/button[1]")
    WebElement previous_btn;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/form[1]/ul[1]/li[2]/button[1]")
    WebElement next_btn;

    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[2]/div[1]/a[2]/span[1]")
    WebElement btn_kanan;

    @FindBy(xpath = "/html[1]/body[1]/nav[1]/div[2]/div[1]/a[1]/span[1]")
    WebElement btn_kiri;   

    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    WebElement add_to_cart;

    public home_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void alert_accept_home(){
        driver.switchTo().alert().accept();
    }
    
    public void add_to_cart_phones(String phone_name) throws InterruptedException{
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + phone_name + "']" )).click();
        Thread.sleep(2000);
        click_add_to_cart();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        click_home_tab();
        click_phone();
    }

    public void add_to_cart_laptops(String laptop_name) throws InterruptedException{
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + laptop_name + "']" )).click();
        Thread.sleep(2000);
        click_add_to_cart();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        click_home_tab();
        click_laptop();
    }

    public void add_to_cart_monitors(String monitors_name) throws InterruptedException{
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + monitors_name + "']" )).click();
        Thread.sleep(2000);
        click_add_to_cart();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        click_home_tab();
        click_monitor();
    }


    public void check_phone_name(String phone_name){
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + phone_name + "']" )).isDisplayed();
    }

    public void check_laptop_name(String laptop_name){
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + laptop_name + "']" )).isDisplayed();
    }

    public void check_monitor_name(String monitor_name){
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + monitor_name + "']" )).isDisplayed();
    }

    public void click_home_tab() throws InterruptedException{
        home_tab.click();
        Thread.sleep(1000);
    }

    public void click_phone() throws InterruptedException{
        phone_category.click();
        Thread.sleep(1000);
    }

    public void click_laptop() throws InterruptedException{
        laptop_category.click();
        Thread.sleep(1000);
    }

    public void click_monitor() throws InterruptedException{
        monitors_category.click();
        Thread.sleep(1000);
    }

    public void click_next() throws InterruptedException{
        next_btn.click();
        Thread.sleep(1000);
    }

    public void click_previous() throws InterruptedException{
        previous_btn.click();
        Thread.sleep(1000);
    }

    public void click_btn_kanan(){
        btn_kanan.click();
    }

    public void click_btn_kiri(){
        btn_kiri.click();
    }

    public void click_add_to_cart() throws InterruptedException{
        add_to_cart.click();
        Thread.sleep(1000);
    }
}
