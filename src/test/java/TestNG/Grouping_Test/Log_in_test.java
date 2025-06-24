package TestNG.Grouping_Test;

import org.testng.annotations.Test;

public class Log_in_test {
   @Test(priority = 1, groups = {"sanity"})
   void login_with_google(){
       System.out.println("log in with google");
   }
   @Test(priority = 1, groups = {"sanity"})
   void login_with_facebook(){
       System.out.println("log in with facebook");
   }
   @Test(priority = 1,groups = {"sanity"})
   void login_with_twitter(){
       System.out.println("log in with twitter");
   }

}
