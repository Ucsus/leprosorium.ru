package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FavTest extends TestBase {

    @Tag("mobile")
    @Test
    void favouriteTest() {
        favPage
                .openMenu()
                .titleCheck()
                .favPostCheck();
    }
}
