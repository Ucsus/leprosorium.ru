package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {

    @Tag("web")
    @Tag("all")
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
