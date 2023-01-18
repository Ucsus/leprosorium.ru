package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DomainsTest extends TestBase{
    @Tag("ui")
    @Test
    @DisplayName("Проверка подписанных подлепр")

    void domainsTest() {
        domainsPage
                .checkDomainsTest();
    }
}
