package TelegramBot.Commands;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface CommandExecutor {
    String getCommandName();
    void executeCommand(String chatId, Message message, TelegramLongPollingBot bot);
}
