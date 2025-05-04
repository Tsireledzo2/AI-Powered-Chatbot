//package chat.bot.repository.inmemory;
//
//import chat.bot.models.ResponsePattern;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InMemoryResponsePatternRepositoryTest {
//    @Test
//    void testSaveAndFindById() {
//        InMemoryResponsePatternRepository repo = new InMemoryResponsePatternRepository();
//        ResponsePattern pattern = new ResponsePattern("Hello, how can I help you?");
//
//        repo.save(pattern);
//
//        assertTrue(repo.findById(pattern.getPatternId()).isPresent());
//    }
//
//    @Test
//    void testFindAll() {
//        InMemoryResponsePatternRepository repo = new InMemoryResponsePatternRepository();
//        repo.save(new ResponsePattern("Hi there!"));
//        repo.save(new ResponsePattern("Goodbye!"));
//
//        assertEquals(2, repo.findAll().size());
//    }
//
//    @Test
//    void testDelete() {
//        InMemoryResponsePatternRepository repo = new InMemoryResponsePatternRepository();
//        ResponsePattern pattern = new ResponsePattern("See you later!");
//        repo.save(pattern);
//
//        repo.delete(pattern.getPatternId());
//
//        assertFalse(repo.findById(pattern.getPatternId()).isPresent());
//    }
//
//}