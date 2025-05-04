package chat.bot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;
@Entity
public class Chatbot {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID botId;
    private String name;
    private String version;

    public Chatbot() {
    }

    public Chatbot(String name, String version) {
        this.botId = UUID.randomUUID();
        this.name = name;
        this.version = version;
    }

    public UUID getBotId() {
        return botId;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String generateResponse(String input) {
        return "Default bot response to: " + input;
    }

    public class ChatbotBuilder {
        private UUID botId = UUID.randomUUID();
        private String name;
        private String version;

        public ChatbotBuilder() {
        }

        public ChatbotBuilder( String name, String version) {
            this.botId = UUID.randomUUID();
            this.name = name;
            this.version = version;
        }

        public UUID getBotId() {
            return botId;
        }

        public String getName() {
            return name;
        }

        public String getVersion() {
            return version;
        }

        public ChatbotBuilder(Chatbot chatbot){
            this.botId = UUID.randomUUID();
            this.name = chatbot.name;
            this.version = chatbot.version;
        }

        public ChatbotBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ChatbotBuilder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Chatbot build() {
            return new Chatbot();
        }
    }
}



