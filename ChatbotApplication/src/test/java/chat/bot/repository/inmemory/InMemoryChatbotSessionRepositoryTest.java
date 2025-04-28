package chat.bot.repository.inmemory;

import chat.bot.models.ChatbotSession;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryChatbotSessionRepositoryTest {
    @Test
    void testSaveAndFindById() {
        InMemoryChatbotSessionRepository repo = new InMemoryChatbotSessionRepository();
        ChatbotSession session = new ChatbotSession(LocalDateTime.now(), null, new ArrayList<>());

        repo.save(session);

        assertTrue(repo.findById(session.getSessionId()).isPresent());
    }

    @Test
    void testFindAll() {
        InMemoryChatbotSessionRepository repo = new InMemoryChatbotSessionRepository();
        repo.save(new ChatbotSession(LocalDateTime.now(), null, new ArrayList<>()));
        repo.save(new ChatbotSession(LocalDateTime.now(), null, new ArrayList<>()));

        assertEquals(2, repo.findAll().size());
    }

    @Test
    void testDelete() {
        InMemoryChatbotSessionRepository repo = new InMemoryChatbotSessionRepository();
        ChatbotSession session = new ChatbotSession(LocalDateTime.now(), null, new ArrayList<>());
        repo.save(session);

        repo.delete(session.getSessionId());

        assertFalse(repo.findById(session.getSessionId()).isPresent());
    }

}