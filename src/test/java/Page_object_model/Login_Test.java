package Page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_Test {

    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }


    @Test
    void Test_login() {
       LogIn_page lg=new LogIn_page(driver);
       lg.setUsername("Admin");
       lg.set_password("admin123");
       lg.log_in();

       //Assertion
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }


    @AfterClass
    void tear_down() {
       driver.close();
    }
}
