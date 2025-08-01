package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
    WebDriver driver;
    public basepage(WebDriver driver){
        this.driver=driver;

        //mandatory for page factory approach
        PageFactory.initElements(driver,this);
    }
}
