package chat.bot.models;

import java.time.LocalDateTime;
import java.util.*;

public class ChatbotSession {
    private UUID sessionId = UUID.randomUUID();
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Message> messages = new ArrayList<>();

    public ChatbotSession( LocalDateTime startTime, LocalDateTime endTime, List<Message> messages) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.messages = messages;
    }

    public ChatbotSession() {
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void startSession() {
        this.startTime = LocalDateTime.now();
    }

    public void endSession() {
        this.endTime = LocalDateTime.now();
    }

    public void logMessage(Message message) {
        messages.add(message);
    }

    public class ChatbotSessionBuilder {
        private UUID sessionId = UUID.randomUUID();
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private List<Message> messages = new ArrayList<>();

        public ChatbotSessionBuilder(ChatbotSession chatbotSession){
            this.startTime = chatbotSession.startTime;
            this.endTime = chatbotSession.endTime;
            this.messages = chatbotSession.messages;
        }

        public void setSessionId(UUID sessionId) {
            this.sessionId = sessionId;
        }

        public void setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
        }

        public void setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
        }

        public void setMessages(List<Message> messages) {
            this.messages = messages;
        }

        public ChatbotSession build(){
            return new ChatbotSession();
        }
    }
}
