package tests.api.specs;

import config.api.ApiConfig;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;

import static helpers.api.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;

public class Specs {
    static ApiConfig config = ConfigFactory.create(ApiConfig.class);

    public static RequestSpecification request = with()
            .filter(withCustomTemplates())
            .baseUri(config.baseUrl())
            .basePath(config.basePath())
            .log().all()
            .contentType(ContentType.JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .expectStatusCode(200)
            .build();
}
