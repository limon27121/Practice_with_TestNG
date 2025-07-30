package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home_page extends basepage{

    public home_page(WebDriver driver) {
        super(driver);
    }

    //locators

    @FindBy(xpath="//div[contains(@class,'bg-c-yellow update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement transcript_section;

    @FindBy(xpath="//div[contains(@class,'bg-c-green update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement balance_section;

    @FindBy(xpath="//div[contains(@class,'bg-c-pink update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement online_payment;

    //Actions

    public boolean transcript_displayed(){
        boolean displayed_trans=transcript_section.isDisplayed();
        return displayed_trans;
    }

    public boolean balance_displayed(){
        boolean displayed_balance=balance_section.isDisplayed();
        return displayed_balance;
    }

    public boolean payment_displayed(){
        return online_payment.isDisplayed();
    }
}
