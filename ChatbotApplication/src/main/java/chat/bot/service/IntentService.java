package chat.bot.service;

import chat.bot.models.Intent;
import chat.bot.repository.IntentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class IntentService {

    private final IntentRepository intentRepository;

    @Autowired
    public IntentService(IntentRepository intentRepository) {
        this.intentRepository = intentRepository;
    }

    public void saveIntent(Intent intent) {
        intentRepository.save(intent);
    }

    public Optional<Intent> getIntentById(UUID id) {
        return intentRepository.findById(id);
    }

    public List<Intent> getAllIntents() {
        return intentRepository.findAll();
    }

    public void deleteIntent(UUID id) {
        intentRepository.deleteById(id);
    }
}
