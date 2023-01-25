package tests.mobile.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import drivers.web.BrowserWebDriver;
import helpers.FakerData;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage {
    String username = BrowserWebDriver.config.username();
    String password = BrowserWebDriver.config.password();

    public final SelenideElement
            usernameFill = $(AppiumBy.id("ru.leprosorium:id/login")),
            passwordFill = $(AppiumBy.id("ru.leprosorium:id/password")),
            yarrrButton = $(AppiumBy.id("ru.leprosorium:id/yarrr")),
            title = $(AppiumBy.className("android.widget.TextView"));

    @Step("Авторизация")
    public LoginPage authorizationFormFill() {
        usernameFill.sendKeys(username);
        passwordFill.sendKeys(password);
        yarrrButton.click();
        return this;
    }

    @Step("Проверяем заголовок")
    public LoginPage checkAuthorization() {
        title.shouldHave(Condition.text("Главная"));
        return this;
    }

    @Step("Неправильный пароль")
    public LoginPage invalidPassword() {
        usernameFill.sendKeys(username);
        passwordFill.sendKeys(FakerData.invalidPassword);
        yarrrButton.click();
        String actualText = new WebDriverWait(getWebDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast")))
                .getText();
        assertThat(actualText).isEqualTo("{\"code\":\"invalid_password\"}");
        return this;
    }

    @Step("Неправильный пользователь")
    public LoginPage invalidUser() {
        usernameFill.sendKeys(FakerData.invalidUser);
        passwordFill.sendKeys(password);
        yarrrButton.click();
        String actualText = new WebDriverWait(getWebDriver(), Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast")))
                .getText();
        assertThat(actualText).isEqualTo("{\"code\":\"invalid_user\"}");
        return this;
    }


}
