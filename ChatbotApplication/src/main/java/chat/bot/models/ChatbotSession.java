package chat.bot.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.*;
@Entity
public class ChatbotSession {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID sessionId = UUID.randomUUID();
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "messageId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Messages> messages = new ArrayList<>();

    public ChatbotSession( LocalDateTime startTime, LocalDateTime endTime, List<Messages> messages) {
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

    public List<Messages> getMessages() {
        return messages;
    }

    public void startSession() {
        this.startTime = LocalDateTime.now();
    }

    public void endSession() {
        this.endTime = LocalDateTime.now();
    }

    public void logMessage(Messages messages) {
        this.messages.add(messages);
    }

    public class ChatbotSessionBuilder {
        private UUID sessionId = UUID.randomUUID();
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private List<Messages> messages = new ArrayList<>();

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

        public void setMessages(List<Messages> messages) {
            this.messages = messages;
        }

        public ChatbotSession build(){
            return new ChatbotSession();
        }
    }
}
