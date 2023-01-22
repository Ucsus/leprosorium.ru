package tests.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ui")
@Tag("all")
public class PostDeleteTest extends TestBase {
    @Test
    @Disabled
    @DisplayName("Удаление поста {postId}")
    void deletePostById(){
        postDeletePage
                .deletePost("2222");
    }
}