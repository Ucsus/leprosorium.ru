package helpers;

import com.github.javafaker.Faker;

public class TestData {
    static String prefix = "+7";
    private static final Faker faker = new Faker();
    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            phone = prefix + faker.phoneNumber().subscriberNumber(10),
            postalCode = faker.address().zipCode(),
            region = "Москва и Московская область",
            city = "Москва",
            street = faker.address().streetName(),
            house = faker.address().buildingNumber(),
            building = faker.address().buildingNumber(),
            apartment = faker.address().buildingNumber(),
            commentForOrder = faker.friends().quote(),
            newPost = faker.rickAndMorty().quote(),
            invalidUser = faker.name().username(),
            invalidPassword = faker.internet().password();
}
