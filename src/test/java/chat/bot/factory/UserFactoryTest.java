package chat.bot.factory;

import static org.junit.jupiter.api.Assertions.*;

import chat.bot.enums.Role;
import chat.bot.models.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    public void testCreateUser() {
        User user = UserFactory.createUser("Alice", Role.USER);
        assertNotNull(user);
        assertEquals("Alice", user.getName());
        assertEquals(Role.USER, user.getRole());
    }
}
