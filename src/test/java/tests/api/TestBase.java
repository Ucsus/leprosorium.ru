package tests.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import tests.api.pages.*;

import static helpers.api.CustomApiListener.withCustomTemplates;


public class TestBase {
    static String useRemote = System.getProperty("webHost", "local");
    PostDeletePage postDeletePage = new PostDeletePage();
    IgnorePage ignorePage = new IgnorePage();
    DomainsPage domainsPage = new DomainsPage();
    UserInfoPage userInfoPage = new UserInfoPage();
    InboxPage inboxPage = new InboxPage();
    @BeforeAll
    static void setUp() {
        RestAssured.filters(withCustomTemplates());
    }
}
