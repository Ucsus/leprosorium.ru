package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NavigationTest extends TestBase {

    @Tag("WEB")
    @Test
    @DisplayName("Переход на подлепру")
    void navTest() {
        mainPage
                .openNavigationMenu()
                .openSubSite()
                .headerCheck();
    }
}
