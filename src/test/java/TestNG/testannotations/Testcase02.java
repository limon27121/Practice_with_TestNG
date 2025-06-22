package TestNG.testannotations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1.log in
//2.search
//3.advanced search
//4.log out
public class Testcase02 {

    WebDriver driver;

   @BeforeClass
    void log_in(){
        System.out.println("log in to system");
    }
    @Test
    void search(){
        System.out.println("searching");
    }
    @Test
    void adv_search(){
        System.out.println("adv_searching");
    }
    @AfterClass
    void log_out(){
        System.out.println("log out from the system");
    }
}
