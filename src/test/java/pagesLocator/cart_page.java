package pagesLocator;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cart_page {
    WebDriver driver;
    WebDriverWait wait;

    public cart_page(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = wait;
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

    // public void get_rows_size() throws InterruptedException{
    //     Thread.sleep(1000);
    //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[2]"))).isDisplayed();
    //     int rows = driver.findElements(By.tagName("tr")).size();
    //     System.out.println("number of rows before = "+rows);
    //     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[4]/a[1]"))).click();
    //     Thread.sleep(1000);
    //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[2]"))).isDisplayed();
    //     int rowsa = driver.findElements(By.tagName("tr")).size();
    //     System.out.println("number of rows after= "+rowsa);
    // }

    public void click_bottom_delete_btn() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[2]"))).isDisplayed();
        int rows = driver.findElements(By.tagName("tr")).size();
        System.out.println("number of rows before = "+rows);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[4]/a[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[2]"))).isDisplayed();
        int rowsa = driver.findElements(By.tagName("tr")).size();
        System.out.println("number of rows after= "+rowsa);

        if(rows == rowsa){
            driver.close();
        }
        else{
            System.out.println("success");
        }
    }

    public void check_item_table(String number_of_table){
        wait.until(ExpectedConditions.visibilityOf(place_order_btn));
        boolean displayed = driver.findElement(ByXPath.xpath("(//td)["+ number_of_table + "]")).isDisplayed();
        if(displayed){
            //do nothing
        }
        else{
            System.out.println("the item is deleted");
        }
    }

    public void check_cart(String item){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='" + item + "']")));
        driver.findElement(ByXPath.xpath("//td[normalize-space()='" + item + "']")).isDisplayed();
    }


    public void click_cart_tab() {
        wait.until(ExpectedConditions.elementToBeClickable(cart_tab));
        cart_tab.click();
    }

    public void click_place_order_btn() {
        wait.until(ExpectedConditions.elementToBeClickable(place_order_btn));
        place_order_btn.click();
    }

    public void enter_name(){
        wait.until(ExpectedConditions.visibilityOf(name_txt));
        name_txt.sendKeys("user");
    }

    public void enter_country(){
        wait.until(ExpectedConditions.visibilityOf(country_txt));
        country_txt.sendKeys("Indonesia");
    }

    public void enter_city(){
        wait.until(ExpectedConditions.visibilityOf(city_txt));
        city_txt.sendKeys("Salatiga");
    }

    public void enter_card(){
        wait.until(ExpectedConditions.visibilityOf(card_txt));
        card_txt.sendKeys("2314352425");
    }

    public void enter_month(){
        wait.until(ExpectedConditions.visibilityOf(mount_txt));
        mount_txt.sendKeys("01");
    }

    public void enter_year(){
        wait.until(ExpectedConditions.visibilityOf(year_txt));
        year_txt.sendKeys("28");
    }

    public void click_purchase_btn() {
        wait.until(ExpectedConditions.elementToBeClickable(purchase_btn));
        purchase_btn.click();
    }

    public void click_close_btn() {
        wait.until(ExpectedConditions.elementToBeClickable(close_btn));
        close_btn.click();
    }

    public void click_ok_btn() {
        wait.until(ExpectedConditions.elementToBeClickable(ok_btn));
        ok_btn.click();
    }

    public void check_ok_btn(){
        wait.until(ExpectedConditions.visibilityOf(ok_btn));
        ok_btn.isDisplayed();
    }
    
    public void verify_cart_page(){
        wait.until(ExpectedConditions.visibilityOf(place_order_btn));
        place_order_btn.isDisplayed();
    }
}
