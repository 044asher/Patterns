package Structural.Facade.UnderSystems;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPEGImageConverter {
    public void convertToJPEG(String inputFilename, String outputFilename) throws IOException {
        BufferedImage image = ImageIO.read(new File(inputFilename));
        ImageIO.write(image, "jpg", new File(outputFilename));
        System.out.println("Converting " + inputFilename + " to .jpg");
    }
}
