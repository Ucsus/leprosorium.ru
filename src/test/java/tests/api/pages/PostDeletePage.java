package tests.api.pages;

import config.api.ApiConfig;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import tests.api.models.LoginData;
import tests.api.models.LoginResponse;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class PostDeletePage {
    public PostDeletePage deletePost(String postId) {
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

        ExtractableResponse<Response> delete
                = given()
                .spec(request)
                .header("X-Futuware-UID", config.uid())
                .header("X-Futuware-SID", response.getSid())
                .when()
                .delete("/posts/" + postId)
                .then()
                .spec(responseSpec)
                .log().all()
                .extract();
        return this;
    }
}
