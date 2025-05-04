package chat.bot.service;

import chat.bot.models.ResponsePattern;
import chat.bot.repository.ResponsePatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ResponsePatternService {
    private final ResponsePatternRepository responsePatternRepository;

    @Autowired
    public ResponsePatternService(ResponsePatternRepository responsePatternRepository) {
        this.responsePatternRepository = responsePatternRepository;
    }

    public void saveResponsePattern(ResponsePattern pattern) {
        responsePatternRepository.save(pattern);
    }

    public Optional<ResponsePattern> getPatternById(UUID id) {
        return responsePatternRepository.findById(id);
    }

    public List<ResponsePattern> getAllPatterns() {
        return responsePatternRepository.findAll();
    }

    public void deletePattern(UUID id) {
        responsePatternRepository.deleteById(id);
    }
}
