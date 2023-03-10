package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
public class NavigationTest extends TestBase {

    @Test
    @Feature("Тестирование перехода на подлепру")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Main page", url = "https://leprosorium.ru/")
    @DisplayName("Переход на подлепру")
    void navTest() {
        LoginTest loginTest = new LoginTest();
        loginTest.authorization();
        mainPage
                .openNavigationMenu()
                .openSubSite()
                .headerCheck();
    }
}
