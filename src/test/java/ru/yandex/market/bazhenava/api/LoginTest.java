package ru.yandex.market.bazhenava.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import ru.yandex.market.bazhenava.pages.login.LoginRequest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    public void testGetResponseStatusCode500() {
        RestAssured
                .when()
                .get(LoginRequest.GET_LOGIN_URL)
                .then()
                .statusCode(500).log().body();
    }

    @Test
    public void testLoginApi1() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody())
                .when().post(LoginRequest.LOGIN_URL)
                .then().statusCode(403);
    }

    @Test
    public void testLoginApi2() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody("Nadja", "159753!"))
                .when().post(LoginRequest.LOGIN_URL)
                .then().statusCode(403)
                .body("check_for_xtokens_for_pictures", equalTo(null))
                .headers("Content-Type", "application/json; charset=utf-8");
    }

    @Test
    public void testLoginApi3() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody("ArnestS@yandex.ru", "4697Vaa"))
                .when().post(LoginRequest.LOGIN_URL_ACCOUNT_ENTER)
                .then().statusCode(200)
                .body("accounts.loginForLogoId", equalTo(null))
                .body("is_completion_required", equalTo(null))
                .headers("Content-Type", equalTo("application/json; charset=utf-8"));
    }

    @Test
    public void testGLoginApi4() {
        given().headers(LoginRequest.getHeaders()).body(LoginRequest.getBody("KRoL", "ojnxj#5"))
                .when().post(LoginRequest.CHEK_REGISTRATION_URL)
                .then().statusCode(404)
                .body("is_completion_recommended", equalTo(null))
                .body("is_completion_required", equalTo(null))
                .headers("Content-Type", equalTo("application/json; charset=utf-8"));
    }

    @Test
    public void testGLoginApi5() {
        RestAssured
                .when()
                .get(LoginRequest.CHEK_REGISTRATION_URL)
                .then()
                .statusCode(200)
                .body("is_completion_recommended", equalTo(false))
                .body("is_completion_required", equalTo(false));
    }
}
