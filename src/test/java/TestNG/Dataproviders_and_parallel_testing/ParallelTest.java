package TestNG.Dataproviders_and_parallel_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTest {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    void Setup(String br) throws InterruptedException {
        switch (br.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser name, launching Chrome as default");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);

    }

    @Test(priority = 1)

    void Test_logo(){
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Test(priority = 2)
    void test_title(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test(priority = 3)
    void test_url(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
    void down(){
        driver.close();
    }

}
