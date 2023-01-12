package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.web.pages.FraudPage;
import static helpers.FakerData.*;

public class FraudTest extends TestBase {
    FraudPage fraudPage = new FraudPage();

    @Test
    @DisplayName("Проверка заполнения формы в магазине")
    void fraudFormFillTest() {
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
                .checkMessage()
                .closeForm();
    }
}