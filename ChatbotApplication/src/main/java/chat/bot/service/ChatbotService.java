package chat.bot.service;

import chat.bot.models.Chatbot;
import chat.bot.repository.ChatBotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ChatbotService {

    private static ChatBotRepository chatbotRepository;

    @Autowired
    private ChatbotService(ChatBotRepository chatbotRepository){
        this.chatbotRepository = chatbotRepository;
    }
    public void saveChatbot(Chatbot chatbot) {
        chatbotRepository.save(chatbot);
    }

    public Optional<Chatbot> getChatbotById(UUID id) {
        return chatbotRepository.findById(id);
    }

    public List<Chatbot> getAllChatbots() {
        return chatbotRepository.findAll();
    }

    public void deleteChatbot(UUID id) {
        chatbotRepository.deleteById(id);
    }
}
