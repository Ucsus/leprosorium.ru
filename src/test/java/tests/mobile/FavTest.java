package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FavTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка наличия поста в Избранном")
    void favouriteTest() {
        loginPage
                .authorizationFormFill();
        favPage
                .openMenu()
                .titleCheck()
                .favPostCheck();
    }
}
