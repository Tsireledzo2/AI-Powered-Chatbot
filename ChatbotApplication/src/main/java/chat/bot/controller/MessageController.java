package chat.bot.controller;

import chat.bot.models.Messages;
import chat.bot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/saveMessage")
    public void saveMessage(@RequestBody Messages messages){
        messageService.saveMessage(messages);
    }

    @GetMapping("/getMessages/{messageId}")
    public Optional<Messages> getMessages(@PathVariable UUID messageId){
        return messageService.getMessageById(messageId);
    }

    @PostMapping("/getAllMessages")
    public List<Messages> getAllMessages(){
        return messageService.getAllMessages();
    }

    @DeleteMapping("/deleteMessages/{messageId}")
    public void deleteUser(@PathVariable UUID messageId){
        messageService.deleteMessage(messageId);
    }
}
