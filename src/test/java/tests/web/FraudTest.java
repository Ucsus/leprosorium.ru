package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static helpers.FakerData.*;

@Tag("web")
@Tag("all")
public class FraudTest extends TestBase {

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
                .closeForm();
        loginPage
                .logout();
    }
}
