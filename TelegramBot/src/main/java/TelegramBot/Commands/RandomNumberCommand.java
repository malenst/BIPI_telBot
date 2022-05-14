package TelegramBot.Commands;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Random;

public class RandomNumberCommand extends BotCommand {

    @Override
    public void executeCommand(String chatId, Message message, TelegramLongPollingBot bot) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        sendMessage(chatId, "Случайное число: " + randomNumber, bot);
    }

    @Override
    public String getCommandName() {
        return "Рандом";
    }



}
