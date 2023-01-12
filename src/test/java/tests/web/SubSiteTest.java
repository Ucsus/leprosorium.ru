package tests.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.web.pages.MainPage;

public class SubSiteTest extends TestBase {
    private final MainPage mainPage = new MainPage();
    @BeforeEach
    void openSubSite() {mainPage.openNavigationMenu().openSubSite();}

    @Test
    @DisplayName("Проверка ДискоЧата")
    void discoChatTest() {
        mainPage
                .openDiscoChat()
                .writeMessage("Hello, world!")
                .closeDiscoChat();
    }

    @Test
    @DisplayName("Проверка постинга")
    void subSitePostTest() {
        mainPage
                .writePost()
                .checkPost();
    }

    @Test
    @DisplayName("Удаление верхнего поста")
    void postModerate() {
        mainPage
                .deleteFirstPost()
                .checkPostDelete();
    }

}