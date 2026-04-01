import ru.max.bot.api.MaxBotAPI;
import ru.max.bot.api.SendMessageQuery;
import ru.max.bot.types.message.NewMessageBody;
import ru.max.bot.types.message.NewMessageBodyBuilder;
import ru.max.bot.types.update.Update;

public class MinimalBot {
    public static void main(String[] args) {
        String token = "ВАШ_ТОКЕН";
        MaxBotAPI api = MaxBotAPI.create(token);
        
        // Получаем обновления (polling)
        // Примечание: требуется реализовать цикл получения обновлений
        
        Long chatId = 123456789L; // ID чата пользователя
        
        // Отправляем сообщение
        NewMessageBody message = NewMessageBodyBuilder
            .ofText("Привет мир!")
            .build();
        
        SendMessageQuery query = api.sendMessage(message).chatId(chatId);
        query.enqueue(); // асинхронная отправка
    }
}