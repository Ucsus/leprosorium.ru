package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.web.pages.MainPage;

public class SubSiteTest extends TestBase {
    private final MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка ДискоЧата")
    void discoChatTest() {
        mainPage
                .openNavigationMenu()
                .openSubSite()
                .openDiscoChat()
                .writeMessage("Hello, world!")
                .closeDiscoChat();
    }

    @Test
    @DisplayName("Проверка постинга")
    void subSitePostTest() throws Exception {
        mainPage
                .openNavigationMenu()
                .openSubSite()
                .writePost()
                .checkPost();

    }
}
