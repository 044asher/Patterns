package Structural.Proxy;

import Structural.Proxy.Messages.CompressedMessage;
import Structural.Proxy.Messages.Message;
import Structural.Proxy.Messages.TelegramMessage;

public class TelegramClient {
    public static void main(String[] args) {
        Message originalMessage = new TelegramMessage("Hello everyone!");
        originalMessage.sendMessage();

        Message compressedMessage = new CompressedMessage("Hi, how are you?");
        compressedMessage.sendMessage();
    }
}
