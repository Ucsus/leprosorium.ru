package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("mobile")
@Tag("all")
public class SearchTest extends TestBase {

    @Test
    @DisplayName("Проверка поиска")
    void searchPostTest() {
        loginPage
                .authorizationFormFill();
        searchPage
                .openMenu()
                .searchQuery("Ванна пенопласта");
        sleep(1000);
    }
}
