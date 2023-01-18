package tests.api.pages;

import config.api.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import tests.api.models.Inbox;
import tests.api.models.LoginData;
import tests.api.models.LoginResponse;

import static io.restassured.RestAssured.given;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class InboxPage {
   public InboxPage checkWriteInboxComment(String commentText) {
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

        Inbox newComment = new Inbox();
        newComment.setBody(commentText);
        Inbox inbox =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", response.getSid())
                        .when()
                        .body(newComment)
                        .post("/inbox/2479510/comments/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(Inbox.class);
        return this;
    }
}
