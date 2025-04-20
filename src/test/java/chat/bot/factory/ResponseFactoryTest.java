package chat.bot.factory;

import static org.junit.jupiter.api.Assertions.*;

import chat.bot.models.ResponsePattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResponseFactoryTest {

    @Test
    public void testFormalResponseFactory() {
        ResponseFactory factory = new FormalResponseFactory();
        ResponsePattern pattern = factory.createResponsePattern("How can I assist?");
        assertTrue(pattern.generateResponse().startsWith("Greetings."));
    }

    @Test
    public void testCasualResponseFactory() {
        ResponseFactory factory = new CasualResponseFactory();
        ResponsePattern pattern = factory.createResponsePattern("What's up?");
        assertTrue(pattern.generateResponse().startsWith("Hey!"));
    }
}
