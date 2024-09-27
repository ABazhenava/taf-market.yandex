package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.components.Components;

public class LoginInputCorrectDateTest {

    @Test
    public void testInputCorrectEmailAndPasswordDate() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        Components user = new Components();
        user.inputCorrectEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        user.inputCorrectPassword();
        loginPage.clickButtonLoginContinue();

        homePage.validatingWhenСorrectLoginDateEnter();
        DriverSingleton.closeDriver();
    }
}
