package TelegramBot.Bot;

import TelegramBot.Commands.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ProjectPBot";
    }

    @Override
    public String getBotToken() {
        return "5084913614:AAH780Sy_fCXSi-Lm8hvZOuYfP5E_l--70Q";
    }

    @Override
    public void onUpdateReceived(Update update) {

        CommandExecutor[] commandExecutors = new CommandExecutor[] {
                new RandomNumberCommand(),
                new HelloCommand(),
                new ByeCommand(),
        };
        for (int i = 0; i < commandExecutors.length; i++) {
            if (commandExecutors[i].getCommandName().equals(update.getMessage().getText())) {
                commandExecutors[i].executeCommand(update.getMessage().getChat().getId().toString(), update.getMessage(), this);
            }
        }
    }

}
