package tests.api;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import tests.api.models.LoginData;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;
import static tests.api.specs.LoginSpecs.loginRequest;
import static tests.api.specs.LoginSpecs.loginResponseSpec;

public class WORKING {
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
                .extract().as(LoginData.class);

        open("https://leprosorium.ru/static/i/lepra/lepro_logo_mask.png");
        Cookie authCookie = new Cookie(authCookieName, authCookieValue);
        WebDriverRunner.getWebDriver().manage().addCookie(authCookie);
        open();
    }
}
