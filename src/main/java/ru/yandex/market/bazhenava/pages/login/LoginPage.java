package ru.yandex.market.bazhenava.pages.login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.components.Components;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.utils.Waiters;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    Components components = new Components();

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(components.MAX_FIBONACCI_NUMBER));
    }

    public void clickButtonEnter() {
        By buttonLoginBy = By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH);
        WebElement buttonEnter = driver.findElement(buttonLoginBy);
        buttonEnter.click();
        Waiters.waitFor(components.MAX_FIBONACCI_NUMBER);
    }

    public void clickButtonPhoneEnter() {
        By buttonPhoneEnterBy = By.xpath(LoginPageXPath.BUTTON_ENTER_PHONE_XPATH);
        WebElement buttonPhoneEnter = driver.findElement(buttonPhoneEnterBy);
        buttonPhoneEnter.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void validatingWhenEmptyEmailEnter() {
        By emptyEmailEnterBy = By.xpath(LoginPageXPath.EMPTY_EMAIL_ENTER_XPATH);
        WebElement emptyEmailEnter = driver.findElement(emptyEmailEnterBy);
        String actualEmptyEmailEnterText = emptyEmailEnter.getText();
        String expectedEmptyEmailEnterText = "Логин не указан";
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedEmptyEmailEnterText, actualEmptyEmailEnterText);
    }

    public void validatingWhenEmptyPhoneEnter() {
        By emptyPhoneEnterBy = By.xpath(LoginPageXPath.EMPTY_PHONE_ENTER_XPATH);
        WebElement emptyPhoneEnter = driver.findElement(emptyPhoneEnterBy);
        String actualEmptyPhoneEnterText = emptyPhoneEnter.getText();
        String expectedEmptyPhoneEnterText = "Недопустимый формат номера";
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedEmptyPhoneEnterText, actualEmptyPhoneEnterText);
    }

    public void clickButtonLoginContinue() {
        By buttonLoginContinueBy = By.xpath(LoginPageXPath.BUTTON_LOGIN_CONTINUE);
        WebElement buttonLoginContinue = driver.findElement(buttonLoginContinueBy);
        buttonLoginContinue.click();
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
    }

    public void clickButtonRegisterContinueAfterEmailPasswordEnter() {
        By buttonRegisterContinueBy = By.xpath(LoginPageXPath.BUTTON_REGISTER_NEXT);
        WebElement buttonRegisterContinue = driver.findElement(buttonRegisterContinueBy);
        buttonRegisterContinue.click();
        Waiters.waitFor(components.MAX_FIBONACCI_NUMBER);
    }

    public void validatingWhenIncorrectPasswordEnter() {
        By incorrectPasswordEnterBy = By.xpath(LoginPageXPath.ERROR_PASSWORD_XPATH);
        WebElement incorrectPasswordEnter = driver.findElement(incorrectPasswordEnterBy);
        String actualIncorrectPasswordEnterText = incorrectPasswordEnter.getText();
        String expectedIncorrectPasswordEnterText = "Неверный пароль";
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedIncorrectPasswordEnterText, actualIncorrectPasswordEnterText);
    }

    public void validatingWhenIncorrectDateEnter() {
        By incorrectPasswordEnterBy = By.xpath(LoginPageXPath.SEND_CODE_AGAINE);
        WebElement incorrectPasswordEnter = driver.findElement(incorrectPasswordEnterBy);
        String actualIncorrectPasswordEnterText = incorrectPasswordEnter.getText();
        String expectedIncorrectPasswordEnterText = "Отправить код повторно";
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedIncorrectPasswordEnterText, actualIncorrectPasswordEnterText);
    }

    public void validatingWhenIncorrectLoginPasswordDateEnter() {
        By incorrectPasswordEnterBy = By.xpath(LoginPageXPath.ERROR_PASSWORD_AFTER_RONG_LOGIN_XPATH);
        WebElement incorrectPasswordEnter = driver.findElement(incorrectPasswordEnterBy);
        String actualIncorrectPasswordEnterText = incorrectPasswordEnter.getText();
        String expectedIncorrectPasswordEnterText = "Неверный пароль";
        Waiters.waitFor(components.MIN_FIBONACCI_NUMBER);
        Assertions.assertEquals(expectedIncorrectPasswordEnterText, actualIncorrectPasswordEnterText);
    }
}
