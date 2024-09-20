package ru.yandex.market.bazhenava;

import ru.yandex.market.bazhenava.pages.HomePageXPath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @BeforeEach
    public void driverSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HomePageXPath.BASE_URL);
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }
}
