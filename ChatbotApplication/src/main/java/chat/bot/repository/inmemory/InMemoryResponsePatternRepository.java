//package chat.bot.repository.inmemory;
//
//import chat.bot.models.ResponsePattern;
//import chat.bot.repository.ResponsePatternRepository;
//
//import java.util.*;
//
//public class InMemoryResponsePatternRepository implements ResponsePatternRepository {
//
//    private final Map<UUID, ResponsePattern> storage = new HashMap<>();
//
//    @Override
//    public void save(ResponsePattern pattern) {
//        storage.put(pattern.getPatternId(), pattern);
//    }
//
//    @Override
//    public Optional<ResponsePattern> findById(UUID id) {
//        return Optional.ofNullable(storage.get(id));
//    }
//
//    @Override
//    public List<ResponsePattern> findAll() {
//        return new ArrayList<>(storage.values());
//    }
//
//    @Override
//    public void delete(UUID id) {
//        storage.remove(id);
//    }
//}
