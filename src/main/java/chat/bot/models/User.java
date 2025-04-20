package chat.bot.models;

import chat.bot.enums.Role;
import chat.bot.enums.SenderType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.*;

@Entity
public class User {

    @Id
    private UUID userId;
    private String name;
    private Role role;
    public User(String name, Role role) {
            this.userId = UUID.randomUUID();
            this.name = name;
            this.role = role;
        }

    public User() {

    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public void sendMessage(String content, ChatbotSession session) {
            Message message = new Message(content, SenderType.USER);
            session.logMessage(message);
            System.out.println("User sent: " + content);
        }

        public void receiveMessage(String content) {
            System.out.println("User received: " + content);
        }

        public class UserBuilder {
            private UUID userId;
            private String name;
            private Role role;

            public UserBuilder(User user) {
                this.userId = UUID.randomUUID();
                this.name = user.name;
                this.role = user.role;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setRole(Role role) {
                this.role = role;
            }

            public User build() {
                return new User();
            }
        }
    }
