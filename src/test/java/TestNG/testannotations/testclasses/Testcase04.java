package TestNG.testannotations.testclasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testcase04 {
    @Test
    void log_out(){
        System.out.println("log out from system");
    }
    @AfterTest
    void At(){
        System.out.println("This is AfterTest Method");
    }
}
