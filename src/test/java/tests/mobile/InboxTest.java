package tests.mobile;

import org.junit.jupiter.api.Test;
import tests.mobile.pages.InboxPage;

import static com.codeborne.selenide.Selenide.sleep;

public class InboxTest extends TestBaseMobile{
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
