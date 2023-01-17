package tests.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static helpers.api.CustomApiListener.withCustomTemplates;


public class TestBase {

    @BeforeAll
    static void setUp() {
        RestAssured.filters(withCustomTemplates());
    }
}
