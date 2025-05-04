//package chat.bot.repository.inmemory;
//
//import chat.bot.models.Intent;
//import chat.bot.repository.IntentRepository;
//
//import java.util.*;
//
//public class InMemoryIntentRepository implements IntentRepository {
//    private final Map<UUID, Intent> storage = new HashMap<>();
//
//    @Override
//    public void save(Intent intent) {
//        storage.put(intent.getIntentId(), intent);
//    }
//
//    @Override
//    public Optional<Intent> findById(UUID id) {
//        return Optional.ofNullable(storage.get(id));
//    }
//
//    @Override
//    public List<Intent> findAll() {
//        return new ArrayList<>(storage.values());
//    }
//
//    @Override
//    public void delete(UUID id) {
//        storage.remove(id);
//    }
//}
