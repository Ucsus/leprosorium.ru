package tests.mobile.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FavPage {
    public final SelenideElement
            menuButton = $(AppiumBy.className("android.widget.ImageButton")),
            favLink = $(AppiumBy.className("android.support.v7.widget.LinearLayoutCompat"), 3),
            title = $(AppiumBy.className("android.widget.TextView")),
            postInFav = $(AppiumBy.id("ru.leprosorium:id/text"));

    @Step("Открываем Избранное")
    public FavPage openMenu() {
        menuButton.click();
        favLink.click();
        return this;
    }

    @Step("Проверяем заголовок")
    public FavPage titleCheck() {
        title.shouldHave(Condition.text("Избранное"));
        return this;
    }

    @Step("Проверяем наличие поста в Избранном")
    public FavPage favPostCheck() {
        postInFav.shouldHave(Condition.text("Как я постирал пенопласт"));
        return this;
    }
}
