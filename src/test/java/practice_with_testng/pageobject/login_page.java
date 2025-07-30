package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page extends basepage{
    WebDriver driver;

    //constuctor
    public login_page( WebDriver driver){
        super(driver);
    }

    //locators
    @FindBy(xpath="//input[@id='logMain_UserName']")
    WebElement id_number;

    @FindBy(xpath="//input[@id='logMain_Password']")
    WebElement password;

    @FindBy(xpath="//input[@id='logMain_Button1']")
    WebElement login_button;
    @FindBy(xpath="//img[@id='ctl00_MainContainer_SI_Image']")
    WebElement profile_img;

    //action methods

    public void log_in(String number,String pass){
        id_number.sendKeys(number);
        password.sendKeys(pass);
        login_button.click();
//        boolean displayed=profile_img.isDisplayed();

    }

    public boolean displayed(){
        boolean displayed=profile_img.isDisplayed();
        return displayed;
    }



}
