package Structural.Bridge.Documents;

import Structural.Bridge.Formats.Format;

public class Report extends Document{
   private String content;

    public Report(Format format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public String getContent() {
        return "Report: " + content;
    }
}
