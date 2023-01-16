package tests.mobile;

import org.junit.jupiter.api.Test;
import tests.mobile.pages.InboxPage;

public class InboxTest extends TestBase {
    InboxPage inboxPage = new InboxPage();

    @Test
    void inboxTest() {
        inboxPage
                .openMenu()
                .titleCheck()
                .openInbox()
                .openInboxComments()
                .writeComment()
                .checkInboxSendMessage("Yarrr!");
    }

}
