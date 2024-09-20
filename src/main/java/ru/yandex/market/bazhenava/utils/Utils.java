package ru.yandex.market.bazhenava.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ru.yandex.market.bazhenava.driver.DriverSingleton;


public class Utils {

    WebDriver driver;
    public Utils() {
        this.driver = DriverSingleton.getDriver();
    }

    public void scrollingDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Waiters.waitFor(3);
    }
}
