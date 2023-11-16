package Structural.Bridge;

import Structural.Bridge.Documents.Document;
import Structural.Bridge.Documents.Letter;
import Structural.Bridge.Documents.Report;
import Structural.Bridge.Documents.TimeTable;
import Structural.Bridge.Formats.HTMLFormat;
import Structural.Bridge.Formats.PDFFormat;
import Structural.Bridge.Formats.TXTFormat;
import Structural.Bridge.Formats.Format;

public class Formatting {
    public static void main(String[] args) {
        Format HTMLFormat = new HTMLFormat();
        Format TXTFormat = new TXTFormat();
        Format PDFFormat = new PDFFormat();

        Document report = new Report(HTMLFormat, "This is a report about patterns.");
        Document letter = new Letter(TXTFormat, "Greetings my Friend.");
        Document timeTable = new TimeTable(PDFFormat, "on Saturday at 10.30 you have meeting. Don`t forget about it!");

        System.out.println(report.getFormattedContent());
        System.out.println(letter.getFormattedContent());
        System.out.println(timeTable.getFormattedContent());
    }
}
