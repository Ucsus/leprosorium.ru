package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.web.pages.SearchPage;
import tests.TestBase;

public class NavigationTest extends TestBase {
    private final SearchPage searchPage = new SearchPage();

    @Test
    @DisplayName("Переход на подлепру")
    void navTest() {
        searchPage.
                openNavigationMenu().
                openSubSite();
    }
}
