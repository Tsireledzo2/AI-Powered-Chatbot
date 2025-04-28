package chat.bot.repository.inmemory;

import chat.bot.models.Chatbot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryChatbotRepositoryTest {
    @Test
    void testSaveAndFindById() {
        InMemoryChatbotRepository repo = new InMemoryChatbotRepository();
        Chatbot bot = new Chatbot("TestBot", "1.0");

        repo.save(bot);

        assertTrue(repo.findById(bot.getBotId()).isPresent());
    }

    @Test
    void testFindAll() {
        InMemoryChatbotRepository repo = new InMemoryChatbotRepository();
        repo.save(new Chatbot("Bot1", "1.0"));
        repo.save(new Chatbot("Bot2", "2.0"));

        assertEquals(2, repo.findAll().size());
    }

    @Test
    void testDelete() {
        InMemoryChatbotRepository repo = new InMemoryChatbotRepository();
        Chatbot bot = new Chatbot("DeleteBot", "1.1");
        repo.save(bot);

        repo.delete(bot.getBotId());

        assertFalse(repo.findById(bot.getBotId()).isPresent());
    }

}