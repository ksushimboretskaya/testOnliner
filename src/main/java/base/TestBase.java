package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    static private WebDriver driver;

    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage()
                .window().
                maximize();
        driver.manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.onliner.by/");
    }
}
