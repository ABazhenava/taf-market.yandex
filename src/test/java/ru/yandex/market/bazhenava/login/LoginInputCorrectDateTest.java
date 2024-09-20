package ru.yandex.market.bazhenava.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.HomePage;
import ru.yandex.market.bazhenava.LoginPage;
import ru.yandex.market.bazhenava.driver.DriverSingleton;

public class LoginInputCorrectDateTest {

    @Test
    public void testInputCorrectEmailAndPasswordDate() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail("aksana.bazhenava@gmail.com");
        loginPage.clickButtonEnter();
        loginPage.inputPassword("Asdf#12369874");
        loginPage.clickButtonLoginContinue();
        //loginPage.clickButtonLoginNotYet();

        homePage.validatingWhenСorrectLoginDateEnter();
        DriverSingleton.closeDriver();
    }
}
