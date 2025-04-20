package chat.bot.models;

import java.util.UUID;

public class ResponsePattern {
    private UUID patternId;
    private String text;

    public UUID getPatternId() {
        return patternId;
    }

    public String getText() {
        return text;
    }

    public ResponsePattern() {
    }

    public ResponsePattern(String text) {
        this.patternId = UUID.randomUUID();
        this.text = text;
    }

    public String generateResponse() {
        return text;
    }

    public class ResponsePatternBuilder {
        private UUID patternId;
        private String text;

        public ResponsePatternBuilder(ResponsePattern responsePattern) {
            this.patternId = responsePattern.patternId;
            this.text = responsePattern.text;
        }

        public void setPatternId(UUID patternId) {
            this.patternId = patternId;
        }

        public void setText(String text) {
            this.text = text;
        }

        public ResponsePattern build(){
            return new ResponsePattern();
        }
    }
}
