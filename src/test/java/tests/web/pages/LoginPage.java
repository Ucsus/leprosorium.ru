package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import drivers.web.BrowserWebDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    String username = BrowserWebDriver.config.username();
    String password = BrowserWebDriver.config.password();

    public final SelenideElement
            loginButton = $(".b-login_navigation_auth"),
            loginForm = $("#js-auth_form"),
            user = $("#js-auth_username"),
            pass = $("#js-auth_password"),
            yarrr = $("#js-auth_form_submit"),
            rememberMe = $(byText("Запомните меня!")),
            rememberIp = $(byText("Запомните мой ip-адрес!")),
            logout = $("#js-header_logout_link");

    @Step("Открываем страницу авторизации: {pageUrl}")
    public LoginPage openPage(String pageUrl) {
        open(pageUrl);
        return this;
    }

    @Step("Вызываем форму авторизации")
    public LoginPage loginButtonClick() {
        loginButton.click();
        return this;
    }

    @Step("Проверяем видимость формы авторизации")
    public LoginPage loginFormCheck() {
        loginForm.shouldHave(Condition.visible);
        return this;
    }

    @Step("Авторизация")
    public LoginPage authorizationFormFill() {
        user.sendKeys(username);
        pass.setValue(password).pressEnter();
        yarrr.click();
        return this;
    }

    @Step("Проверка авторизации")
    public LoginPage authorizationCheck() {
        logout.shouldHave(Condition.text("logout"));
        return this;
    }
    @Step("Выход из профиля")
    public LoginPage logout() {
        logout.click();
        return this;
    }
}
