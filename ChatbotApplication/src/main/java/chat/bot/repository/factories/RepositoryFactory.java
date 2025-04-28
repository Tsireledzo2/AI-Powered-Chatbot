package chat.bot.repository.factories;

import chat.bot.repository.*;
import chat.bot.repository.inmemory.*;

public class RepositoryFactory {
    public static UserRepository getUserRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryUserRepository();
            default:
                throw new IllegalArgumentException("Invalid storage type for UserRepository: " + storageType);
        }
    }

    public static IntentRepository getIntentRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryIntentRepository();
            default:
                throw new IllegalArgumentException("Invalid storage type for IntentRepository: " + storageType);
        }
    }

    public static ResponsePatternRepository getResponsePatternRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryResponsePatternRepository();
            default:
                throw new IllegalArgumentException("Invalid storage type for ResponsePatternRepository: " + storageType);
        }
    }

    public static ChatbotSessionRepository getChatbotSessionRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryChatbotSessionRepository();
            default:
                throw new IllegalArgumentException("Invalid storage type for ChatbotSessionRepository: " + storageType);
        }
    }

    public static ChatBotRepository getChatbotRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryChatbotRepository();
            default:
                throw new IllegalArgumentException("Invalid storage type for ChatbotRepository: " + storageType);
        }
    }
}
