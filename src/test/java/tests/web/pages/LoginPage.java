package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.AuthConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public final SelenideElement
            loginButton = $(".b-login_navigation_auth"),
            loginForm = $("#js-auth_form"),
            username = $("#js-auth_username"),
            password = $("#js-auth_password"),
            logout = $("#js-header_logout_link");

    @Step("Открываем главную страницу")
    public LoginPage openPage() {
        open("/login/");
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
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        username.setValue(config.username());
        password.setValue(config.password()).pressEnter();
        return this;
    }

    @Step("Проверка авторизации")
    public LoginPage authorizationCheck() {
        logout.shouldHave(Condition.text("logout"));
        return this;
    }
}
