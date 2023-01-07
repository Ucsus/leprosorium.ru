package tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationTest extends TestBase{
    private final LoginPage loginPage = new LoginPage();
    @Test
    void navTest() {
        step("Navigation", () -> {
            loginPage.navigationMenu.click();
        });
        step("Go to qaguru.leprosorium.ru", () -> {
            $(".b-navthing_tab_both_link").click();
        });
    }
}
