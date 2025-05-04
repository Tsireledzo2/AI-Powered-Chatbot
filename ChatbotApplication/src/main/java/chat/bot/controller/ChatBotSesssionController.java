package chat.bot.controller;

import chat.bot.models.ChatbotSession;
import chat.bot.service.ChatBotSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/chatSession")
public class ChatBotSesssionController {

    @Autowired
    ChatBotSessionService sessionService;

    @PostMapping("/saveSession")
    public void createSession(@RequestBody ChatbotSession session) {
        sessionService.saveSession(session);
    }

    @GetMapping("/getSession/{sessionId}")
    public Optional<ChatbotSession> getSession(@PathVariable UUID sessionId) {
        return sessionService.getSessionById(sessionId);
    }

    @GetMapping("/getAllSessions")
    public List<ChatbotSession> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @DeleteMapping("/deleteSession/{sessionId}")
    public void deleteSession(@PathVariable UUID sessionId) {
        sessionService.deleteSession(sessionId);
    }
}
