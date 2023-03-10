package tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static helpers.TestData.*;

@Tag("web")
@Tag("all")
public class FraudTest extends TestBase {

    @Test
    @Feature("Тестирование заполнения формы в магазине")
    @Owner("Ucsus")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Fraud page", url = "https://leprosorium.ru/fraud/")
    @DisplayName("Проверка заполнения формы в магазине")
    void fraudFormFillTest() {
        LoginTest loginTest = new LoginTest();
        loginTest.authorization();
        fraudPage
                .openPage("/fraud")
                .addPinToCart()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhone(phone)
                .setPostalCode(postalCode)
                .setRegion(region)
                .setCity(city)
                .setStreet(street)
                .setHouse(house)
                .setBuilding(building)
                .setApartment(apartment)
                .setCommentForOrder(commentForOrder)
                .closeForm();
    }
}
