package tests.api;

import helpers.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.api.models.Inbox;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

@Tag("ui")
@Tag("all")
public class InboxCommentTest extends TestBase {
    GetSid getSid = new GetSid();

    @Test
    @DisplayName("Новый комментарий в инбокс")
    void checkInboxComment() {
        Inbox body = new Inbox();
        String comment = TestData.newPost;
        body.setBody(comment);
        String inboxResponse =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", getSid.gettingSid())
                        .body(body)
                        .when()
                        .post("/inbox/2479510/comments/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().path("body");
        assertThat(inboxResponse).isEqualTo(comment);
    }
}
