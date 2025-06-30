package Page_object_model.without_page_factory_approach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn_page {
    WebDriver driver;

    //Constructor
    LogIn_page(WebDriver driver){
        this.driver=driver;
    }

    //Locators

    //here By is the return type
  By txt_user_name_loc=(By.xpath("//input[@placeholder='Username']"));
  By txt_user_password_loc=(By.xpath("//input[@placeholder='Password']"));

  By btn_log_in_loc=(By.xpath("//button[normalize-space()='Login']"));



    //Action Methods

    public void setUsername(String name){

        driver.findElement(txt_user_name_loc).sendKeys(name);
    }

    public void set_password(String pwd){
        driver.findElement(txt_user_password_loc).sendKeys(pwd);
    }

    public void log_in(){
        driver.findElement(btn_log_in_loc).click();
    }
}
