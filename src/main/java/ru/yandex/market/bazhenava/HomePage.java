package ru.yandex.market.bazhenava;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.DropDownMenuPageXPath;
import ru.yandex.market.bazhenava.pages.HomePageXPath;
import ru.yandex.market.bazhenava.utils.Waiters;

public class HomePage {
    WebDriver driver;
    public static final String URL = "https://market.yandex.ru/";

    public void openPage() {
        driver.get(URL);
    }

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
    }

    public void clickButtonLogin() {
        By buttonLoginBy = By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH);
        WebElement buttonLoginWebElement = driver.findElement(buttonLoginBy);
        buttonLoginWebElement.click();
        Waiters.waitFor(2);
    }

    public void validatingWhenСorrectLoginDateEnter() {
        By correctLoginDataEnterBy = By.xpath(HomePageXPath.LINK_WE_ON_SOCIAL_MEDIA);
        WebElement correctLoginDataEnter = driver.findElement(correctLoginDataEnterBy);
        String actualCorrectLoginDataEnterText = correctLoginDataEnter.getText();
        String expectedCorrectLoginDataEnterText = "Мы в соцсетях";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedCorrectLoginDataEnterText, actualCorrectLoginDataEnterText);
    }

    public void clickButtonCatalog() {
        By buttonOpenMarketYandexCatalogBy = By.xpath(HomePageXPath.BUTTON_MARKET_YANDEX_CATALOG);
        WebElement buttonOpenMarketYandexCatalogWebElement = driver.findElement(buttonOpenMarketYandexCatalogBy);
        buttonOpenMarketYandexCatalogWebElement.click();
        Waiters.waitFor(4);
    }

    public void moveOnDropDownLinkCatalogToElektronika() {
        By linkCatalogElektronikaBy = By.xpath(DropDownMenuPageXPath.LINK_CATALOG_ELEKTRONIKA);
        WebElement linkCatalogElektronikaWebElement = driver.findElement(linkCatalogElektronikaBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(linkCatalogElektronikaWebElement).perform();
        Waiters.waitFor(2);
    }

    public void openSubCatalogTV() {
        By linkOpenSubCatalogTVBy = By.xpath(DropDownMenuPageXPath.SUB_CATALOG_TV);
        WebElement linkOpenSubCatalogTVWebElement = driver.findElement(linkOpenSubCatalogTVBy);
        linkOpenSubCatalogTVWebElement.click();
        Waiters.waitFor(2);
    }

    public void validatingWhenSubCatalogTVOpening() {
        By linkForCustemBy = By.xpath(HomePageXPath.LINK_FOR_CUSTEM_DOWN_SITE);
        WebElement linkForCustemWebElement = driver.findElement(linkForCustemBy);
        String actualLinkNameText = linkForCustemWebElement.getText();
        String expectedLinkNameText =
                "Покупателям\n" +
                        "Как выбрать товар\n" +
                        "Оплата и доставка\n" +
                        "Обратная связь\n" +
                        "Покупайте как юрлицо\n" +
                        "О сервисе\n" +
                        "Участие в исследованиях\n" +
                        "Возвраты";

        Assertions.assertEquals(expectedLinkNameText, actualLinkNameText);
    }

    public void validatingHomePageOpening() {
        By linkSplit0012By = By.xpath(HomePageXPath.LINK_SPLIT_0012);
        WebElement linkSplit0012WebElement = driver.findElement(linkSplit0012By);
        String actualLinkNameText = linkSplit0012WebElement.getText();
        String expectedLinkNameText ="Сплит 0012";

        Assertions.assertEquals(expectedLinkNameText, actualLinkNameText);
    }
}
