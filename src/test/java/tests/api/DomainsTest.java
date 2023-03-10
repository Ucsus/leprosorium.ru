package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.api.models.Domain;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.api.specs.Specs.request;
import static tests.api.specs.Specs.responseSpec;

@Tag("ui")
@Tag("all")
public class DomainsTest extends TestBase {
    GetSid getSid = new GetSid();

    @Test
    @DisplayName("Проверка подписанных подлепр")
    void checkDomainsTest() {
        Domain domainResponse =
                given()
                        .spec(request)
                        .header("X-Futuware-UID", config.uid())
                        .header("X-Futuware-SID", getSid.gettingSid())
                        .when()
                        .get("/users/qaguru/domains/")
                        .then()
                        .spec(responseSpec)
                        .log().all()
                        .extract().as(Domain.class);

        assertThat(domainResponse.getDomains().get(0).getIdna_url()).isEqualTo("https://qaguru.leprosorium.ru");
    }
}
