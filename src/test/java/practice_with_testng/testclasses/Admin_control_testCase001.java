package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.Admin_Control;

public class Admin_control_testCase001 extends base_class {

 Admin_Control ad01=new Admin_Control(driver);

 @Test
    public void admin(){
     ad01=new Admin_Control(driver);
     ad01.click_admin_control();
     ad01.user_mgt();
  Assert.assertTrue(ad01.user_mgt_header.isDisplayed());
  Assert.assertTrue(ad01.Message_section.isDisplayed());
  Assert.assertTrue(ad01.Update_button.isDisplayed()&&ad01.Update_button.isEnabled());

 }


}
