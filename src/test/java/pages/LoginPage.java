package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.AuthConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public final SelenideElement
    loginButton = $(".b-login_navigation_auth"),
    loginForm =  $("#js-auth_form"),
    username = $("#js-auth_username"),
    password = $("#js-auth_password"),
    navigationMenu = $("#js-navthing");

    @Step("Open main page")
    public LoginPage openPage() {
        open("/login/");
        return this;
    }

    @Step("Login button click")
    public LoginPage loginButtonClick() {
        loginButton.click();
        return this;
    }

    @Step("Check login form")
    public LoginPage loginFormCheck() {
        loginForm.shouldHave(Condition.visible);
        return this;
    }

    @Step("Authorization")
    public LoginPage authorizationFormFill() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        username.setValue(config.username());
        password.setValue(config.password()).pressEnter();
        return this;
    }
}
