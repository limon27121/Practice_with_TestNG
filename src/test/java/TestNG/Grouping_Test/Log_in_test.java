package TestNG.Grouping_Test;

import org.testng.annotations.Test;

public class Log_in_test {

    //set priority and groups
    @Test(priority = 1, groups = {"sanity"})
   void login_with_google(){

        System.out.println("log in with google");
   }
    //set priority and groups
   @Test(priority = 1, groups = {"sanity"})
   void login_with_facebook(){

        System.out.println("log in with facebook");
   }
    //set priority and groups
   @Test(priority = 1,groups = {"sanity"})
   void login_with_twitter(){
       System.out.println("log in with twitter");
   }

}
