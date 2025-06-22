package TestNG.testannotations.Test;

import org.testng.annotations.*;

public class Test_Annotations_demo {
    @Test(priority = 1)
    void tc1(){
        System.out.println("here is 1 test case");
    }
    @Test(priority = 2)
    void tc2(){
        System.out.println("here is 2nd test cases");
    }

    @AfterSuite
    void after_suite(){
        System.out.println("after suite methods");
    }
    @BeforeSuite
    void before_suit(){
        System.out.println("before suit");
    }
    @BeforeTest
    void before_test(){
        System.out.println("before test methods");
    }
    @AfterTest
    void after_test(){
        System.out.println("after test methods");
    }
    @BeforeClass
    void before_class(){
        System.out.println("before class methods");
    }

    @AfterClass
    void after_class(){
        System.out.println("after class methods");
    }
    @BeforeMethod
    void before_method(){
        System.out.println("before_methods");
    }
    @AfterMethod
    void after_method(){
        System.out.println("after method");
    }

}
