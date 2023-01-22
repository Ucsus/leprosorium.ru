package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ui")
@Tag("all")
public class DomainsTest extends TestBase{

    @Test
    @DisplayName("Проверка подписанных подлепр")

    void domainsTest() {
        domainsPage
                .checkDomainsTest();
    }
}
