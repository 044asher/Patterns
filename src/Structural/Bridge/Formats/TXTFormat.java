package Structural.Bridge.Formats;

public class TXTFormat implements Format {
    @Override
    public String format(String content) {
        return "New TXT File: " + content;
    }
}
