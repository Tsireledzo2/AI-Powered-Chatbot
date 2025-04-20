//package chat.bot.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/chat")
//public class ChatController {
//    private final ChatbotService chatbotService;
//
//    public ChatController(ChatbotService chatbotService) {
//        this.chatbotService = chatbotService;
//    }
//
//    @PostMapping("/message")
//    public String sendMessage(@RequestBody String userInput) {
//        return chatbotService.generateResponse(userInput);
//    }
//}
