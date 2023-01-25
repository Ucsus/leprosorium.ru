package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
@Feature("Тестирование поиска и сравнение с автором")
public class SearchTest extends TestBase {

    @Test
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Search page", url = "https://leprosorium.ru/search/")
    @DisplayName("Проверка поиска")
    void bigSearchTest() {
        LoginTest loginTest = new LoginTest();
        loginTest.authorization();
        searchPage
                .openPage()
                .searchQuery("Масляная рыба")
                .sortByRating()
                .topicStarterCheck("Flynn");
    }
}
