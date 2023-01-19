package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class InboxTest extends TestBase {

    @Tag("mobile")
    @Tag("all")
    @Test
    @DisplayName("Проверка комментирования в Инбоксе")
    void inboxTest() {
        loginPage
                .authorizationFormFill();
        inboxPage
                .openMenu()
                .titleCheck()
                .openInbox()
                .openInboxComments()
                .writeComment()
                .checkInboxSendMessage("Yarrr!");
    }

}
