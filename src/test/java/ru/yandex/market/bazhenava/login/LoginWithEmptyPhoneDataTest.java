package ru.yandex.market.bazhenava.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginWithEmptyPhoneDataTest {


    @Test
    public void testLoginWithEmptyPhoneData() {

        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonPhoneEnter();
        loginPage.clickButtonEnter();
        loginPage.validatingWhenEmptyPhoneEnter();
        DriverSingleton.closeDriver();
    }
}
