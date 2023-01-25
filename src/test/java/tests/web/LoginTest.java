package tests.web;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
public class LoginTest extends TestBase {
    @BeforeEach
    @Override
    public void addListenerAndStart() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Test
    @Feature("Тестирование авторизации с кооректными данными")
    @Story("Тестирование авторизации на сайте")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Login page", url = "https://leprosorium.ru/login/")
    @DisplayName("Проверка на корректный логин")
    void authorizationTest() {
        loginPage
                .openPage("/login")
                .loginButtonClick()
                .loginFormCheck()
                .authorizationFormFill()
                .authorizationCheck();
    }
}
