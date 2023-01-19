package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка поиска")
    void searchPostTest() {
        loginPage
                .authorizationFormFill();
        searchPage
                .openMenu()
                .searchQuery("Ванна пенопласта");
        sleep(10000);
    }
}
