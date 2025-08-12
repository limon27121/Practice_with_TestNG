package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.Result;

public class Result_testcase001 extends base_class{
    Result res=new Result(driver);

    @Test
    public void result(){
      res=new Result(driver);
      res.isNavbarDisplayed();
        Assert.assertTrue(res.nav_menu1.isDisplayed());
        Assert.assertTrue(res.mark.isDisplayed()&& res.mark.isEnabled());
        res.click_mark();
        Assert.assertTrue(res.mark_panel.isDisplayed());



    }

}
