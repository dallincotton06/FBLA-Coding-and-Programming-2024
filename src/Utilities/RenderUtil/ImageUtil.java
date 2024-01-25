package Utilities.RenderUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtil {

    public static BufferedImage read(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static Image readAndScale(String path, int width, int height) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static Image readAndScale(String path, Dimension dimension) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return image.getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
