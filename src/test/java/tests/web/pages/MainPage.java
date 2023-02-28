package tests.web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static helpers.TestData.newPost;

public class MainPage {
    String imageSource = "https://loremflickr.com/500/500/girl";
    public final SelenideElement
            navigationMenu = $("#js-navthing"),
            subSite = $(".b-navthing_tab_both_link"),
            header = $(".b-subsite_header"),
            chatOpenButton = $(".b-chat_open"),
            chatCloseButton = $(".b-chat_open_holder .b-chat_open"),
            chatInput = $("#js-chat_input"),
            chatWindow = $("#js-chat_messages_holder"),
            postInput = $("#js-new_post_body"),
            postSubmit = $("#js-new_post_submit"),
            postText = $(".p_body"),
            moderateMenu = $(".b-post_moderate"),
            deleteLink = $(byText("удалить пост")),
            confirmButtonOk = $(".b-confirm_button", 0),
            confirmButtonCancel = $(".b-confirm_button", 1),
            deleteMessage = $(".futu_dialog_popup_text");

    @Step("Открываем меню навигации")
    public MainPage openNavigationMenu() {
        navigationMenu.click();
        return this;
    }

    @Step("Переходим на подлепру")
    public MainPage openSubSite() {
        subSite.click();
        return this;
    }

    @Step("Проверяем хэдер")
    public MainPage headerCheck() {
        header.shouldHave(Condition.text("Just for test"));
        return this;
    }

    @Step("Открываем ДискоЧат")
    public MainPage openDiscoChat() {
        chatOpenButton.click();
        chatInput.sendKeys("Hello, world!");
        chatInput.pressEnter();
        return this;
    }

    @Step("Пишем сообщение: {messageText}") //wtf
    public MainPage writeMessage(String messageText) {
        chatInput.sendKeys(messageText);
        chatInput.pressEnter();
        chatWindow.shouldHave(Condition.text(messageText));
        return this;
    }

    @Step("Закрываем ДискоЧат")
    public MainPage closeDiscoChat() {
        chatCloseButton.click();
        return this;
    }

    @Step("Пишем пост")
    public MainPage writePost() {
        postInput.setValue(newPost + "\n <img src=\"" + imageSource + "\">");
        postSubmit.click();
        return this;
    }

    @Step("Проверяем пост")
    public MainPage checkPost() {
        postText.shouldHave(Condition.text(newPost));
        return this;
    }

    @Step("Удаляем верхний пост")
    public MainPage deleteFirstPost() {
        moderateMenu.click();
        deleteLink.click();
        confirmButtonOk.click();
        return this;
    }

    @Step("Проверяем, что пост удалён")
    public MainPage checkPostDelete() {
        deleteMessage.shouldHave(Condition.text("Пост удалён"));
        return this;
    }

}
