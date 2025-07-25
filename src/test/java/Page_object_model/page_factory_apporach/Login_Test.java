package Page_object_model.page_factory_apporach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login_Test {

    WebDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup(); // Add this line if using WebDriverManager
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }


    @Test
    void Test_login() {

        //create object of login page
       LogInPage lg= new LogInPage(driver);
       lg.setUsername("Admin");
       lg.set_password("admin123");
       lg.log_in();

       //------Assertion-------------
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }


    @AfterClass
    void tear_down() {
       driver.close();
    }
}


