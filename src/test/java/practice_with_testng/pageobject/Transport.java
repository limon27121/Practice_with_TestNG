package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transport extends basepage{
    public Transport(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//a[normalize-space()='Transport Registration']")
    public WebElement transport;

    @FindBy(xpath="//div[@class='col-sm-12 col-md-12 col-lg-12']//div[@class='container-fluid']")
    public WebElement transport_body;

    public void transport(){
        transport.click();
    }
}
