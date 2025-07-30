package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.home_page;
import practice_with_testng.pageobject.login_page;

public class home_testvase002 extends base_class{

    @Test
    public void home_page() throws InterruptedException {
        login_page login=new login_page(driver);
        login.log_in("011171060","2353");
        Thread.sleep(1000);
        home_page home=new home_page(driver);
        Assert.assertTrue(home.transcript_displayed());
        Assert.assertTrue(home.balance_displayed());
        Assert.assertTrue(home.payment_displayed());
    }
}
