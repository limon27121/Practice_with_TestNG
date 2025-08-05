package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GYM extends basepage{
    public GYM(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//a[normalize-space()='GYM Registration']")
    public WebElement Gym_link;
    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[1]")
    public WebElement Header_text;

    @FindBy(xpath="//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div[@class='col-sm-12 col-md-12 col-lg-12']/div[@class='container-fluid']/div[2]")
    public WebElement Gym_body;

    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnAdd']")
    public WebElement enroll_button;


    public void gym_click(){
        Gym_link.click();
    }


}
