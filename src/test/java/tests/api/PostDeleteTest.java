package tests.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

@Tag("ui")
@Tag("all")
public class PostDeleteTest extends TestBase {
    GetSid getSid = new GetSid();

    @Test
    @Disabled
    @DisplayName("Удаление поста {postId}")
    void deletePostById(){
        String postId = "2480205";
        String deleteResponse
                = given()
                .spec(request)
                .header("X-Futuware-UID", config.uid())
                .header("X-Futuware-SID", getSid.gettingSid())
                .when()
                .delete("/posts/" + postId)
                .then()
                .spec(responseSpec)
                .log().all()
                .extract().asString();
    }
}