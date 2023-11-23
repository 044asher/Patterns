package Structural.Bridge.Documents;

import Structural.Bridge.Formats.Format;

public abstract class Document {
    private Format format;
    public Document(Format format){
        this.format = format;
    }
    public abstract String getContent();

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getFormattedContent(){
        return format.format(getContent());
    }
}
