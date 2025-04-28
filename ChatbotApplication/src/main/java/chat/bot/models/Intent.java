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

    public UUID getIntentId() {
        return intentId;
    }

    public String getName() {
        return name;
    }

    public float getConfidence() {
        return confidence;
    }

    public List<ResponsePattern> getPatterns() {
        return patterns;
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

    public class IntentBuilder {
        private UUID intentId;
        private String name;
        private float confidence;
        private List<ResponsePattern> patterns = new ArrayList<>();



        public IntentBuilder(Intent intent) {
            this.intentId = UUID.randomUUID();
            this.name = intent.name;
            this.confidence = intent.confidence;
        }

        public void setIntentId(UUID intentId) {
            this.intentId = intentId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setConfidence(float confidence) {
            this.confidence = confidence;
        }

        public void setPatterns(List<ResponsePattern> patterns) {
            this.patterns = patterns;
        }

        public Intent build() {
            return new Intent();
        }
    }
}
