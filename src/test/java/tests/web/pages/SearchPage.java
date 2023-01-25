package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public final SelenideElement
            searchInput = $("[name=query]"),
            dataSortRating = $("[data-sort=rating]");

    public final ElementsCollection
            searchResult = $$("div.b-search_docs_results");

    @Step("Открываем страницу поиска")
    public SearchPage openPage() {
        open("/search");
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

}
