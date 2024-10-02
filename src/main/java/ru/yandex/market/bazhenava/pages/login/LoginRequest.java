package ru.yandex.market.bazhenava.pages.login;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String LOGIN_URL = "https://passport.yandex.ru/registration-validations/auth/multi_step/commit_password";
    public static final String GET_LOGIN_URL = "https://mail.yandex.ru/api/v2/userid/counters?silent";
    public static final String LOGIN_URL_ACCOUNT_ENTER = "https://passport.yandex.ru/registration-validations/auth/accounts";
    public static final String CHEK_REGISTRATION_URL = "https://api.passport.yandex.ru/registration_status/check";

    public static String getBody() {
        return "{\"login\":\"\".\"password\":\"\"}";
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return headers;
    }

    public static String getBody(String login, String password) {
        return "{\"login\":\"" + login + "\".\"password\":\"" + password + "\"}";
    }
}
