package TestNG.Listener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(listener.class)
public class listener_test {
 WebDriver driver;

 //test class
 @BeforeClass
    void set_up() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
    }

    @Test(priority = 1)

    void Test_logo(){
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Test(priority = 2)
    void test_url(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://op-ensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 3,dependsOnMethods = {"test_url"})
    void test_title(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void down(){
        driver.close();
    }

}
