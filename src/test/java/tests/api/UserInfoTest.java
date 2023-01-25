package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.api.models.UserInfo;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

@Tag("ui")
@Tag("all")
public class UserInfoTest extends TestBase {
    GetSid getSid = new GetSid();

    @Test
    @DisplayName("Получить текущего пользователя")
    void checkUserInfoTest() {
        UserInfo userInfo =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", getSid.gettingSid())
                        .when()
                        .get("/my/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(UserInfo.class);

        assertThat(userInfo.getLogin()).isEqualTo("qaguru");
        assertThat(userInfo.getId()).isEqualTo(92788);
        assertThat(userInfo.getDeleted()).isEqualTo(false);
    }
}