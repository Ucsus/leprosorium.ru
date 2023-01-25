package tests.api;

import io.restassured.response.Response;
import tests.api.models.LoginData;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class GetSid extends TestBase {
    public Object gettingSid() {
        LoginData loginData = new LoginData();
        loginData.setUsername(config.username());
        loginData.setPassword(config.password());
        Response response =
                given()
                        .spec(request)
                        .body(loginData)
                        .when()
                        .post("/auth/login/")
                        .then()
                        .spec(responseSpec)
                        .extract().response();
        String sid = response.path("sid");
        return sid;
    }
}
