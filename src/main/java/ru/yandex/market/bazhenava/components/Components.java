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

    public final int MIN_FIBONACCI_NUMBER = 2;
    public final int MAX_FIBONACCI_NUMBER = 3;
    WebDriver driver;
    private Faker faker;
    WebDriverWait webDriverWait;
    public Components() {
        this.driver = DriverSingleton.getDriver();
        faker = new Faker();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(MIN_FIBONACCI_NUMBER));
    }
    public void inputRandomPhoneNumber() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PHONE_NUMPER_LOGIN_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        String randomPassword = faker.numerify("#######");
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
        inputPassword.sendKeys("29" + randomPassword);
        Waiters.waitFor(MIN_FIBONACCI_NUMBER);
    }
    public void inputRandomEmail() {
        String domain = "@gmail.com";
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        Waiters.waitFor(MIN_FIBONACCI_NUMBER);
        inputEmail.sendKeys(faker.name().firstName() + domain);
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
    }
    public void inputRandomLogin() {
        By inputLoginBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputLogin = driver.findElement(inputLoginBy);
        Waiters.waitFor(MIN_FIBONACCI_NUMBER);
        inputLogin.sendKeys(faker.name().firstName());
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
    }
    public void inputCorrectEmail() {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(LoginPageXPath.CORRECT_EMAIL);
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
    }
    public void inputRandomPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_NUMPER_PASSWORD_FROM_EMAIL_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        String randomPassword = faker.numerify("######");
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
        inputPassword.sendKeys(randomPassword);
        Waiters.waitFor(MIN_FIBONACCI_NUMBER);
    }
    public void inputCorrectPassword() {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(LoginPageXPath.CORRECT_PASSWORD);
        Waiters.waitFor(MAX_FIBONACCI_NUMBER);
    }
}
