package Structural.Bridge.Formats;

public class HTMLFormat implements Format {
    @Override
    public String format(String content) {
        return "HTML page: " + content;
    }
}
