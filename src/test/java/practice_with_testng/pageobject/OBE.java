package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OBE extends basepage{
    home_page home=new home_page(driver);

    public OBE(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//div[@id='upMain']")
    public WebElement main_page;

    public void click_obe(){
        home=new home_page(driver);
        home.obeLink.click();
    }



}
