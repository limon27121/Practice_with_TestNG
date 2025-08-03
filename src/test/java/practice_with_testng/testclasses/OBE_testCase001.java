package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.OBE;
import practice_with_testng.pageobject.home_page;

public class OBE_testCase001 extends base_class {

    home_page home=new home_page(driver);
    OBE o1=new OBE(driver);
    @Test
    public void test_OBE(){
        o1=new OBE(driver);
        o1.click_obe();
        Assert.assertTrue(o1.main_page.isDisplayed());
    }
}
