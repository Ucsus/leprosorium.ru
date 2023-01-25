package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
public class SearchTest extends TestBase {

    @Test
    @Feature("Тестирование поиска и сравнение с автором")
    @Story("Тестирование поиска")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Search page", url = "https://leprosorium.ru/search/")
    @DisplayName("Проверка поиска")
    void bigSearchTest() {
        searchPage
                .openPage("/search")
                .searchQuery("Масляная рыба")
                .sortByRating()
                .topicStarterCheck("Flynn");
    }
}
