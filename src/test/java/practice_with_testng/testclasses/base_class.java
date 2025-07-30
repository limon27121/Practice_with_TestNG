package practice_with_testng.testclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class base_class {
    WebDriver driver;
    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup(); // Add this line if using WebDriverManager
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ucam.uiu.ac.bd/Security/LogIn.aspx");
        driver.manage().window().maximize();
    }

    @AfterClass
    void tear_down() {
        driver.close();
    }
}
