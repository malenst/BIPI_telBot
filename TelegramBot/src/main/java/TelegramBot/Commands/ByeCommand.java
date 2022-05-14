package TelegramBot.Commands;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ByeCommand extends BotCommand {

    @Override
    public String getCommandName() {
        return "Пока";
    }

    @Override
    public void executeCommand(String chatId, Message message, TelegramLongPollingBot bot) {
        sendMessage(chatId, "Пока, " + message.getFrom().getFirstName(), bot);
    }
}
