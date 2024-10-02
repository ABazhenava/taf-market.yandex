package ru.yandex.market.bazhenava.pages.login;

public class LoginPageXPath {
    public static final String INPUT_EMAIL_XPATH = "//div[@class='passp-login-form']/form/div/div[2]/div[2]/div/div/span/input";
    public static final String INPUT_PASSWORD_XPATH = "//input[@name='passwd']";
    public static final String CORRECT_PASSWORD = "Asdf#12369874";
    public static final String CORRECT_EMAIL = "aksana.bazhenava@gmail.com";
    public static final String BUTTON_ENTER_XPATH = "//button[@id='passp:sign-in']";
    public static final String EMPTY_EMAIL_ENTER_XPATH = "//div[@id='field:input-login:hint']";
    public static final String BUTTON_ENTER_PHONE_XPATH = "//div[@class='layout_content']/div/div[2]/button";
    public static final String EMPTY_PHONE_ENTER_XPATH =
            "//div[@class='IntPhoneInput IntPhoneInput_view_contrast IntPhoneInput_isFilled']/div[2]";
    public static final String ERROR_PASSWORD_AFTER_RONG_LOGIN_XPATH = "//div[@id='field:input-passwd:hint']";
    public static final String BUTTON_LOGIN_CONTINUE = "//button[@id='passp:sign-in']";
    public static final String ERROR_PASSWORD_XPATH = "//div[@id='field:input-passwd:hint']";
    public static final String FROM_THE_PICTURE_WORDS = "Введите фразу с картинки";
    public static final String INPUT_NUMPER_PASSWORD_FROM_EMAIL_XPATH = "//div[@class='Field-inputWrapper']/span/input";
    public static final String INPUT_PHONE_NUMPER_LOGIN_XPATH= "//input[@id='passp-field-phone']";
    public static final String SEND_CODE_AGAINE_XPATHE = "//div[@class='passp-button passp-lite-button']/button[2]";
    public static final String ENTER_PHRASE_FROM_THE_PICTURE = "//div[@class='CaptchaScreen-head']";
    public static final String NO_LOGIN = "Логин не указан";
    public static final String BAD_FORMAT_PHONE_NUMBER = "Недопустимый формат номера";
    public static final String INCORRECT_PASSWORD = "Неверный пароль";
    public static final String SEND_CODE_EGAINE = "Отправить код повторно";
}
