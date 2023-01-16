package tests.mobile;

import org.junit.jupiter.api.Test;
import tests.mobile.pages.FavPage;

public class FavTest extends TestBase {
    FavPage favPage = new FavPage();

    @Test
    void favouriteTest() {
        favPage
                .openMenu()
                .titleCheck()
                .favPostCheck();
    }
}
