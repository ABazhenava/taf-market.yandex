package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.components.Components;

public class LoginInputIncorrectDateTest {

    @Test
    public void testInputCorrectEmailIncorrectPassword() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        Components components = new Components();
        components.inputRandomEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();

        components.inputRandomPassword();
        loginPage.clickButtonRegisterContinueAfterEmailPasswordEnter();

        loginPage.validatingWhenIncorrectDateEnter();
        DriverSingleton.closeDriver();
    }
}
