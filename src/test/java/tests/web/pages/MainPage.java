package tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public final SelenideElement
            navigationMenu = $("#js-navthing"),
            subSite = $(".b-navthing_tab_both_link");

    @Step("Open navigation menu")
    public MainPage openNavigationMenu() {
        navigationMenu.click();
        return this;
    }

    @Step("Go to qaguru.leprosorium.ru")
    public MainPage openSubSite() {
        subSite.click();
        return this;
    }
}
