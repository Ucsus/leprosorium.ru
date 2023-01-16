package tests.mobile;

import org.junit.jupiter.api.Test;
import tests.mobile.pages.SearchPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchTest extends TestBase {
    SearchPage searchPage = new SearchPage();

    @Test
    void searchPostTest() {
        searchPage
                .openMenu()
                .searchQuery("Ванна пенопласта");
        sleep(10000);
    }
}
