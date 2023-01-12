package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.web.pages.MainPage;
import tests.TestBase;

public class NavigationTest extends TestBase {
    private final MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Переход на подлепру")
    void navTest() {
        mainPage
                .openNavigationMenu()
                .openSubSite()
                .headerCheck();
    }
}
