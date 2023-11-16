package Structural.Bridge.Formats;

public class PDFFormat implements Format {
    @Override
    public String format(String content) {
        return "PDF: " + content;
    }
}
