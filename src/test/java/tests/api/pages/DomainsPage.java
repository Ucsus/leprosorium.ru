package tests.api.pages;

import config.api.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import tests.api.models.Domain;
import tests.api.models.LoginData;
import tests.api.models.LoginResponse;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

public class DomainsPage {
    public DomainsPage checkDomainsTest() {
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

        Domain domainResponse =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", response.getSid())
                        .when()
                        .get("/users/qaguru/domains/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(Domain.class);

        assertThat(domainResponse.getDomains().get(0).getIdna_url()).isEqualTo("https://qaguru.leprosorium.ru");
        return this;
    }
}
