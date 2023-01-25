package tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class FraudPage {
    public final SelenideElement
            footer = $(".b-footer"),
            cartButton = $(withText("корзину")),
            terms = $(".b-fraud_market_terms_field input"),
            firstNameInput = $("[name=firstname]"),
            lastNameInput = $("[name=lastname]"),
            emailInput = $("[name=email]"),
            phoneInput = $("[name=phone]"),
            postalCodeInput = $("[name=postal_code]"),
            regionInput = $("[name=region]"),
            cityInput = $("[name=city]"),
            streetInput = $("[name=street]"),
            houseInput = $("[name=house]"),
            buildingInput = $("[name=building]"),
            apartmentInput = $("[name=apartment]"),
            commentsForOrderInput = $("[name=comments_for_order]"),
            closeButton = $(".b-fraud_market_basket a");

    @Step("Открываем страницу магазина")
    public FraudPage openPage() {
        open("/fraud");
        return this;
    }

    @Step("Добавляем товар в корзину")
    public FraudPage addPinToCart() {
        footer.scrollTo();
        sleep(1000);
        cartButton.click();
        terms.click();
        return this;
    }

    @Step("Имя")
    public FraudPage
    setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Фамилия")
    public FraudPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Email")
    public FraudPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    @Step("Телефон")
    public FraudPage setPhone(String value) {
        phoneInput.setValue(value);
        return this;
    }

    @Step("Индекс")
    public FraudPage setPostalCode(String value) {
        postalCodeInput.setValue(value);
        return this;
    }

    @Step("Регион")
    public FraudPage setRegion(String value) {
        regionInput.click();
        $(byText(value)).click();
        sleep(1000);
        return this;
    }

    @Step("Город")
    public FraudPage setCity(String value) {
        cityInput.click();
        $(byText(value)).click();
        return this;
    }

    @Step("Улица")
    public FraudPage setStreet(String value) {
        streetInput.setValue(value);
        return this;
    }

    @Step("Дом")
    public FraudPage setHouse(String value) {
        houseInput.setValue(value);
        return this;
    }

    @Step("Корпус")
    public FraudPage setBuilding(String value) {
        buildingInput.setValue(value);
        return this;
    }

    @Step("Квартира")
    public FraudPage setApartment(String value) {
        apartmentInput.setValue(value);
        return this;
    }

    @Step("Комментарий к заказу")
    public FraudPage setCommentForOrder(String value) {
        commentsForOrderInput.setValue(value);
        return this;
    }

    @Step("Закрываем форму")
    public FraudPage closeForm() {
        closeButton.click();
        return this;
    }
}
