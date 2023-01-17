package tests.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SubSiteTest extends TestBase {

    @BeforeEach
    void openSubSite() {
        mainPage.openNavigationMenu().openSubSite();
    }

    @Tag("WEB")
    @Test
    @DisplayName("Проверка ДискоЧата")
    void discoChatTest() {
        mainPage
                .openDiscoChat()
                .writeMessage("Hello, world!")
                .closeDiscoChat();
    }

    @Tag("WEB")
    @Test
    @DisplayName("Проверка постинга")
    void subSitePostTest() {
        mainPage
                .writePost()
                .checkPost();
    }

    @Tag("WEB")
    @Test
    @DisplayName("Удаление верхнего поста")
    void postModerate() {
        mainPage
                .deleteFirstPost()
                .checkPostDelete();
    }

}
