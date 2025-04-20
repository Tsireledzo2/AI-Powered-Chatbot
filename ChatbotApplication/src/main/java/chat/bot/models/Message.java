package chat.bot.models;

import chat.bot.enums.SenderType;

import java.time.LocalDateTime;
import java.util.UUID;

class Message {
    private UUID messageId;
    private String content;
    private LocalDateTime timestamp;
    private SenderType senderType;

    public Message() {
    }

    public Message(String content, SenderType senderType) {
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

        public MessageBuilder(Message message) {
            this.messageId = UUID.randomUUID();
            this.content = message.content;
            this.timestamp = message.timestamp;
            this.senderType = message.senderType;
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

        public Message build(){
            return new Message();
        }
    }
}

