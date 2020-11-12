package guiFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Create new frame from SimpleFrame
        SimpleFrame window = new SimpleFrame();

        // set close operation -> minimize, expand, close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set frame to the center of the screen
        window.setLocationRelativeTo(null);

        // show frame
        window.setVisible(true);
    }
}
