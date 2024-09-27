package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.components.Components;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginInputIncorrectLoginPassTest {

    @Test
    public void testInputCorrectEmailIncorrectPassword() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        Components components = new Components();
        components.inputRandomLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();

        components.inputRandomPassword();
        loginPage.clickButtonRegisterContinueAfterEmailPasswordEnter();

        loginPage.validatingWhenIncorrectDateEnter();
        DriverSingleton.closeDriver();
    }
}