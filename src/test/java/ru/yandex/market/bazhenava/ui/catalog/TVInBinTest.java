package ru.yandex.market.bazhenava.ui.catalog;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class TVInBinTest {

    @Test
    public void testTVInBin() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonCatalog();
        homePage.moveOnDropDownLinkCatalogToElektronika();
        homePage.openSubCatalogTV();
        homePage.addTVToBin();
        homePage.openBin();
        homePage.validatingLinkBinOpen();
        homePage.validatingTVInBinOrder();
        DriverSingleton.closeDriver();
    }
}
