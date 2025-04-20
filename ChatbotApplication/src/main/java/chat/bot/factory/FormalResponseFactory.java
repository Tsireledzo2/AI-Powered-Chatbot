package chat.bot.factory;

import chat.bot.models.ResponsePattern;

public class FormalResponseFactory implements ResponseFactory {
    @Override
    public ResponsePattern createResponsePattern(String message) {
        return new ResponsePattern("Greetings. " + message);
    }
}

