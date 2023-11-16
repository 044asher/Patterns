package Structural.Bridge.Documents;

import Structural.Bridge.Formats.Format;

public class Letter extends Document{
    private String content;
    public Letter(Format format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public String getContent() {
        return "New Letter received: " + content;
    }
}
