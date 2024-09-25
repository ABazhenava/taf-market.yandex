package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.user.User;

public class LoginInputCorrectEmailIncorrectPassword {

    @Test
    public void testInputCorrectEmailIncorrectPassword() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        User user = new User();
        user.inputCorrectEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();

        user.inputRandomPassword();
        loginPage.clickButtonLoginContinue();

        loginPage.validatingWhenIncorrectPasswordEnter();
        DriverSingleton.closeDriver();
    }
}
