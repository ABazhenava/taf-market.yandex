package ru.yandex.market.bazhenava;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.login.LoginPageXPath;
import ru.yandex.market.bazhenava.utils.Waiters;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
   // private Faker faker;
    WebDriverWait webDriverWait;

    public LoginPage() {

        this.driver = DriverSingleton.getDriver();
     //   faker = new Faker();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void clickButtonEnter() {
        By buttonLoginBy = By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH);
        WebElement buttonEnterWebElement = driver.findElement(buttonLoginBy);
        buttonEnterWebElement.click();
        Waiters.waitFor(3);
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

//    public void inputRandomEmail() {
//        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
//        WebElement inputEmail = driver.findElement(inputEmailBy);
//        Waiters.waitFor(2);
//        inputEmail.sendKeys(faker.internet().emailAddress());
//        Waiters.waitFor(4);
//    }
//
//    public void inputCorrectEmail() {
//        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
//        WebElement inputEmail = driver.findElement(inputEmailBy);
//        inputEmail.sendKeys(LoginPageXPath.CORRECT_EMAIL);
//        Waiters.waitFor(4);
//    }
//
//    public void inputRandomPassword() {
//        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
//        WebElement inputPassword = driver.findElement(inputPasswordBy);
//        String randomPassword = faker.numerify("######");
//        Waiters.waitFor(4);
//        inputPassword.sendKeys(randomPassword);
//        Waiters.waitFor(2);
//    }
//
//    public void inputCorrectPassword() {
//        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
//        WebElement inputPassword = driver.findElement(inputPasswordBy);
//        inputPassword.sendKeys(LoginPageXPath.CORRECT_PASSWORD);
//        Waiters.waitFor(4);
//    }

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
        By incorrectPasswordEnterBy = By.xpath(LoginPageXPath.SEND_CODE_AGAINE);
        WebElement incorrectPasswordEnter = driver.findElement(incorrectPasswordEnterBy);
        String actualIncorrectPasswordEnterText = incorrectPasswordEnter.getText();
        String expectedIncorrectPasswordEnterText = "Отправить код повторно";

        Waiters.waitFor(2);
        Assertions.assertEquals(expectedIncorrectPasswordEnterText, actualIncorrectPasswordEnterText);
    }
}
