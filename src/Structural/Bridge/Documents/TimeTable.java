package Structural.Bridge.Documents;

import Structural.Bridge.Formats.Format;

public class TimeTable extends Document{
    private String content;
    public TimeTable(Format format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public String getContent() {
        return "Time Table: " + content;
    }
}
