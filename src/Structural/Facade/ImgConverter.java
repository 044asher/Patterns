package Structural.Facade;

import Structural.Facade.ImgFacade.ImgConvertFacade;

import java.io.IOException;

public class ImgConverter {
    public static void main(String[] args) throws IOException {
        ImgConvertFacade imgConvertFacade = new ImgConvertFacade();
        String inputFilename = "example.jpg";
        String outputFilenameJPG = "example_neew.jpg";
        String outputFilenamePNG = "example_new.png";

        imgConvertFacade.convertToJPEG(inputFilename, outputFilenameJPG);
        imgConvertFacade.convertToPNG(inputFilename, outputFilenamePNG);
    }
}
