package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registration extends  basepage{
    public Registration(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[normalize-space()='Registration']")
    public WebElement Registration_Link;

    @FindBy(xpath="//a[normalize-space()='Course Evaluation']")
    public WebElement course_evaluation;

    @FindBy(xpath="//a[normalize-space()='Evaluation Form']")
    public  WebElement evaluation_form;

    @FindBy(xpath="//div[@class='col-sm-12 col-md-12 col-lg-12']//div[@class='row']")
    public  WebElement evaluation_header;

    @FindBy(xpath="//a[normalize-space()='Registration']")
    public WebElement Registration;

    @FindBy(xpath="//a[normalize-space()='Course Withdraw Request (New)']")
    public WebElement withdraw_req;

    @FindBy(xpath="//h2[normalize-space()='Course Withdraw Request By Student']")
    public WebElement withdraw_header;

    @FindBy(xpath="//h2[normalize-space()='Course Withdraw Request By Student']")
    public WebElement student_details;


    @FindBy(xpath="//a[normalize-space()='My Account']")
    public WebElement My_account;







    public void course_withdraw(){
        Registration_Link.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(Registration));
        action.moveToElement(Registration).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(withdraw_req));
        action.moveToElement(withdraw_req).click().perform();
    }

    public void registration(){
        Registration_Link.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(course_evaluation));
        action.moveToElement(course_evaluation).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(evaluation_form));
        action.moveToElement(evaluation_form).click().perform();

    }


    public void My_account(){
        Registration_Link.click();
        Admin_Control a1=new Admin_Control(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(My_account));
        action.moveToElement(My_account).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(a1.change_password));
        action.moveToElement(a1.change_password).click().perform();
    }







}
