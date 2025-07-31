package practice_with_testng.testclasses;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.home_page;
import practice_with_testng.pageobject.login_page;

import java.util.List;

public class home_testcase002 extends base_class{

    @Test
    public void home_page() throws InterruptedException {
        login_page login=new login_page(driver);
        login.log_in("011171060","2353");
        Thread.sleep(1000);
        home_page home=new home_page(driver);
        Assert.assertTrue(home.transcript_displayed());
        Assert.assertTrue(home.balance_displayed());
        Assert.assertTrue(home.payment_displayed());
//        Assert.assertTrue(home.navbar_displayed());
    }


    @Test
    public void home_navbar(){
//        login_page login=new login_page(driver);
////        login.log_in("011171060","2353");
        home_page home=new home_page(driver);
        Assert.assertTrue(home.navbar_displayed());
    }


    @Test
    public void navbar_header() {
        home_page home=new home_page(driver);
        // Step 1: Count check
        int itemCount = home.getNavItemCount();
        Assert.assertEquals(itemCount, 3, "Expected 3 navigation items");

        // Step 2: Display and clickable check for each item
        Assert.assertTrue(home.isNavItemDisplayed(home.getHomeLink()), "Home link is displayed");
        Assert.assertTrue(home.isNavItemClickable(home.getHomeLink()), "Home link is clickable");

        Assert.assertTrue(home.isNavItemDisplayed(home.getIqacLink()), "IQAC link is displayed");
        Assert.assertTrue(home.isNavItemClickable(home.getIqacLink()), "IQAC link is clickable");

        Assert.assertTrue(home.isNavItemDisplayed(home.getObeLink()), "OBE link not displayed");
        Assert.assertTrue(home.isNavItemClickable(home.getObeLink()), "OBE link not clickable");
    }

    @Test
    public void verify_nav_MenuItemsVisibleAndClickable() {
        home_page home=new home_page(driver);
        List<WebElement> menuLinks = home.getMenuLinks();
        // Check total count
        Assert.assertEquals(menuLinks.size(), 7, "Expected 7 menu items");

        // Check each item is visible and clickable
        for (WebElement link : menuLinks) {
            String linkText = link.getText();
            Assert.assertTrue(home.isLinkVisibleAndClickable(link), "Link not visible or clickable: " + linkText);
        }
    }





}
