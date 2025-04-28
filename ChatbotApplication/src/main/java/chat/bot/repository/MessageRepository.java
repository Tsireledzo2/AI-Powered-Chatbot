package chat.bot.repository;

import jakarta.mail.Message;

import java.util.UUID;

public interface MessageRepository extends IRepository<Message, UUID> {
}
