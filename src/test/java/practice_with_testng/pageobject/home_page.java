package practice_with_testng.pageobject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ListIterator;

public class home_page extends basepage{

    public home_page(WebDriver driver) {
        super(driver);
    }

    //locators

    @FindBy(xpath="//div[contains(@class,'bg-c-yellow update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement transcript_section;

    @FindBy(xpath="//div[contains(@class,'bg-c-green update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement balance_section;

    @FindBy(xpath="//div[contains(@class,'bg-c-pink update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement online_payment;

    @FindBy(xpath="//div[@id='bs-example-navbar-collapse-1']")
    WebElement navbar;


    //------home navbar_header------
    @FindBy(css = ".navbar-header ul.staticHome li")
    public List<WebElement> nav_header_Items;
    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "IQAC")
    private WebElement iqacLink;

    @FindBy(linkText = "OBE")
    private WebElement obeLink;

    //-------navbar body-------------------
    @FindBy(css = "ul.level1.nav.navbar-nav.static li a")
    private List<WebElement> menuLinks;






    //Actions

    public boolean transcript_displayed(){
        boolean displayed_trans=transcript_section.isDisplayed();
        return displayed_trans;
    }

    public boolean balance_displayed(){
        boolean displayed_balance=balance_section.isDisplayed();
        return displayed_balance;
    }

    public boolean payment_displayed(){
        return online_payment.isDisplayed();
    }

    public boolean navbar_displayed(){
        return navbar.isDisplayed();
    }


    //------navbar header related methods------------
    public int getNavItemCount() {
        return nav_header_Items.size();
    }

    public boolean isNavItemDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isNavItemClickable(WebElement element) {
        return element.isEnabled() && element.getAttribute("href") != null;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getIqacLink() {
        return iqacLink;
    }

    public WebElement getObeLink() {
        return obeLink;
    }



    //----navbar body related methods---------

    // Return total menu items
    public int getMenuItemCount() {
        return menuLinks.size();
    }

    // Return all menu items
    public List<WebElement> getMenuLinks() {
        return menuLinks;
    }

    public boolean isLinkVisibleAndClickable(WebElement element) {
        String href = element.getAttribute("href");
        return element.isDisplayed() && href != null && !href.isEmpty();
    }
}
