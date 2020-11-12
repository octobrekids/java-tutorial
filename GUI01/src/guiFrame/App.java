package guiFrame;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        // Create new frame from SimpleFrame
        SimpleFrame window = new SimpleFrame("Hello World");

        // declare button
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Save");

        // set layout from left to right and at the center
        window.setLayout(new FlowLayout());

        window.add(button1);
        window.add(button2);

        // set close operation -> minimize, expand, close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set frame to the center of the screen
        window.setLocationRelativeTo(null);

        // show frame
        window.setVisible(true);
    }
}
