package chat.bot.controller;


import chat.bot.models.Chatbot;
import chat.bot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/chat")
public class ChatBotController {

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/saveChatbot")
    public void create(@RequestBody Chatbot chatbot) {
        chatbotService.saveChatbot(chatbot);
    }

    @GetMapping("/getChatbot/{chatbotId}")
    public Optional<Chatbot> getChatbot(@PathVariable UUID chatbotId) {
        return chatbotService.getChatbotById(chatbotId);
    }

    @GetMapping("/getAllChatbots")
    public List<Chatbot> getAllChatbots() {
        return chatbotService.getAllChatbots();
    }

    @DeleteMapping("/deleteChatbot/{chatbotId}")
    public void deleteChatbot(@PathVariable UUID chatbotId) {
        chatbotService.deleteChatbot(chatbotId);
    }
}
