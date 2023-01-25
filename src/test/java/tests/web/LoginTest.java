package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
@Tag("all")
public class LoginTest extends TestBase {

    @Test
    @Feature("Тестирование авторизации с кооректными данными")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Login page", url = "https://leprosorium.ru/login/")
    @DisplayName("Проверка на корректный логин")
    void authorization() {
        loginPage
                .openPage("/login")
                .loginButtonClick()
                .loginFormCheck()
                .authorizationFormFill()
                .authorizationCheck();
    }
}
