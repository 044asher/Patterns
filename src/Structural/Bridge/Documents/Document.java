package Structural.Bridge.Documents;

import Structural.Bridge.Formats.Format;

public abstract class Document {
    private Format format;
    public Document(Format format){
        this.format = format;
    }
    public abstract String getContent();
    public String getFormattedContent(){
        return format.format(getContent());
    }
}
