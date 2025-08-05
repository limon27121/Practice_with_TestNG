package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Admin_Control extends basepage{

    public Admin_Control(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[normalize-space()='Admin Control']")
    public WebElement admin_control;
    @FindBy(xpath="//a[normalize-space()='User Mgt.']")
    public WebElement user_mgt;
    @FindBy(xpath="//a[normalize-space()='Change Password']")
    public WebElement change_password;
    @FindBy(xpath="//h2[normalize-space()='Password Change (User)']")
    public WebElement user_mgt_header;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[@class='row']/div[3]")
    public WebElement Message_section;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnUpdate']")
    public WebElement Update_button;

    public void click_admin_control(){
        admin_control.click();
    }

    public void user_mgt(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(user_mgt));
        action.moveToElement(user_mgt).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(change_password));
        action.moveToElement(change_password).click().perform();

    }






}
