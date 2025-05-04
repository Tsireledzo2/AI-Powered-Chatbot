package chat.bot.repository;

import chat.bot.models.ChatbotSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChatbotSessionRepository extends JpaRepository<ChatbotSession, UUID> {
}
