package TestNG.testannotations.testclasses;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase03 {
    @Test
    void log_in(){
        System.out.println("log in to system");

    }
    @BeforeTest
    void bt(){
        System.out.println("this is BeforeTest Method");
    }


}
