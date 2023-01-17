package tests.mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public final SelenideElement
            menuButton = $(AppiumBy.className("android.widget.ImageButton")),
            searchLink = $(AppiumBy.className("android.support.v7.widget.LinearLayoutCompat"), 5),
            searchInput = $(AppiumBy.id("ru.leprosorium:id/search_src_text")),
            searchStart = $(AppiumBy.id("ru.leprosorium:id/menu_search"));


    @Step("Открываем Поиск")
    public SearchPage openMenu() {
        menuButton.click();
        searchLink.click();
        return this;
    }

    @Step("Поисковый запрос: {searchText}")
    public SearchPage searchQuery(String searchText) {
        searchInput.sendKeys(searchText);
        return this;
    }
}
