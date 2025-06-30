package Page_object_model.page_factory_apporach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class LogInPage {
    WebDriver driver;

    //constructor
    LogInPage(WebDriver driver){
        this.driver=driver;
        //mandatory for page factory approach
        PageFactory.initElements(driver,this);
    }

    //locators
    @FindBy(name = "username")
    WebElement loginContainer;
     @FindBy(xpath="//input[@placeholder='Password']")
    WebElement password;
     @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement login_button;

     //Multiple web element store in list
     @FindBy(tagName = "a")
    List<WebElement>links;


     //Actions
    public void setUsername(String name){

       loginContainer.sendKeys(name);
    }

    public void set_password(String pwd){
        password.sendKeys(pwd);
    }

    public void log_in(){
        login_button.click();
    }






}
