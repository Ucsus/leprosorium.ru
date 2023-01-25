package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.api.models.Ignore;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

@Tag("ui")
@Tag("all")
public class IgnoreUserTest extends TestBase {
    GetSid getSid = new GetSid();

    @Test
    @DisplayName("Начать игнорировать пользователя")
    void userIgnoreTest() {
        Ignore ignoreResponse = given()
                .spec(request)
                .header("X-Futuware-UID", config.uid())
                .header("X-Futuware-SID", getSid.gettingSid())
                .when()
                .post("/users/Ucsus/ignore/")
                .then()
                .spec(responseSpec)
                .log().all()
                .extract().as(Ignore.class);
    }

    @Test
    @DisplayName("Перестать игнорировать пользователя")
    void userRemoveIgnoreTest() {
        Ignore removeIgnoreResponse =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", getSid.gettingSid())
                        .when()
                        .delete("/users/Ucsus/ignore/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(Ignore.class);
    }
}
