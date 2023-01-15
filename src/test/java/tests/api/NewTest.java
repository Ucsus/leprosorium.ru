package tests.api;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.yaml.snakeyaml.reader.StreamReader;
import tests.api.models.LoginData;
import tests.api.models.LoginDataResponse;

import java.io.Console;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static helpers.CustomApiListener.withCustomTemplates;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.sessionId;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;
import static tests.api.specs.LoginSpecs.loginRequest;
import static tests.api.specs.LoginSpecs.loginResponseSpec;

public class NewTest {
    @Test
    @DisplayName("Check authorization with login/password")
    void loginLombokModelTest() {
        LoginData body = new LoginData();
        body.setUsername("qaguru");
        body.setPassword("TovarischiHakeryNeVoruiteMoiParol'Plz");

        LoginDataResponse response =
                given()
                        .spec(loginRequest)
                        .body(body)
                        .header("X-Futuware-UID", "9278845")
                        .header("X-Futuware-SID", "a8df4360a66d7451dbff297b1bc387")
                        .when()
                        .post("/auth/login/")
                        .then()
                        .spec(loginResponseSpec)
                        .extract().as(LoginDataResponse.class);

        given()
                .spec(loginRequest)
                .header("X-Futuware-UID", "9278845")
                .header("X-Futuware-SID", "a8df4360a66d7451dbff297b1bc387")
                .when()
                .get("/my/domains/subscribed/")
                .then()
                .spec(loginResponseSpec)
                .log().all();

        open("https://leprosorium.ru/static/i/lepra/lepro_logo_mask.png");
        Cookie authCookie = new Cookie(response.getUid(), response.getSid());
        getWebDriver().manage().addCookie(authCookie);
        open("https://leprosorium.ru/main/");
        sleep(20000);
//
//        assertThat(response.getId()).isNotNull();
//        assertThat(response.getType()).isEqualTo("Token");
    }

//    private static String GetJson(String uri)
//    {
//        System.out.println("Getting json: " + uri);
//        HttpWebRequest request = (HttpWebRequest)WebRequest.Create(uri);
//        request.Headers["X-Futuware-UID"] = UID;
//        request.Headers["X-Futuware-SID"] = SID;
//        request.AutomaticDecompression = DecompressionMethods.GZip;
//        using (HttpWebResponse response = (HttpWebResponse)request.GetResponse())
//        using (Stream stream = response.GetResponseStream())
//        using (StreamReader reader = new StreamReader(stream))
//        {
//            String json = StreamReader.ReadToEnd();
//            return json;
//        }
//    }


//    private static void SignIn() {
//        connected = false;
//        userFound = false;
//        Console.WriteLine("Connecting to https://leprosorium.ru/api/auth/login/");
//        var httpWebRequest = ((HttpWebRequest)(WebRequest.Create("https://d3.ru/api/auth/login/")));
//        httpWebRequest.ContentType = "application/json";
//        httpWebRequest.Method = "POST";
//        var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream());
//        string json = "{\"username\":\"\" + username + ";
//        ("," + "\"password\":\"\" + password + ");
//        "}";
//        streamWriter.Write(json);
//        streamWriter.Flush();
//        streamWriter.Close();
//        var httpResponse = ((HttpWebResponse)(httpWebRequest.GetResponse()));
//        var streamReader = new StreamReader(httpResponse.GetResponseStream());
//        string result = streamReader.ReadToEnd();
//        dynamic jsonRespond = JsonConvert.DeserializeObject(result);
//        UID = jsonRespond.uid;
//        SID = jsonRespond.sid;
//        Console.WriteLine("Connected");
//    }
}
