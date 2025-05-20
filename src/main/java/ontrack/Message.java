package ontrack;

public class Message {
    private String studentId;
    private String tutorId;
    private String messageText;

    public Message(String studentId, String tutorId, String messageText) {
        this.studentId = studentId;
        this.tutorId = tutorId;
        this.messageText = messageText;
    }

    public String getStudentId() { return studentId; }
    public String getTutorId() { return tutorId; }
    public String getMessageText() { return messageText; }
}
