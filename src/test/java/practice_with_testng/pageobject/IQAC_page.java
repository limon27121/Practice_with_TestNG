package practice_with_testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IQAC_page extends basepage{
    public IQAC_page(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "ul.staticHome li a")
    public List<WebElement> staticNavLinks;

    // IQAC link inside the table
    @FindBy(xpath = "//a[contains(text(),'Institutional Quality Assurance Cell')]")
    public WebElement iqacLink;



    //IQAC logo
    @FindBy(xpath="//img[@alt='IQAC Logo']")
    public WebElement IQAC_logo;


    //IQAC survey

    @FindBy(xpath="//a[normalize-space()='IQAC Survey']")
    WebElement survey_button;


    @FindBy(xpath="//a[normalize-space()='Student Survey Form']")
    WebElement survey_form;



    @FindBy(xpath="(//div[@class='PageTitle'])[1]")
    public WebElement survey_page_title;


    @FindBy(xpath="//input[@id='ctl00_MainContainer_btnSubmit']")
    public WebElement survey_submit;

     public void click_IQAC(){
         home_page home=new home_page(driver);
         home.iqacLink.click();
     }

    // Helper method to check if a link is visible and clickable
    public boolean isLinkVisibleAndClickable(WebElement element) {
        String href = element.getAttribute("href");
        return element.isDisplayed() && href != null && !href.trim().isEmpty();
    }



    public void iqacLink(){
         iqacLink.click();
    }


    public void survey(){
        Actions action = new Actions(driver);
        action.moveToElement(survey_button).moveToElement(survey_form).click().build().perform();
    }









}
