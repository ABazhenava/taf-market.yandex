package ru.yandex.market.bazhenava.pages.login;

public class LoginPageXPath {

    public static final String INPUT_EMAIL_XPATH = "//div[@class='passp-login-form']/form/div/div[2]/div[2]/div/div/span/input";
    public static final String INPUT_PASSWORD_XPATH = "//input[@id='passp-field-phoneCode']";
            //"//div[@class='passp-route-forward']/div/div/form/div/div[2]/div[2]/div/span/input";
            //"//div[@class='passp-route-forward']/div/div/form/div/div/div/span/input";
    public static final String CORRECT_PASSWORD = "Asdf#12369874";
    public static final String CORRECT_EMAIL = "aksana.bazhenava@gmail.com";
    public static final String BUTTON_ENTER_XPATH = "//button[@id='passp:sign-in']";//кнопка входа логин
    public static final String EMPTY_EMAIL_ENTER_XPATH = "//div[@id='field:input-login:hint']";
    public static final String BUTTON_ENTER_PHONE_XPATH = "//div[@class='layout_content']/div/div[2]/button";
    public static final String EMPTY_PHONE_ENTER_XPATH =
            "//div[@class='IntPhoneInput IntPhoneInput_view_contrast IntPhoneInput_isFilled']/div[2]";
    public static final String ERROR_EMAIL_XPATH = "//div[@id='field:input-login:hint']";
    public static final String BUTTON_LOGIN_CONTINUE = "//button[@id='passp:sign-in']";
            //input[@id=\"passp-field-passwd\"]";
            //"//div[@class='passp-button passp-lite-button']/button[1]";
    public static final String ERROR_PASSWORD_XPATH = "//div[@id='field:input-passwd:hint']";
    public static final String SEND_CODE_AGAINE = "//div[@class='passp-button passp-lite-button']/button[2]";
    public static final String BUTTON_LOGIN_NOT_YET = "//div[@class='WebauthnPromoRegPage-content']/div[5]/button";
}
