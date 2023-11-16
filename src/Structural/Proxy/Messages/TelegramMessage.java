package Structural.Proxy.Messages;

public class TelegramMessage implements Message{
    private String content;
    public TelegramMessage(String content){
        this.content = content;
    }
    @Override
    public void sendMessage() {
        System.out.println("Sending Telegram message: " + content);
    }
}
