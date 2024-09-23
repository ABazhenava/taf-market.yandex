package ru.yandex.market.bazhenava;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.LoginPageXPath;
import ru.yandex.market.bazhenava.utils.Waiters;

public class LoginPage {

    WebDriver driver;
    private Faker faker;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
    }

    public void clickButtonEnter() {
        By buttonLoginBy = By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH);
        WebElement buttonEnterWebElement = driver.findElement(buttonLoginBy);
        buttonEnterWebElement.click();
        Waiters.waitFor(2);
    }

    public void clickButtonPhoneEnter() {
        By buttonPhoneEnterBy = By.xpath(LoginPageXPath.BUTTON_ENTER_PHONE_XPATH);
        WebElement buttonPhoneEnterWebElement = driver.findElement(buttonPhoneEnterBy);
        buttonPhoneEnterWebElement.click();
        Waiters.waitFor(2);
    }

    public void validatingWhenEmptyEmailEnter() {
        By emptyEmailEnterBy = By.xpath(LoginPageXPath.EMPTY_EMAIL_ENTER_XPATH);
        WebElement emptyEmailEnter = driver.findElement(emptyEmailEnterBy);
        String actualEmptyEmailEnterText = emptyEmailEnter.getText();
        String expectedEmptyEmailEnterText = "Логин не указан";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedEmptyEmailEnterText, actualEmptyEmailEnterText);
    }

    public void validatingWhenEmptyPhoneEnter() {
        By emptyPhoneEnterBy = By.xpath(LoginPageXPath.EMPTY_PHONE_ENTER_XPATH);
        WebElement emptyPhoneEnter = driver.findElement(emptyPhoneEnterBy);
        String actualEmptyPhoneEnterText = emptyPhoneEnter.getText();
        String expectedEmptyPhoneEnterText = "Недопустимый формат номера";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedEmptyPhoneEnterText, actualEmptyPhoneEnterText);
    }

    public void inputEmail() {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(faker.internet().emailAddress());
        Waiters.waitFor(2);
    }

    public void inputCorrectEmail() {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(LoginPageXPath.CORRECT_EMAIL);
        Waiters.waitFor(2);
    }

    public void inputPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(faker.internet().password(5, 12));
        Waiters.waitFor(2);
    }

    public void inputCorrectPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(LoginPageXPath.CORRECT_PASSWORD);
        Waiters.waitFor(2);
    }

    public void validatingWhenIncorrectEmailEnter() {
        By incorrectEmailEnterBy = By.xpath(LoginPageXPath.ERROR_EMAIL_XPATH);
        WebElement incorrectEmailEnter = driver.findElement(incorrectEmailEnterBy);
        String actualIncorrectEmailEnterText = incorrectEmailEnter.getText();
        String expectedIncorrectEmailEnterText = "Логин не указан";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedIncorrectEmailEnterText, actualIncorrectEmailEnterText);
    }

    public void clickButtonLoginContinue() {
        By buttonLoginContinueBy = By.xpath(LoginPageXPath.BUTTON_LOGIN_CONTINUE);
        WebElement buttonLoginContinueWebElement = driver.findElement(buttonLoginContinueBy);
        buttonLoginContinueWebElement.click();
        Waiters.waitFor(2);
    }

    public void clickButtonLoginNotYet() {
        By buttonLoginNotYetBy = By.xpath(LoginPageXPath.BUTTON_LOGIN_NOT_YET);
        WebElement buttonLoginNotYetWebElement = driver.findElement(buttonLoginNotYetBy);
        buttonLoginNotYetWebElement.click();
        Waiters.waitFor(2);
    }

    public void validatingWhenIncorrectPasswordEnter() {
        By incorrectPasswordEnterBy = By.xpath(LoginPageXPath.ERROR_PASSWORD_XPATH);
        WebElement incorrectPasswordEnter = driver.findElement(incorrectPasswordEnterBy);
        String actualIncorrectPasswordEnterText = incorrectPasswordEnter.getText();
        String expectedIncorrectPasswordEnterText = "Неверный пароль";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedIncorrectPasswordEnterText, actualIncorrectPasswordEnterText);
    }
}
