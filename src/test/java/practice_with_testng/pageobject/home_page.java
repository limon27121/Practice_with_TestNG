package practice_with_testng.pageobject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ListIterator;

public class home_page extends basepage {

    public home_page(WebDriver driver) {
        super(driver);
    }


    //------locators

    //banner section

    @FindBy(xpath = "//div[@class='Header-Container']")
    public WebElement banner;

    @FindBy(xpath = "//a[@id='ctl00_lblLogout']")
    public WebElement logout_button;

    @FindBy(xpath = "//div[@class='card-body text-center']")
    public WebElement login_card;


    @FindBy(xpath = "//div[contains(@class,'bg-c-yellow update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement transcript_section;

    @FindBy(xpath = "//div[contains(@class,'bg-c-green update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement balance_section;

    @FindBy(xpath = "//div[contains(@class,'bg-c-pink update-card')]//div[contains(@class,'panel-body card-block')]")
    WebElement online_payment;

    @FindBy(xpath = "//div[@id='bs-example-navbar-collapse-1']")
    WebElement navbar;


    //------home navbar_header------
    @FindBy(css = ".navbar-header ul.staticHome li")
    public List<WebElement> nav_header_Items;
    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "IQAC")
    public WebElement iqacLink;

    @FindBy(linkText = "OBE")
    public WebElement obeLink;

    //-------navbar body-------------------
    @FindBy(css = "ul.level1.nav.navbar-nav.static li a")
    private List<WebElement> menuLinks;

    // ----------home body section-----------

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='row']/div[@class='col-sm-12 col-md-8 col-lg-8']/div[1]/div[1]/div[1]")
    public WebElement Important_Announcement;
    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='row']/div[@class='col-sm-12 col-md-8 col-lg-8']/div[2]/div[1]")
    public WebElement Notice;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='row']/div[@class='col-sm-12 col-md-8 col-lg-8']/div[3]/div[1]")
    public WebElement Profile;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@class='container-fluid']/div[@class='row']/div/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='row']/div[@class='col-sm-12 col-md-4 col-lg-4']/div[3]/div[1]")
    public WebElement Result_Summary;


    //Actions

    public boolean transcript_displayed() {
        boolean displayed_trans = transcript_section.isDisplayed();
        return displayed_trans;
    }

    public boolean balance_displayed() {
        boolean displayed_balance = balance_section.isDisplayed();
        return displayed_balance;
    }

    public boolean payment_displayed() {
        return online_payment.isDisplayed();
    }

    public boolean navbar_displayed() {
        return navbar.isDisplayed();
    }


    //------navbar header related methods------------
    public int getNavItemCount() {
        return nav_header_Items.size();
    }

    //use methods to check if the web-element is displayed properly
    public boolean isNavItemDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    //use methods to check if the web-element is clickable or mot
    public boolean isNavItemClickable(WebElement element) {
        return element.isEnabled() && element.getAttribute("href") != null;
    }

    //---return web-elements which is test on test-class--
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

    // Return total size of  menu-items
    public int getMenuItemCount() {
        return menuLinks.size();
    }

    // Return all menu items
    public List<WebElement> getMenuLinks() {
        return menuLinks;
    }

    //this method is used for to check element is visible and clickable
    public boolean isLinkVisibleAndClickable(WebElement element) {
        String href = element.getAttribute("href");
        return element.isDisplayed() && href != null && !href.isEmpty();
    }

    //--banner section------

    public boolean isBannerDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isLogoutClickable(WebElement element) {
        return element.isEnabled() && element.getAttribute("href") != null;
    }

    public boolean logout_action() {
        logout_button.click();
        return login_card.isDisplayed();
    }


    public boolean Is_homebody_Displayed(WebElement element) {

        return element.isDisplayed();
    }

}


