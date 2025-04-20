package chat.bot.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Intent {
    private UUID intentId;
    private String name;
    private float confidence;
    private List<ResponsePattern> patterns = new ArrayList<>();

    public Intent() {
    }

    public Intent(String name, float confidence) {
        this.intentId = UUID.randomUUID();
        this.name = name;
        this.confidence = confidence;
    }

    public void addResponsePattern(ResponsePattern pattern) {
        patterns.add(pattern);
    }

    public void updateIntent(String newName, float newConfidence) {
        this.name = newName;
        this.confidence = newConfidence;
    }

    public String generateResponse() {
        if (!patterns.isEmpty()) {
            return patterns.get(0).generateResponse();
        }
        return "I'm not sure how to respond to that.";
    }
}
