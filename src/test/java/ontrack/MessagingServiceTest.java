package ontrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MessagingServiceTest {

    @Test
    public void testSendMessageSuccess() {
        MessagingService service = new MessagingService();
        boolean result = service.sendMessage("stu123", "tut456", "Hello tutor!");
        assertTrue(result);
    }

    @Test
    public void testMessageStorage() {
        MessagingService service = new MessagingService();
        service.sendMessage("stu001", "tut999", "Need help on assignment.");
        List<Message> messages = service.getMessages();
        assertEquals(1, messages.size());
        assertEquals("Need help on assignment.", messages.get(0).getMessageText());
    }
}
