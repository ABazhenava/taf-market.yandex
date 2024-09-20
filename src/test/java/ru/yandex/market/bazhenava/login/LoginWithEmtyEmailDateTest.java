package ru.yandex.market.bazhenava.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginWithEmtyEmailDateTest {

    @Test
    public void testLoginWithEmptyEmailData() {

        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        loginPage.validatingWhenEmptyEmailEnter();
        DriverSingleton.closeDriver();
    }
}
