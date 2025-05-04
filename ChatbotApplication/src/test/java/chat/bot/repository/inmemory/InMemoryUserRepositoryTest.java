//package chat.bot.repository.inmemory;
//
//import chat.bot.enums.Role;
//import chat.bot.models.User;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InMemoryUserRepositoryTest {
//    @Test
//    void testSaveAndFindById() {
//        InMemoryUserRepository repo = new InMemoryUserRepository();
//        User user = new User("John Doe", Role.USER);
//
//        repo.save(user);
//        assertTrue(repo.findById(user.getUserId()).isPresent());
//    }
//
//    @Test
//    void testFindAll() {
//        InMemoryUserRepository repo = new InMemoryUserRepository();
//        repo.save(new User("John Doe", Role.USER));
//        repo.save(new User("Jane Smith", Role.ADMIN));
//
//        assertEquals(2, repo.findAll().size());
//    }
//
//    @Test
//    void testDelete() {
//        InMemoryUserRepository repo = new InMemoryUserRepository();
//        User user = new User("John Doe", Role.USER);
//        repo.save(user);
//
//        repo.delete(user.getUserId());
//        assertFalse(repo.findById(user.getUserId()).isPresent());
//    }
//
//}