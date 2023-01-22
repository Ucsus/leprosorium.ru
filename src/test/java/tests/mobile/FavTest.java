package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("mobile")
@Tag("all")
public class FavTest extends TestBase {

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
