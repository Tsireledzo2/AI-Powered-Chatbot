package chat.bot.service;

import chat.bot.models.Messages;
import chat.bot.repository.MessageRepository;
import jakarta.mail.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void saveMessage(Messages message) {
        messageRepository.save(message);
    }

    public Optional<Messages> getMessageById(UUID id) {
        return messageRepository.findById(id);
    }

    public List<Messages> getAllMessages() {
        return messageRepository.findAll();
    }

    public void deleteMessage(UUID id) {
        messageRepository.deleteById(id);
    }
}
