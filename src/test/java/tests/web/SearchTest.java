package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.web.pages.SearchPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchTest extends TestBase {
    SearchPage searchPage = new SearchPage();

    @Test
    @DisplayName("Проверка поиска")
    void bigSearchTest() {
        searchPage
                .openPage("/search")
                .searchQuery("Масляная рыба")
                .sortByRating()
                .topicStarterCheck("Flynn");

    }
}
