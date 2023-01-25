package tests.api;

import config.api.ApiConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import static helpers.api.CustomApiListener.withCustomTemplates;


public class TestBase {
    static String useRemote = System.getProperty("webHost", "remote");
    static ApiConfig config = ConfigFactory.create(ApiConfig.class);

    @BeforeAll
    static void setUp() {
                RestAssured.filters(withCustomTemplates());
    }

}
