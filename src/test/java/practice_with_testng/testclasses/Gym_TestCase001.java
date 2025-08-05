package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.GYM;

public class Gym_TestCase001 extends base_class {
    GYM g1=new GYM(driver);

    @Test
    public void gym_test(){
        g1=new GYM(driver);
        g1.gym_click();
        Assert.assertTrue(g1.Header_text.isDisplayed());
        Assert.assertTrue(g1.Gym_body.isDisplayed());
        Assert.assertTrue(g1.enroll_button.isDisplayed()&& g1.enroll_button.isEnabled());
    }

}
