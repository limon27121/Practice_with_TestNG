package TestNG.Dataproviders_and_parallel_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider_Demo {
    WebDriver driver;
    @BeforeClass
    void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //data come from data provider method name dp1
    @Test(dataProvider = "dp1")
    void Test_Login(String email,String password) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (status==true){
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }

    }

    @AfterClass
    void down(){
        driver.close();
    }

    //data provider method from TestNG
    //indices means which row-data of array we pass
    //name represent the method_name
    //indices means which rows data are passed to from data provider method(row start from 0 index))
    @DataProvider(name = "dp1",indices = {0,1,4})
    Object[][] login_data(){
       Object[][] User_Credentials = {
                {"user1@example.com", "password123"},
                {"user2@example.com", "pass456"},
                {"user3@example.com", "abc789"},
                {"user4@example.com", "mypassword"},
                {"moontaser009@gmail.com", "limon123"}
        };
        return User_Credentials;
    }
}
