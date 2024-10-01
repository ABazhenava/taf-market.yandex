package ru.yandex.market.bazhenava.ui.catalog;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.BaseTest;
import ru.yandex.market.bazhenava.pages.home.HomePage;
import ru.yandex.market.bazhenava.utils.Utils;

public class CatalogTest extends BaseTest {

    @Test
    public void testChoiceSubCatalogTVAndCheckText() {
        HomePage homePage = new HomePage();
        homePage.clickButtonCatalog();
        homePage.moveOnDropDownLinkCatalogToElektronika();
        homePage.openSubCatalogTV();
        Utils utils = new Utils();
        utils.scrollingDown();
        homePage.validatingWhenSubCatalogTVOpening();
    }

    @Test
    public void testTVInBin() {
        HomePage homePage = new HomePage();
        homePage.clickButtonCatalog();
        homePage.moveOnDropDownLinkCatalogToElektronika();
        homePage.openSubCatalogTV();
        homePage.addTVToBin();
        homePage.openBin();
        homePage.validatingLinkBinOpen();
        homePage.validatingTVInBinOrder();
    }
}
