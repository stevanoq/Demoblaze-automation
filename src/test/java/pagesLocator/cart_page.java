package pagesLocator;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page {
    WebDriver driver;

    public cart_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cart_tab;

    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    WebElement place_order_btn;

    @FindBy(id = "name")
    WebElement name_txt;

    @FindBy(id = "country")
    WebElement country_txt;

    @FindBy(id = "city")
    WebElement city_txt;

    @FindBy(id = "card")
    WebElement card_txt;

    @FindBy(id = "month")
    WebElement mount_txt;
    
    @FindBy(id = "year")
    WebElement year_txt;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    WebElement purchase_btn;

    @FindBy(xpath = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']")
    WebElement close_btn;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement ok_btn;

    @FindBy(xpath = "//body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[15]/td[4]/a[1]")
    WebElement bottom_delete_btn;

    public void click_bottom_delete_btn() throws InterruptedException{
        bottom_delete_btn.click();
        Thread.sleep(1000);
    }

    public void check_item_table(String number_of_table){
        boolean displayed = driver.findElement(ByXPath.xpath("(//td)["+ number_of_table + "]")).isDisplayed();
        if(displayed){
            //do nothing
        }
        else{
            System.out.println("the item is deleted");
        }
    }

    public void check_cart(String item){
        driver.findElement(ByXPath.xpath("//td[normalize-space()='" + item + "']")).isDisplayed();
    }


    public void click_cart_tab() throws InterruptedException{
        cart_tab.click();
        Thread.sleep(2000);
    }

    public void click_place_order_btn() throws InterruptedException{
        place_order_btn.click();
        Thread.sleep(2000);
    }

    public void enter_name(){
        name_txt.sendKeys("user");
    }

    public void enter_country(){
        country_txt.sendKeys("Indonesia");
    }

    public void enter_city(){
        city_txt.sendKeys("Salatiga");
    }

    public void enter_card(){
        cart_tab.sendKeys("2314352425");
    }

    public void enter_month(){
        mount_txt.sendKeys("01");
    }

    public void enter_year(){
        year_txt.sendKeys("28");
    }

    public void click_purchase_btn() throws InterruptedException{
        purchase_btn.click();
        Thread.sleep(2000);
    }

    public void click_close_btn() throws InterruptedException{
        close_btn.click();
        Thread.sleep(2000);
    }

    public void click_ok_btn() throws InterruptedException{
        ok_btn.click();
        Thread.sleep(2000);
    }

    public void check_ok_btn(){
        ok_btn.isDisplayed();
    }
    
    public void verify_cart_page(){
        place_order_btn.isDisplayed();
    }
}
