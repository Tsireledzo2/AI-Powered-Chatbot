package chat.bot.factory;

import chat.bot.models.ResponsePattern;

public interface ResponseFactory {
    ResponsePattern createResponsePattern(String message);
}

