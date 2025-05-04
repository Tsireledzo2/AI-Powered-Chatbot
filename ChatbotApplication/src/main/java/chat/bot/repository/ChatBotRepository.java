package chat.bot.repository;

import chat.bot.models.Chatbot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChatBotRepository extends JpaRepository<Chatbot, UUID> {
}
