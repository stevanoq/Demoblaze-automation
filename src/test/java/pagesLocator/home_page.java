package pagesLocator;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.statements.ExpectException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home_page {
    WebDriver driver;
    WebDriverWait wait;

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

    public home_page(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void alert_accept_home(){
        String expectedText = "Product added.";
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        if(alert.getText().equalsIgnoreCase(expectedText)){
            alert.accept(); 
            System.out.println("here is accept alert");
        }
    }
    
    public void add_to_cart_phones(String phone_name) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='" + phone_name + "'])[1]"))).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='" + phone_name + "'])[1]"))).click();
        click_add_to_cart();
        alert_accept_home();
        for(int i = 0; i <= 1; i++){
            driver.navigate().back();
        }
        //click_phone();
    }

    public void add_to_cart_laptops(String laptop_name) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='" + laptop_name + "'])[1]"))).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='" + laptop_name + "'])[1]"))).click();
        click_add_to_cart();
        alert_accept_home();
        for(int i = 0; i <= 1; i++){
            driver.navigate().back();
        }
        // click_laptop();
    }

    public void add_to_cart_monitors(String monitors_name) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='" + monitors_name + "'])[1]"))).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='" + monitors_name + "'])[1]"))).click();;
        click_add_to_cart();
        alert_accept_home();
        for(int i = 0; i <= 1; i++){
            driver.navigate().back();
        }
        // click_monitor();
    }


    public void check_phone_name(String phone_name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='" + phone_name + "'])[1]"))).isDisplayed();
        // driver.findElement(ByXPath.xpath("//a[normalize-space()='" + phone_name + "']" )).isDisplayed();
        System.out.println("here is check phone name");
    }

    public void check_laptop_name(String laptop_name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='" + laptop_name + "']" )));
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + laptop_name + "']" )).isDisplayed();
    }

    public void check_monitor_name(String monitor_name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='" + monitor_name + "']")));
        driver.findElement(ByXPath.xpath("//a[normalize-space()='" + monitor_name + "']" )).isDisplayed();
    }

    public void click_home_tab() {
        wait.until(ExpectedConditions.elementToBeClickable(home_tab)).click();  
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='contcont']/div[@class='row']/div[@class='col-lg-9']/div[@id='tbodyid']/div[1]"))).isDisplayed();
    }

    public void click_phone() {
        // wait.until(ExpectedConditions.visibilityOf(phone_category)).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(phone_category)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='contcont']/div[@class='row']/div[@class='col-lg-9']/div[@id='tbodyid']/div[1]"))).isDisplayed();
        // System.out.println("here is click phone");
    }

    public void click_laptop() {
        wait.until(ExpectedConditions.elementToBeClickable(laptop_category));
        laptop_category.click();
    }

    public void click_monitor() {
        wait.until(ExpectedConditions.elementToBeClickable(monitors_category));
        monitors_category.click();
    }

    public void click_next() {
        wait.until(ExpectedConditions.elementToBeClickable(next_btn));
        next_btn.click();
    }

    public void click_previous() {
        wait.until(ExpectedConditions.elementToBeClickable(previous_btn));
        previous_btn.click();
    }

    public void click_btn_kanan(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_kanan));
        btn_kanan.click();
    }

    public void click_btn_kiri(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_kiri));
        btn_kiri.click();
    }

    public void click_add_to_cart() {
        wait.until(ExpectedConditions.elementToBeClickable(add_to_cart)).click();
        System.out.println("here is click add to cart");
    }
}
