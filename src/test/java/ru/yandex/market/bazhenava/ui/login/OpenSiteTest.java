package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.market.bazhenava.BaseTest;
import ru.yandex.market.bazhenava.pages.HomePageXPath;
import ru.yandex.market.bazhenava.utils.Waiters;


public class OpenSiteTest extends BaseTest {

    @Test
    public void testOpenSiteThenCheckOpening() {

        By LinkOpenMarketYandexSiteBy = By.xpath(HomePageXPath.YANDEX_MARKET_LOGO);
        WebElement LinkOpenMarketYandexSiteWebElement = driver.findElement(LinkOpenMarketYandexSiteBy);
        String actualLogoSiteNameText = LinkOpenMarketYandexSiteWebElement.getText();
        String expectedLogoSiteNameText = "Яндекс";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedLogoSiteNameText, actualLogoSiteNameText);
    }
}
