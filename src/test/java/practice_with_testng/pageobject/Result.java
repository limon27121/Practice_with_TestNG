package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Result extends  basepage {


    public Result(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//a[normalize-space()='Result']")
    WebElement result;

    @FindBy(xpath="//div[@class='navMenu']")
   public WebElement nav_menu1;
    @FindBy(xpath="//a[normalize-space()='Marks']")
    public WebElement mark;

    @FindBy(xpath="//div[@class='col-sm-12 col-md-12 col-lg-12']")
    public WebElement mark_panel;



    public void isNavbarDisplayed() {
        result.click();

    }

    public void click_mark(){
        mark.click();
    }

}
