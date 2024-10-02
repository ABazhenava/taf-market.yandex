package ru.yandex.market.bazhenava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.home.HomePage;

public class BaseTest {

    @BeforeEach
    public void startOpenPage() {
        HomePage homePage = new HomePage();
        homePage.openPage();
    }

    @AfterEach
    public void driverQuit() {
        DriverSingleton.closeDriver();
    }
}
