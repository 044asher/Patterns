package Structural.Facade.UnderSystems;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PNGImageConverter {
    public void convertToPNG(String inputFilename, String outputFilename) throws IOException {
        BufferedImage image = ImageIO.read(new File(inputFilename));
        ImageIO.write(image, "png", new File(outputFilename));
        System.out.println("Converting " + inputFilename + " to .png");
    }
}
