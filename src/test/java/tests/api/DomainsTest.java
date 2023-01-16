package tests.api;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.api.models.LoginData;
import tests.api.models.LoginDataResponse;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class DomainsTest {
    @Test
    @DisplayName("Подлепры, на которые подписан пользователь")
    void checkDomainTest() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        LoginData body = new LoginData();
        body.setUsername(config.username());
        body.setPassword(config.password());

        LoginData response =
                given()
                        .spec(request)
                        .body(body)
                        .when()
                        .post("/auth/login/")
                        .then()
                        .spec(responseSpec)
                        .extract().as(LoginData.class);

        given()
                .spec(request)
                .header("X-Futuware-UID", response.getUid())
                .header("X-Futuware-SID", response.getSid())
                .when()
                .get("/my/domains/subscribed/")
                .then()
                .spec(responseSpec)
                .log().all();
    }
}