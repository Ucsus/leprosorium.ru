package tests.web;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import tests.web.pages.MainPage;
import tests.TestBase;

public class NavigationTest extends TestBase {
    private final MainPage mainPage = new MainPage();

    @Test
    @Disabled
    void navTest() {
        mainPage.
                openNavigationMenu().
                openSubSite();
    }
}
