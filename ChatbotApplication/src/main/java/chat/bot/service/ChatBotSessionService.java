package chat.bot.service;

import chat.bot.models.ChatbotSession;
import chat.bot.repository.ChatbotSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ChatBotSessionService {

    private final ChatbotSessionRepository chatbotSessionRepository;

    @Autowired
    public ChatBotSessionService(ChatbotSessionRepository chatbotSessionRepository) {
        this.chatbotSessionRepository = chatbotSessionRepository;
    }

    public void saveSession(ChatbotSession session) {
        chatbotSessionRepository.save(session);
    }

    public Optional<ChatbotSession> getSessionById(UUID id) {
        return chatbotSessionRepository.findById(id);
    }

    public List<ChatbotSession> getAllSessions() {
        return chatbotSessionRepository.findAll();
    }

    public void deleteSession(UUID id) {
        chatbotSessionRepository.deleteById(id);
    }
}
