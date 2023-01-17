package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchTest extends TestBase {

    @Tag("mobile")
    @Test
    void searchPostTest() {
        searchPage
                .openMenu()
                .searchQuery("Ванна пенопласта");
        sleep(10000);
    }
}
