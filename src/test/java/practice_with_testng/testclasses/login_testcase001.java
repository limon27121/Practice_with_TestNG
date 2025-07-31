package practice_with_testng.testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.login_page;

public class login_testcase001 extends base_class {

@Test
    public void login() throws InterruptedException {
    login_page pg=new login_page(driver);
    boolean displayed1=pg.displayed();
    Assert.assertTrue(displayed1);
}


}
