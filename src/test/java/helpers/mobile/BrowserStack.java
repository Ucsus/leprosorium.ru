package helpers.mobile;

import config.mobile.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class BrowserStack {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);

    public static String mobileVideoUrl(String sessionId) {
        return given()
                .auth().basic(config.user(), config.key())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}