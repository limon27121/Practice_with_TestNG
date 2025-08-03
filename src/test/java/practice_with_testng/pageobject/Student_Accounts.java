package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Student_Accounts extends  basepage {
    home_page home=new home_page(driver);

    public Student_Accounts(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[normalize-space()='Student Accounts']")
    WebElement Account;
    @FindBy(xpath="//a[normalize-space()='Payment']")
    WebElement payment_dropdown;
    @FindBy(xpath="//a[normalize-space()='Student Bill & Payment']")
    WebElement student_Bill;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[1]")
   public WebElement payment_header;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_txt_online_amount']")
    public WebElement online_amount_filed;

    @FindBy(xpath="//button[@class='button']")
    public WebElement payment_button;

    @FindBy(xpath="//div[@class='col-md-6']//div[@class='panel panel-default pp']")
   public WebElement student_detalis;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[@class='col-md-12 col-lg-12']/div[@id='ctl00_MainContainer_UpdatePanel3']/div[1]")
    public WebElement tuition_detalis;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[@class='col-md-12 col-lg-12']/div[@id='ctl00_MainContainer_UpdatePanel3']/div[1]")
    public WebElement detalis_table;


    public void click_payment(){
     Account.click();
     Actions action = new Actions(driver);
     action.moveToElement(payment_dropdown).click().moveToElement(student_Bill).click().build().perform();

    }
}
