package com.ly.until;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class ImageUtil {
    private static String path;

    public ImageUtil(String path) {
        this.path = path;
    }

    static {
        try {
            Image image = ImageIO.read(ImageUtil.class.getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPath() {
        return path;
    }
}
