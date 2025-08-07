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

    @FindBy(xpath="//a[normalize-space()='My View']")
    public WebElement My_view;

    @FindBy(xpath="//a[normalize-space()='Result History']")
    public WebElement result_history;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[3]")
    public WebElement details_body;

    @FindBy(xpath="//div[@id='ctl00_MainContainer_UpdatePanel03']//div[@class='panel panel-default pp']")
    public WebElement Gpa_details;

    @FindBy(xpath="//div[@id='ctl00_MainContainer_UpdatePanel04']//div[@class='panel panel-default pp']")
    public WebElement courses;


    @FindBy(xpath="//a[normalize-space()='My Class Routine']")
    public WebElement class_routine;
    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[2]/div[1]")
    public WebElement student_details1;
    @FindBy(xpath="//h2[normalize-space()='Class Routine']")
    public WebElement class_routine_header;

    @FindBy(xpath="//a[normalize-space()='Degree Verification']")
    public WebElement degree_link;

    @FindBy(xpath="//div[@id='ctl00_MainContainer_ReportViewer1']")
    public WebElement Degree_verficiation_body;



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


    public void My_view(){
        Registration_Link.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(My_view));
        action.moveToElement(My_view).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(result_history));
        action.moveToElement(result_history).click().perform();


    }


   public void View_class_routine(){

       Registration_Link.click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       Actions action = new Actions(driver);

       wait.until(ExpectedConditions.elementToBeClickable(My_view));
       action.moveToElement(My_view).click().perform();

       wait.until(ExpectedConditions.elementToBeClickable(class_routine));
       action.moveToElement(class_routine).click().perform();


   }

    public void Degree_verification(){

        Registration_Link.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(My_view));
        action.moveToElement(My_view).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(degree_link));
        action.moveToElement(degree_link).click().perform();


    }












}
