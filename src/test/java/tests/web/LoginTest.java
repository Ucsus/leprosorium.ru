package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.web.pages.LoginPage;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    @Feature("Тестирование авторизации с кооректными данными")
    @Story("Тестирование авторизации на сайте")
    @Owner("Ucsus")
    @Severity(SeverityLevel.BLOCKER)
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
