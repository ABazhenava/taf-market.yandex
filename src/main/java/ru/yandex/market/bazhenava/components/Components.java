package ru.yandex.market.bazhenava.components;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.market.bazhenava.driver.DriverSingleton;
import ru.yandex.market.bazhenava.pages.login.LoginPageXPath;
import ru.yandex.market.bazhenava.utils.Waiters;

import java.time.Duration;

public class Components {
    WebDriver driver;
    private Faker faker;
    WebDriverWait webDriverWait;

    public Components() {
        this.driver = DriverSingleton.getDriver();
        faker = new Faker();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void inputRandomEmail() {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        Waiters.waitFor(2);
        inputEmail.sendKeys(faker.name().firstName() + "@gmail.com");
        Waiters.waitFor(4);
    }

    public void inputRandomLogin() {
        By inputLoginBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputLogin = driver.findElement(inputLoginBy);
        Waiters.waitFor(2);
        inputLogin.sendKeys(faker.name().firstName());
        Waiters.waitFor(4);
    }

    public void inputCorrectEmail() {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(LoginPageXPath.CORRECT_EMAIL);
        Waiters.waitFor(4);
    }

    public void inputRandomPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_NUMPER_PASSWORD_FROM_EMAIL_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        String randomPassword = faker.numerify("######");
        Waiters.waitFor(4);
        inputPassword.sendKeys(randomPassword);
        Waiters.waitFor(2);
    }

    public void inputCorrectPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(LoginPageXPath.CORRECT_PASSWORD);
        Waiters.waitFor(4);
    }
}
