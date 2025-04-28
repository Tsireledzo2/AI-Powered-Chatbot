package chat.bot.repository.inmemory;

import chat.bot.models.User;
import chat.bot.repository.UserRepository;

import java.util.*;

public class InMemoryUserRepository implements UserRepository {

    private final Map<UUID, User> storage = new HashMap<>();
    @Override
    public void save(User user) {
        storage.put(user.getUserId(), user);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(UUID id) {
        storage.remove(id);
    }
}

