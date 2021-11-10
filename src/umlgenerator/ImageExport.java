/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.view.ContextConfigurator;
import com.yworks.yfiles.view.GraphControl;
import com.yworks.yfiles.view.PixelImageExporter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author charl
 */
public class ImageExport {
    public void exportToJpg(GraphControl graphControl, String filename) {
        // create a ContextConfigurator that specifies the region to export
        ContextConfigurator configuration = new ContextConfigurator(graphControl.getContentRect());

        // create and configure a PixelImageExporter
        PixelImageExporter exporter = new PixelImageExporter(configuration);

        try {
            // export the region to a javafx.scene.image.Image
            Image image = exporter.exportToBitmap(graphControl);

            // convert it to a AWT image to use ImageIO
            BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);
            BufferedImage bufferedImageRGB = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.OPAQUE);
            Graphics2D graphics = bufferedImageRGB.createGraphics();
            graphics.drawImage(bufferedImage, 0, 0, null);
            bufferedImage = bufferedImageRGB;
            
            // write it to a JPG file
            filename += ".jpg";
            FileOutputStream stream = new FileOutputStream(filename);
            ImageIO.write(bufferedImage, "jpg", stream);
            stream.close();
        } catch (IOException e) {
            // handle exception
            System.out.println(e);
        }   
    }
}
