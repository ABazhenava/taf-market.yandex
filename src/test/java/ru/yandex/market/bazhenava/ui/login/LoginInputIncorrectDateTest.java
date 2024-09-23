package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginInputIncorrectDateTest {

    @Test
    public void testInputIncorrectEmailAndPasswordDate() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("mail");
        loginPage.clickButtonEnter();
        loginPage.inputPassword("1234");
        loginPage.clickButtonLoginContinue();

        loginPage.validatingWhenIncorrectPasswordEnter();
        DriverSingleton.closeDriver();
    }
}
