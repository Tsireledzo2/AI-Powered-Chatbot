package chat.bot.repository.inmemory;

import chat.bot.models.Chatbot;
import chat.bot.repository.ChatBotRepository;

import java.util.*;

public class InMemoryChatbotRepository implements ChatBotRepository {
    private final Map<UUID, Chatbot> storage = new HashMap<>();

    @Override
    public void save(Chatbot bot) {
        storage.put(bot.getBotId(), bot);
    }

    @Override
    public Optional<Chatbot> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Chatbot> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(UUID id) {
        storage.remove(id);
    }
}
