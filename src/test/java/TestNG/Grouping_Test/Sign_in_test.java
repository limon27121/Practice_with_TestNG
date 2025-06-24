package TestNG.Grouping_Test;

import org.testng.annotations.Test;

public class Sign_in_test {
    @Test(priority = 1,groups = {"regression"})
    void sign_in_with_facebook(){
        System.out.println("sign_up with facebook");
    }
    @Test(priority = 1,groups = {"regression"})
    void sign_in_with_google(){
        System.out.println("sign_up with google");
    }
    @Test(priority = 1,groups = {"regression"})
    void sign_in_with_twitter(){
        System.out.println("sign_up with twitter");
    }
}
