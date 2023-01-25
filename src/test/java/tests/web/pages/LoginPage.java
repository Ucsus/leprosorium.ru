package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import drivers.web.BrowserSetup;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    String username = BrowserSetup.config.username();
    String password = BrowserSetup.config.password();

    public final SelenideElement
            loginButton = $(".b-login_navigation_auth"),
            loginForm = $("#js-auth_form"),
            user = $("#js-auth_username"),
            pass = $("#js-auth_password"),
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
        user.setValue(username);
        pass.setValue(password).pressEnter();
        return this;
    }

    @Step("Проверка авторизации")
    public LoginPage authorizationCheck() {
        logout.shouldHave(Condition.text("logout"));
        return this;
    }
}
