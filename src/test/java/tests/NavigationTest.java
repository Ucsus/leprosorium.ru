package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class NavigationTest extends TestBase {
    private final MainPage mainPage = new MainPage();

    @Test
    void navTest() {
        mainPage.
                openNavigationMenu().
                openSubSite();
    }
}
