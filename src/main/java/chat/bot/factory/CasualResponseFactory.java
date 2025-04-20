package chat.bot.factory;

import chat.bot.models.ResponsePattern;

public class CasualResponseFactory implements ResponseFactory {
    @Override
    public ResponsePattern createResponsePattern(String message) {
        return new ResponsePattern("Hey! " + message);
    }
}

