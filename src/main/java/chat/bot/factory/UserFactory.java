package chat.bot.factory;

import chat.bot.enums.Role;
import chat.bot.models.User;

public class UserFactory {

    public static User createUser(String name, Role role) {
        return new User(name, role);
    }
}
