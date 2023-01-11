package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public final SelenideElement
            searchInput = $("[name=query]"),
            dataSortRating = $("[data-sort=rating]"),
            navigationMenu = $("#js-navthing"),
            subSite = $(".b-navthing_tab_both_link");

    public final ElementsCollection
            searchResult = $$("div.b-search_docs_results");

    @Step("Открываем страницу поиска: {pageUrl}")
    public SearchPage openPage(String pageUrl) {
        open(pageUrl);
        return this;
    }

    @Step("Поисковый запрос: {searchText}")
    public SearchPage searchQuery(String searchText) {
        searchInput.setValue(searchText).pressEnter();
        return this;
    }

    @Step("Сортировка по рейтингу")
    public SearchPage sortByRating() {
        dataSortRating.click();
        return this;
    }

    @Step("Автор топового поста: {postAuthor}")
    public SearchPage topicStarterCheck(String postAuthor) {
        searchResult
                .first()
                .shouldHave(Condition.text(postAuthor));
        return this;
    }


    @Step("Open navigation menu")
    public SearchPage openNavigationMenu() {
        navigationMenu.click();
        return this;
    }

    @Step("Go to qaguru.leprosorium.ru")
    public SearchPage openSubSite() {
        subSite.click();
        return this;
    }
}
