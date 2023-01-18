package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WriteInboxCommentTest extends TestBase{
    @Tag("ui")
    @Test
    @DisplayName("Новый комментарий в инбокс")
    void writeInboxComment() {
        inboxPage
                .checkWriteInboxComment("Hello!");
    }


}
