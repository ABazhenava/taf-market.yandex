package ru.yandex.market.bazhenava.ui.login;

import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.BaseTest;
import ru.yandex.market.bazhenava.components.Components;
import ru.yandex.market.bazhenava.pages.home.HomePage;
import ru.yandex.market.bazhenava.pages.login.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testOpenSiteThenCheckOpening() {
        HomePage homePage = new HomePage();
        homePage.openSiteThenCheckOpening();
    }

    @Test
    public void testLoginWithEmptyPhoneData() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonPhoneEnter();
        loginPage.clickButtonEnter();
        loginPage.validatingWhenEmptyPhoneEnter();
    }

    @Test
    public void testLoginWithRandomPhoneData() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonPhoneEnter();
        loginPage.clickButtonEnter();
        loginPage.validatingWhenEmptyPhoneEnter();
    }

    @Test
    public void testLoginWithEmptyEmailData() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        loginPage.validatingWhenEmptyEmailEnter();
    }

    @Test
    public void testInputCorrectEmailPasswordDate() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        Components user = new Components();
        user.inputCorrectEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        user.inputCorrectPassword();
        loginPage.clickButtonLoginContinue();
        homePage.validatingWhenСorrectLoginDateEnter();
    }

    @Test
    public void testInputCorrectEmailRandomPassword() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        Components user = new Components();
        user.inputCorrectEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        user.inputRandomPassword();
        loginPage.clickButtonLoginContinue();
        loginPage.validatingWhenIncorrectPasswordEnter();
    }

    @Test
    public void testInputRandomEmailRandomPassw() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        Components components = new Components();
        components.inputRandomEmail();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        components.inputRandomPassword();
        loginPage.clickButtonRegisterContinueAfterEmailPasswordEnter();
        loginPage.validatingWhenIncorrectDateEnter();
    }

    @Test
    public void testInputRandomLoginRandomPass() {
        HomePage homePage = new HomePage();
        homePage.clickButtonLogin();
        Components components = new Components();
        components.inputRandomLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.clickButtonEnter();
        components.inputRandomPassword();
        loginPage.clickButtonRegisterContinueAfterEmailPasswordEnter();
        loginPage.validatingWhenIncorrectLoginPasswordDateEnter();
    }
}
