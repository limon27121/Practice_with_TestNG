package TestNG.testannotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//1.log in
//2.search
//3.log out
//4.log in
//5.advanced search
//6.log out
public class Testcase01 {
    WebDriver driver;

    @BeforeMethod
    void log_in(){
        System.out.println("log in to system");
    }

    @Test
    void Search(){
        System.out.println("searching");
    }

    @Test
    void Advanced_search(){
        System.out.println("adv searching.....");
    }

    @AfterMethod
    void log_out(){
        System.out.println("log out from the system");
    }



}

