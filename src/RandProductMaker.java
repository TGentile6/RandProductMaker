import javax.swing.*;
import java.awt.*;

public class RandProductMaker {
    public static void main(String[] args) {
        //get the dimension of the screen resolution
        double dHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double dWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        //create and int value for 3/4ths the width and height of the screen resolution
        int height = ((int)(dHeight * .5));
        int width = ((int)(dWidth * .5));

        //create a JFrame using FortuneTellerFrame
        JFrame frame = new RPMakerFrame();
        frame.setTitle("Product Maker");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
