package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class COE extends basepage{
    public COE(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "COE")
    public WebElement COE_link;
    @FindBy(xpath="//a[normalize-space()='Apply']")
    public WebElement Apply_link;

    @FindBy(xpath="//a[normalize-space()='Provisional Certificate and Official Transcript']")
    public WebElement Provisional_Certificate;

    @FindBy(xpath="//a[normalize-space()='Incomplete Transcript']")
    public WebElement Incomplete_Transcript;

    @FindBy(xpath="//a[normalize-space()='Duplicate Transcript']")
    public WebElement Duplicate_Transcript;

    @FindBy(xpath="//a[normalize-space()='Studentship, Testimonial or any other Certificate']")
    public WebElement Studentship;



    //first dropdown page

    @FindBy(xpath="//h3[contains(text(),'Student Application for Provisional Certificate an')]")
    public WebElement first_page_title;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='ContainWrapper']/div[@class='mainBodyContainer']/div[@class='container']/div[@class='row']/div[4]")
    public WebElement body_section;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnApply']")
    public WebElement apply_button;

    @FindBy(xpath="//body[1]/form[1]/div[3]/div[3]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]")
    public  WebElement detalis_table;



    //second drop_down

    @FindBy(xpath="//h3[normalize-space()='Student Application for Incomplete Transcript']")
    public WebElement second_page_title;
    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='ContainWrapper']/div[@class='mainBodyContainer']/div[@class='container']/div[@class='row']/div[4]")
    public WebElement second_body;


    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnApply']")
    public WebElement apply_button01;

    @FindBy(xpath="//div[@class='container']//div[5]")
    public WebElement status;


    //third dropdown

    @FindBy(xpath="//h3[normalize-space()='Student Application for Duplicate Transcript']")
    public WebElement third_page_title;

    @FindBy(xpath="//div[@id='ctl00_MainContainer_UpdatePanel4']//div[@class='row pt-2']")
    public WebElement third_body;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnApply']")
    public WebElement apply_button02;

    @FindBy(xpath="//span[@id='ctl00_MainContainer_lblResult']")
    public WebElement status1;


    //fourth dropdown

    @FindBy(xpath="//h3[contains(text(),'Student Application for Studentship, Testimonial o')]")
    public  WebElement fourth_page_title;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='ContainWrapper']/div[@class='mainBodyContainer']/div[@class='container']/div[@class='row']/div[4]")
    public WebElement certification_section;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnApply']")
    public WebElement apply_button03;

    @FindBy(xpath="//span[@id='ctl00_MainContainer_lblResult']")
    public WebElement status2;


    public void clickFirstDropdownItem() throws InterruptedException {
        Thread.sleep(500);
        COE_link.click();
        //important part
        Actions actions = new Actions(driver);
        actions.moveToElement(Apply_link).click().moveToElement(Provisional_Certificate).click().build().perform(); // hover over "Apply"
    }

    public void clickSecondDropdownItem() throws InterruptedException {
        Thread.sleep(500);
        COE_link.click();
        //important part
        Actions actions = new Actions(driver);
        actions.moveToElement(Apply_link).click().moveToElement(Incomplete_Transcript).click().build().perform();
    }

    public void clickThirdDropdownItem() throws InterruptedException {
        Thread.sleep(500);
        COE_link.click();
        //important part
        Actions actions = new Actions(driver);
        actions.moveToElement(Apply_link).click().moveToElement(Duplicate_Transcript).click().build().perform();
    }

    public void clickFourthDropdownItem() throws InterruptedException {
        Thread.sleep(500);
        COE_link.click();
        //important part
        Actions actions = new Actions(driver);
        actions.moveToElement(Apply_link).click().moveToElement(Studentship).click().build().perform();


    }






}
