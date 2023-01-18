package tests.api.pages;

import config.api.ApiConfig;
import io.restassured.response.ValidatableResponse;
import org.aeonbits.owner.ConfigFactory;
import tests.api.models.Ignore;
import tests.api.models.LoginData;
import tests.api.models.LoginResponse;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class IgnorePage {
    public IgnorePage addUserIgnore() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        LoginData body = new LoginData();
        body.setUsername(config.username());
        body.setPassword(config.password());

        LoginResponse response =
                given()
                        .spec(request)
                        .body(body)
                        .when()
                        .post("/auth/login/")
                        .then()
                        .spec(responseSpec)
                        .extract().as(LoginResponse.class);

        ValidatableResponse ignoreUser = given()
                .spec(request)
                .header("X-Futuware-UID", config.uid())
                .header("X-Futuware-SID", response.getSid())
                .when()
                .post("/users/Ucsus/ignore/")
                .then()
                .spec(responseSpec)
                .log().all();
        return this;
    }

    public IgnorePage removeUserIgnore() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        LoginData body = new LoginData();
        body.setUsername(config.username());
        body.setPassword(config.password());

        LoginResponse response =
                given()
                        .spec(request)
                        .body(body)
                        .when()
                        .post("/auth/login/")
                        .then()
                        .spec(responseSpec)
                        .extract().as(LoginResponse.class);

        Ignore removeIgnoreUser =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", response.getSid())
                        .when()
                        .delete("/users/Ucsus/ignore/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(Ignore.class);
        return this;
    }
}
