package ru.yandex.market.bazhenava.pages.search;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.components.Components;
import ru.yandex.market.bazhenava.utils.Waiters;

import java.time.Duration;

public class SearchPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    Components components = new Components();

    public SearchPage() {
        this.driver = DriverSingleton.getDriver();
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(components.MAX_FIBONACCI_NUMBER));
    }

    public void searchQueryInput() {
        By searchQueryNameFieldBy = By.xpath(SearchPageXPath.SEARCH_FIELD_FOR_INPUT);
        WebElement searchQueryNameField = driver.findElement(searchQueryNameFieldBy);
        searchQueryNameField.sendKeys(SearchQueries.SEARCH_QUERY);
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void searchQueryEnter() {
        By enterSearchButtonBy = By.xpath(SearchPageXPath.SEARCH_BUTTON_START_ENTER);
        WebElement enterSearchButton = driver.findElement(enterSearchButtonBy);
        enterSearchButton.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void findSearchResult() {
        By searchResultBy = By.xpath(SearchQueries.SEARCH_RESULT_XPATH);
        WebElement searchResult = driver.findElement(searchResultBy);
        String actualSearchResultText = searchResult.getText();
        String expectedSearchResultText = SearchPageXPath.SEARCH_RESULT_SAMSUNG;
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedSearchResultText, actualSearchResultText);
    }
}
