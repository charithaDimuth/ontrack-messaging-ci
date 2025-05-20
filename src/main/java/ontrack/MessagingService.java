package ontrack;

import java.util.ArrayList;
import java.util.List;

public class MessagingService {
    private List<Message> messages = new ArrayList<>();

    public boolean sendMessage(String studentId, String tutorId, String messageText) {
        Message message = new Message(studentId, tutorId, messageText);
        messages.add(message);
        return true;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
