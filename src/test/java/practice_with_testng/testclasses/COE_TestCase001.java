package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.COE;

public class COE_TestCase001 extends base_class{

    COE c1=new COE(driver);

    @Test
    public void testClickFirstDropdownItem() throws InterruptedException {

        c1=new COE(driver);

        c1.clickFirstDropdownItem();

        Assert.assertTrue(c1.first_page_title.isDisplayed());
        Assert.assertTrue(c1.body_section.isDisplayed());
        Assert.assertTrue(c1.apply_button.isDisplayed() && c1.apply_button.isEnabled());
        Assert.assertTrue(c1.detalis_table.isDisplayed());
    }

    @Test
    public void testClickSecondDropdownItem() throws InterruptedException {

        c1=new COE(driver);

        c1.clickSecondDropdownItem();

        Assert.assertTrue(c1.second_page_title.isDisplayed());
        Assert.assertTrue(c1.second_body.isDisplayed());
        Assert.assertTrue(c1.apply_button01.isDisplayed() && c1.apply_button01.isEnabled());
        Assert.assertTrue(c1.status.isDisplayed());
    }

    @Test
    public void testClickThirdropdownItem() throws InterruptedException {

        c1=new COE(driver);

        c1.clickThirdDropdownItem();

        Assert.assertTrue(c1.third_page_title.isDisplayed());
        Assert.assertTrue(c1.third_body.isDisplayed());
        Assert.assertTrue(c1.apply_button02.isDisplayed() && c1.apply_button01.isEnabled());
        Assert.assertTrue(c1.status1.isDisplayed());
    }

    @Test
    public void testClickFourthropdownItem() throws InterruptedException {

        c1=new COE(driver);

        c1.clickFourthDropdownItem();

        Assert.assertTrue(c1.fourth_page_title.isDisplayed());
        Assert.assertTrue(c1.certification_section.isDisplayed());
        Assert.assertTrue(c1.apply_button03.isDisplayed() && c1.apply_button01.isEnabled());
        Assert.assertTrue(c1.status2.isDisplayed());
    }

}
