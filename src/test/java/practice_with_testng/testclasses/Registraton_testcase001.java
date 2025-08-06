package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.Admin_Control;
import practice_with_testng.pageobject.Registration;

public class Registraton_testcase001 extends base_class{

    Registration r1=new Registration(driver);


    @Test
    public void Registration(){
        r1=new Registration(driver);
        r1.registration();
        Assert.assertTrue(r1.evaluation_header.isDisplayed());

    }

    @Test
    public void course_withdraw(){
        r1=new Registration(driver);
        r1.course_withdraw();
        Assert.assertTrue(r1.withdraw_header.isDisplayed());
        Assert.assertTrue(r1.student_details.isDisplayed());
    }

    @Test
    public void My_account(){
        Admin_Control ad01=new Admin_Control(driver);
        r1=new Registration(driver);
        r1.My_account();
        Assert.assertTrue(ad01.user_mgt_header.isDisplayed());
        Assert.assertTrue(ad01.Message_section.isDisplayed());
        Assert.assertTrue(ad01.Update_button.isDisplayed()&&ad01.Update_button.isEnabled());


    }
}
