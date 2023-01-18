package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FavTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    void favouriteTest() {
        loginPage
                .authorizationFormFill();
        favPage
                .openMenu()
                .titleCheck()
                .favPostCheck();
    }
}
