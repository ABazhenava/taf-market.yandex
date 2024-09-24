package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginInputIncorrectDateTest {

    @Test
    public void testInputCorrectEmailIncorrectPassword() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputRandomEmail();
        loginPage.clickButtonEnter();

        loginPage.inputRandomPassword();
        loginPage.clickButtonLoginContinue();

        loginPage.validatingWhenIncorrectPasswordEnter();
        DriverSingleton.closeDriver();
    }
}
