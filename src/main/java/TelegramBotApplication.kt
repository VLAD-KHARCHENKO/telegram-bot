import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow

class TelegramBotApplication

fun main(){
    ApiContextInitializer.init()
   TelegramBotsApi().registerBot(Bot())
}
  class Bot: TelegramLongPollingBot() {
      override fun getBotToken()="5054040073:AAEG5e2vIyL8HQ8kdQXf3x-paya45cMo4tc"


      override fun getBotUsername()="YakimBaits_bot"

      override fun onUpdateReceived(update: Update?) {
          if (update != null) {
              if (update.message.text=="/start") {

                  val keyboard = ReplyKeyboardMarkup()
                  keyboard.keyboard=listOf(
                      KeyboardRow().apply {
                          add(KeyboardButton(" Силікон 1.6 -2.2\""))
                      },  KeyboardRow().apply {
                          add(KeyboardButton(" Силікон 2,5 -3\""))
                      }
                  )
                  execute(SendMessage()
                      .setReplyMarkup(keyboard)
                      .setChatId(update.message.chatId)
                      .setText("Hi Vlad"))
              }
          }
          }
  }
