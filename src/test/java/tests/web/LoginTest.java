package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Tag("web")
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
