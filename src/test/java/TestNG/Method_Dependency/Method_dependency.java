package TestNG.Method_Dependency;
//1.openapp
//2.login
//3.search
//4.adv_search
//5.logout

import org.testng.Assert;
import org.testng.annotations.Test;

public class Method_dependency {
    @Test(priority = 1)
    void openapp(){
        Assert.assertTrue(true);
    }

    //openapp method is required for login method executed
    @Test(priority = 2,dependsOnMethods = {"openapp"})
    void login(){
        Assert.assertTrue(true);
    }


    @Test(priority = 3,dependsOnMethods = {"login"})
    void search(){
        Assert.assertTrue(true);
    }

    // 2 methods are reqiured for executed this methods
    @Test(priority = 4,dependsOnMethods = {"login","search"})
    void adv_search(){
        Assert.assertTrue(true);
    }

    @Test(priority = 5,dependsOnMethods = {"login"})
    void logout(){
        Assert.assertTrue(true);
    }
}
