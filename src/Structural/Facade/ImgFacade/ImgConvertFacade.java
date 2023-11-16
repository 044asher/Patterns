package Structural.Facade.ImgFacade;

import Structural.Facade.UnderSystems.JPEGImageConverter;
import Structural.Facade.UnderSystems.PNGImageConverter;

import java.io.IOException;

public class ImgConvertFacade {
    private JPEGImageConverter jpegImageConverter;
    private PNGImageConverter pngImageConverter;

    public ImgConvertFacade(){
        this.jpegImageConverter = new JPEGImageConverter();
        this.pngImageConverter = new PNGImageConverter();
    }
    public void convertToJPEG(String inputFilename, String outputFilename) throws IOException {
        jpegImageConverter.convertToJPEG(inputFilename, outputFilename);
    }
    public void convertToPNG(String inputFilename, String outputFilename) throws IOException {
        pngImageConverter.convertToPNG(inputFilename, outputFilename);
    }
}
