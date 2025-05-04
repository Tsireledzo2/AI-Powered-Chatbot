package chat.bot.models;

import chat.bot.enums.SenderType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID messageId;
    private String content;
    private LocalDateTime timestamp;
    private SenderType senderType;

    public Messages() {
    }

    public Messages(String content, SenderType senderType) {
        this.messageId = UUID.randomUUID();
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.senderType = senderType;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public SenderType getSenderType() {
        return senderType;
    }

    public void editMessage(String newContent) {
        this.content = newContent;
    }

    public void deleteMessage() {
        this.content = "[deleted]";
    }

    public String getContent() {
        return content;
    }

    public class MessageBuilder {
        private UUID messageId;
        private String content;
        private LocalDateTime timestamp;
        private SenderType senderType;

        public MessageBuilder(Messages messages) {
            this.messageId = UUID.randomUUID();
            this.content = messages.content;
            this.timestamp = messages.timestamp;
            this.senderType = messages.senderType;
        }

        public void setMessageId(UUID messageId) {
            this.messageId = messageId;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

        public void setSenderType(SenderType senderType) {
            this.senderType = senderType;
        }

        public Messages build(){
            return new Messages();
        }
    }
}

