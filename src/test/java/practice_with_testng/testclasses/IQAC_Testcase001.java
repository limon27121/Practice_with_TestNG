package practice_with_testng.testclasses;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.IQAC_page;
import practice_with_testng.pageobject.home_page;

import java.util.List;

public class IQAC_Testcase001 extends base_class {
    home_page home=new home_page(driver);
    IQAC_page iqac=new IQAC_page(driver);
    @BeforeMethod
    public void common(){
        iqac=new IQAC_page(driver);
        iqac.click_IQAC();
    }

    @Test
    public void Test_IQAC(){
       home=new home_page(driver);
       iqac=new IQAC_page(driver);
        Assert.assertTrue(home.isBannerDisplayed(home.banner));

    }


    @Test
    public void testNavbarLinksAreClickable() {
        home=new home_page(driver);
        iqac=new IQAC_page(driver);
        // Check static links: Home, UCAM
        List<WebElement> staticLinks = iqac.staticNavLinks;

        Assert.assertEquals(staticLinks.size(), 2, "Expected 2 static nav links");

        for (WebElement link : staticLinks) {
            String text = link.getText();
            Assert.assertTrue(iqac.isLinkVisibleAndClickable(link), "Link not clickable or visible: " + text);
        }

        // Check IQAC link in table
        Assert.assertTrue(iqac.isLinkVisibleAndClickable(iqac.iqacLink),
                "IQAC link in table not clickable or visible");
    }

}
