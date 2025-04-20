package chat.bot.factory;

public class TextMessageProcessor implements MessageProcessor {
    @Override
    public void process(String message) {
        System.out.println("Processing text message: " + message);
    }
}

