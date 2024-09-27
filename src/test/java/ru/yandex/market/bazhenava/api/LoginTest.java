package ru.yandex.market.bazhenava.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    public void testGetResponseStatusCode500() {
        RestAssured
                .when()
                .get("https://mail.yandex.ru/api/v2/userid/counters?silent")
                .then()
                .statusCode(500).log().body();
    }


    @Test
    public void testGetLogin2() {
        RestAssured
                .when()
                .post(" https://passport.yandex.ru/registration-validations/auth/multi_step/start")
                .then()
                .statusCode(403).log().body();
    }
    @Test
    public void testGetLogin3() {
        RestAssured
                .when()
                .get("https://api.passport.yandex.ru/registration_status/check")
                .then()
                .statusCode(200).log().body()
                .body("is_completion_recommended", equalTo(false))
                .body("is_completion_required", equalTo(false));
    }

    @Test
    public void testPostLogin() {
        RestAssured
                .when()
                .post("https://passport.yandex.ru/registration-validations/auth/accounts")
                .then()
                .statusCode(200).log().body()
                .body("accounts.loginForLogoId", equalTo(null))
                .body("accounts.isQRAuthEnabled", equalTo(true));
    }

    @Test
    public void testPostLogin403() {
        RestAssured
                .when()
                .post("https://passport.yandex.ru/registration-validations/auth/multi_step/start")
                .then()
                .statusCode(403);
    }

    @Test
    public void testPostLogin2() {
        RestAssured
                .when()
                .post("https://passport.yandex.ru/registration-validations/auth/multi_step/commit_password")
                .then()
                .statusCode(403);
    }
}
