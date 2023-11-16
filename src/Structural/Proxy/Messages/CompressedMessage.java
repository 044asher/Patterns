package Structural.Proxy.Messages;

public class CompressedMessage implements Message{
    private TelegramMessage originalMessage;
    public CompressedMessage(String content){
        this.originalMessage = new TelegramMessage(compressedContent(content));
    }
    private String compressedContent(String content){
        return "Compressed message: " + content;
    }
    @Override
    public void sendMessage() {
        originalMessage.sendMessage();
    }
}
