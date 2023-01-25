package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
public class SubSiteTest extends TestBase {

    @BeforeEach
    void openSubSite() {
        mainPage.openNavigationMenu().openSubSite();
    }

    @Test
    @Feature("Тестирование откртыия формы чата и отправка сообщения")
    @Story("Тестирование чата")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Login page", url = "https://leprosorium.ru/login/")
    @DisplayName("Проверка ДискоЧата")
    void discoChatTest() {
        mainPage
                .openDiscoChat()
                .writeMessage("Hello, world!")
                .closeDiscoChat();
    }

    @Test
    @Feature("Тестирование написания нового поста на подлепре")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Qaguru page", url = "https://qaguru.leprosorium.ru/")
    @DisplayName("Проверка постинга")
    void subSitePostTest() {
        mainPage
                .writePost()
                .checkPost();
    }

    @Test
    @Feature("Тестирование удаления первого поста на подлепре")
    @Story("Тестирование удаления поста")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Login page", url = "https://leprosorium.ru/login/")
    @DisplayName("Удаление верхнего поста")
    void postModerate() {
        mainPage
                .deleteFirstPost()
                .checkPostDelete();
    }

}
