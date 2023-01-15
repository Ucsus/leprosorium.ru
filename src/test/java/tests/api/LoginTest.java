package tests.api;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import tests.api.models.LoginData;
import tests.api.models.LoginDataResponse;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static helpers.CustomApiListener.withCustomTemplates;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static tests.api.specs.LoginSpecs.loginRequest;
import static tests.api.specs.LoginSpecs.loginResponseSpec;

public class LoginTest {
    String uid = "9278845";
    String sid = "a8df4360a66d7451dbff297b1bc387";
    @Test
    void loginWithCookie() {
        String authCookieName = "92788",
                authCookieValue = "45a8df4360a66d7451dbff297b1bc387";
        given()
                .spec(loginRequest)
                .cookie(authCookieName, authCookieValue)
                .when()
                .post("/auth/login/")
                .then()
                .spec(loginResponseSpec)
                .extract().as(LoginDataResponse.class);

        open("https://leprosorium.ru/static/i/lepra/lepro_logo_mask.png");
        Cookie authCookie = new Cookie(authCookieName, authCookieValue);
        getWebDriver().manage().addCookie(authCookie);
        open();
    }

    @Test
    void loginPass() {

        LoginDataResponse response =
                given()
                        .contentType(ContentType.JSON)
                        .body("{ \"username\": \"qaguru\", \"password\": \"TovarischiHakeryNeVoruiteMoiParol'Plz\" }")
                        .log().all()
                        .when()
                        .post("https://leprosorium.ru/api/auth/login/")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .extract().as(LoginDataResponse.class);

        given()
                .spec(loginRequest)
//                .cookie(response.getUid(), response.getSid())
                .header("X-Futuware-UID", uid)
                .header("X-Futuware-SID", sid)
                .cookie(uid + sid)
                .when()
                .get("https://leprosorium.ru/api/my/")
                .then()
                .spec(loginResponseSpec)
                .extract();

        open("https://leprosorium.ru/static/i/lepra/lepro_logo_mask.png");
        Cookie authCookie = new Cookie(response.getUid(), response.getSid());
        getWebDriver().manage().addCookie(authCookie);
        open();
    }
}


//
//    {
//        "status": "OK",
//            "csrf_token": "YWQzODJkNTJmYjVlMTJkYTVhZDE1ZjliYjhmYWVjYjlhNDdkYzg4ZTNmNWVjZDdmMmZjMWI1NTczNTk1MDRiYQ==",
//            "is_citizen": true,
//            "user": {
//                "city": null,
//                "ignored": null,
//                "bans": null,
//                "subscribed": null,
//                "rating": null,
//                "deleted": 0,
//                "gender": "male",
//                "subscribers_count": null,
//                "few_words": null,
//                "rank": null,
//                "wiki_groups": null,
//                "karma": 0,
//                "country": null,
//                "ban": null,
//                "login": "qaguru",
//                "active": 1,
//                "id": 92788
//    }

