package tests.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import tests.api.models.LoginData;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class LoginSpecs {
    public static RequestSpecification loginRequest = with()
            .baseUri("https://leprosorium.ru")
            .basePath("/api")
//            .body("{ \"username\": \"qaguru\", \"password\": \"TovarischiHakeryNeVoruiteMoiParol'Plz\" }")
            .log().all()
            .contentType(ContentType.JSON);

    public static ResponseSpecification loginResponseSpec = new ResponseSpecBuilder()
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .expectStatusCode(200)
            .build();
}
