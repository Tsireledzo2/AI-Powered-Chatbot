package chat.bot.repository.inmemory;

import chat.bot.models.ChatbotSession;
import chat.bot.repository.ChatbotSessionRepository;

import java.util.*;

public class InMemoryChatbotSessionRepository implements ChatbotSessionRepository {
    private final Map<UUID, ChatbotSession> storage = new HashMap<>();

    @Override
    public void save(ChatbotSession session) {
        storage.put(session.getSessionId(), session);
    }

    @Override
    public Optional<ChatbotSession> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<ChatbotSession> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(UUID id) {
        storage.remove(id);
    }
}
