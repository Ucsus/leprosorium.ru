package tests.api.pages;

import config.api.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import tests.api.models.LoginData;
import tests.api.models.LoginResponse;
import tests.api.models.UserInfo;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class UserInfoPage {
    public UserInfoPage getUserInfoTest() {
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

        UserInfo userInfo =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", response.getSid())
                        .when()
                        .get("/my/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(UserInfo.class);

        assertThat(userInfo.getLogin()).isEqualTo("qaguru");
        assertThat(userInfo.getId()).isEqualTo(92788);
        assertThat(userInfo.getDeleted()).isEqualTo(false);

        return this;
    }
}
