package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.BaseTest;
import ru.yandex.market.bazhenava.pages.home.HomePageXPath;

import java.time.Duration;


public class OpenSiteTest extends BaseTest {

    @Test
    public void testOpenSiteThenCheckOpening() {

        By LinkOpenMarketYandexSiteBy = By.xpath(HomePageXPath.YANDEX_MARKET_LOGO);
        WebElement LinkOpenMarketYandexSiteWebElement = driver.findElement(LinkOpenMarketYandexSiteBy);
        String actualLogoSiteNameText = LinkOpenMarketYandexSiteWebElement.getText();
        String expectedLogoSiteNameText = "Яндекс";

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> LinkOpenMarketYandexSiteWebElement.isDisplayed());
        Assertions.assertEquals(expectedLogoSiteNameText, actualLogoSiteNameText);
    }
}
