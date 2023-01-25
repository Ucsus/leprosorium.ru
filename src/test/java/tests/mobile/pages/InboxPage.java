package tests.mobile.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static helpers.TestData.newPost;
import static org.assertj.core.api.Assertions.assertThat;

public class InboxPage {
    public final SelenideElement
            menuButton = $(AppiumBy.className("android.widget.ImageButton")),
            inboxLink = $(AppiumBy.className("android.support.v7.widget.LinearLayoutCompat"), 2),
            title = $(AppiumBy.className("android.widget.TextView")),
            inboxBody = $(AppiumBy.id("ru.leprosorium:id/post_content")),
            commentTab = $(AppiumBy.className("android.support.v7.app.ActionBar$Tab"), 1),
            writeCommentButton = $(AppiumBy.id("ru.leprosorium:id/menu_comment")),
            newCommentBody = $(AppiumBy.id("ru.leprosorium:id/text")),
            submitButton = $(AppiumBy.id("ru.leprosorium:id/submit"));

    @Step("Открываем Инбокс")
    public InboxPage openMenu() {
        menuButton.click();
        inboxLink.click();
        return this;
    }

    @Step("Проверяем заголовок")
    public InboxPage titleCheck() {
        title.shouldHave(Condition.text("Инбокс"));
        return this;
    }

    @Step("Открываем Инбокс")
    public InboxPage openInbox() {
        inboxBody.click();
        return this;
    }

    @Step("Открываем комментарии")
    public InboxPage openInboxComments() {
        commentTab.click();
        return this;
    }

    @Step("Пишем комментарий")
    public InboxPage writeComment() {
        writeCommentButton.click();
        newCommentBody.sendKeys(newPost);
        submitButton.click();
        return this;
    }

    @Step("Проверяем, что комментарий отправлен")
    public InboxPage checkInboxSendMessage(String errorText) {
        String actualText = new WebDriverWait(getWebDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast")))
                .getText();
        assertThat(actualText).isEqualTo(errorText);
        return this;
    }
}
