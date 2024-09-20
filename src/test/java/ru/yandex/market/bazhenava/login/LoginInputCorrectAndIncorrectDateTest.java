package ru.yandex.market.bazhenava.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginInputCorrectAndIncorrectDateTest {

    @Test
    public void testInputCorrectEmailIncorrectPassword() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("aksana.bazhenava@gmail.com");
        loginPage.clickButtonEnter();

        loginPage.inputPassword("Asdf#1236987");
        loginPage.clickButtonLoginContinue();

        loginPage.validatingWhenIncorrectPasswordEnter();
        DriverSingleton.closeDriver();
    }
}
