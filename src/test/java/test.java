import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}
