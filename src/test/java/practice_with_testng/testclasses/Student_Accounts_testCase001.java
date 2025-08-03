package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.Student_Accounts;

public class Student_Accounts_testCase001 extends base_class {
    Student_Accounts st1=new Student_Accounts(driver);

    @Test
    public void click_payment(){
        st1=new Student_Accounts(driver);
        st1.click_payment();
        Assert.assertTrue(st1.payment_header.isDisplayed());
        Assert.assertTrue(st1.online_amount_filed.isEnabled());
        Assert.assertTrue(st1.payment_button.isDisplayed() && st1.payment_button.isEnabled(),"Payment button should be visible and enabled, but it's not.");
        Assert.assertTrue(st1.student_detalis.isDisplayed(),"student detalis should be visible and enabled, but it's not.");
        Assert.assertTrue(st1.tuition_detalis.isDisplayed(),"tuition detalis should be visible and enabled, but it's not.");
        Assert.assertTrue(st1.detalis_table.isDisplayed());
    }
}
