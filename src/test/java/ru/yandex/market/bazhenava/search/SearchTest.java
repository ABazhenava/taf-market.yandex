package ru.yandex.market.bazhenava.search;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.BaseTest;
import ru.yandex.market.bazhenava.pages.search.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchGoods() {
        SearchPage searchPage = new SearchPage();
        searchPage.searchQueryInput();
        searchPage.searchQueryEnter();
        searchPage.findSearchResult();
    }
}
