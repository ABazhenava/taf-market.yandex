package ru.yandex.market.bazhenava.catalog;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.utils.Utils;

public class TVSubCatalogSiteTest {

    @Test
    public void testChoiceSubCatalogTVAndCheckText() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonCatalog();
        homePage.moveOnDropDownLinkCatalogToElektronika();
        homePage.openSubCatalogTV();

        Utils utils = new Utils();
        utils.scrollingDown();

        homePage.validatingWhenSubCatalogTVOpening();
        DriverSingleton.closeDriver();
    }
}
