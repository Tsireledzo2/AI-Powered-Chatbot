//package chat.bot.repository.inmemory;
//
//import chat.bot.models.Intent;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InMemoryIntentRepositoryTest {
//    @Test
//    void testSaveAndFindById() {
//        InMemoryIntentRepository repo = new InMemoryIntentRepository();
//        Intent intent = new Intent("Greeting", 0.95f);
//
//        repo.save(intent);
//
//        assertTrue(repo.findById(intent.getIntentId()).isPresent());
//    }
//
//    @Test
//    void testFindAll() {
//        InMemoryIntentRepository repo = new InMemoryIntentRepository();
//        repo.save(new Intent("Greeting", 0.9f));
//        repo.save(new Intent("Farewell", 0.8f));
//
//        assertEquals(2, repo.findAll().size());
//    }
//
//    @Test
//    void testDelete() {
//        InMemoryIntentRepository repo = new InMemoryIntentRepository();
//        Intent intent = new Intent("Question", 0.85f);
//        repo.save(intent);
//
//        repo.delete(intent.getIntentId());
//
//        assertFalse(repo.findById(intent.getIntentId()).isPresent());
//    }
//
//}