package ru.yandex.market.bazhenava.pages.home;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.components.Components;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.bin.BinXPath;
import ru.yandex.market.bazhenava.utils.Waiters;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private Faker faker;
    Components components = new Components();

    public void openPage() {
        driver.get(HomePageXPath.BASE_URL);
    }

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
        Faker faker = new Faker();
    }

    public void openSiteThenCheckOpening() {
        By LinkOpenMarketYandexSiteBy = By.xpath(HomePageXPath.YANDEX_MARKET_LOGO);
        WebElement LinkOpenMarketYandexSite = driver.findElement(LinkOpenMarketYandexSiteBy);
        String actualLogoSiteNameText = LinkOpenMarketYandexSite.getText();
        String expectedLogoSiteNameText = HomePageXPath.LOGO_SITE_NAME;
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(components.MIN_FIBONACCI_NUMBER));
        wait.until(d -> LinkOpenMarketYandexSite.isDisplayed());
        Assertions.assertEquals(expectedLogoSiteNameText, actualLogoSiteNameText);
    }

    public void clickButtonLogin() {
        By buttonLoginBy = By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH);
        WebElement buttonLogin = driver.findElement(buttonLoginBy);
        buttonLogin.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void validatingWhenСorrectLoginDateEnter() {
        By correctLoginDataEnterBy = By.xpath(HomePageXPath.LINK_WE_ON_SOCIAL_MEDIA);
        WebElement correctLoginDataEnter = driver.findElement(correctLoginDataEnterBy);
        String actualCorrectLoginDataEnterText = correctLoginDataEnter.getText();
        String expectedCorrectLoginDataEnterText = HomePageXPath.CORRECT_LINK_LOGIN_DATE;
        Waiters.waitFor(components.MAX_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedCorrectLoginDataEnterText, actualCorrectLoginDataEnterText);
    }

    public void clickButtonCatalog() {
        By buttonOpenMarketYandexCatalogBy = By.xpath(HomePageXPath.BUTTON_MARKET_YANDEX_CATALOG);
        WebElement buttonOpenMarketYandexCatalog = driver.findElement(buttonOpenMarketYandexCatalogBy);
        buttonOpenMarketYandexCatalog.click();
        Waiters.waitFor(components.MAX_FIBONACCI_NUMBER);
    }

    public void moveOnDropDownLinkCatalogToElektronika() {
        By linkCatalogElektronikaBy = By.xpath(DropDownMenuPageXPath.LINK_CATALOG_ELEKTRONIKA);
        WebElement linkCatalogElektronika = driver.findElement(linkCatalogElektronikaBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(linkCatalogElektronika).perform();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void openSubCatalogTV() {
        By linkOpenSubCatalogTVBy = By.xpath(DropDownMenuPageXPath.SUB_CATALOG_TV);
        WebElement linkOpenSubCatalogTV = driver.findElement(linkOpenSubCatalogTVBy);
        linkOpenSubCatalogTV.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void addTVToBin() {
        By linkTVBy = By.xpath(BinXPath.TV_IN_BIN_XPATH);
        WebElement linkTV = driver.findElement(linkTVBy);
        linkTV.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void openBin() {
        By buttonBinBy = By.xpath(BinXPath.BUTTON_BIN_XPATH);
        WebElement buttonBin = driver.findElement(buttonBinBy);
        buttonBin.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void validatingLinkBinOpen() {
        By linkBinOpenBy = By.xpath(BinXPath.LINK_BIN_XPATH);
        WebElement linkBinOpen = driver.findElement(linkBinOpenBy);
        String actualBinNameText = linkBinOpen.getText();
        String expectedBinNameText = HomePageXPath.BIN_NAME;
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(components.MIN_FIBONACCI_NUMBER));
        wait.until(d -> linkBinOpen.isDisplayed());
        Assertions.assertEquals(expectedBinNameText, actualBinNameText);
    }

    public void validatingTVInBinOrder() {
        By linkTVInBinOrderBy = By.xpath(BinXPath.IN_BIN_TO_ORDER);
        WebElement linkTVInBinOrder = driver.findElement(linkTVInBinOrderBy);
        String actualLinkNameText = linkTVInBinOrder.getText();
        String expectedLinkNameText = BinXPath.ORDER;
        Assertions.assertEquals(expectedLinkNameText, actualLinkNameText);
    }

    public void validatingWhenSubCatalogTVOpening() {
        By linkForCustemBy = By.xpath(HomePageXPath.LINK_FOR_CUSTEM_DOWN_SITE);
        WebElement linkForCustem = driver.findElement(linkForCustemBy);
        String actualLinkNameText = linkForCustem.getText();
        String expectedLinkNameText = HomePageXPath.LINKS_FOR_CUSTEMER;
        Assertions.assertEquals(expectedLinkNameText, actualLinkNameText);
    }
}
