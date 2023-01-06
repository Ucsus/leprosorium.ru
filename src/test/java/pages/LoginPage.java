package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public final SelenideElement
    loginButton = $(".b-login_navigation_auth"),
    loginForm =  $("#js-auth_form"),
    username = $("#js-auth_username"),
    password = $("#js-auth_password"),
    navigationMenu = $("#js-navthing");

    public LoginPage openPage() {
        open("/login/");
        return this;
    }

}
