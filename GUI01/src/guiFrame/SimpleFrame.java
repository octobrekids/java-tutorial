package guiFrame;

import javax.swing.*;

// inherit from JFrame to use the method
public class SimpleFrame extends JFrame {
    // declare width, height
    public static final int WIDTH=500;
    public static final int HEIGHT=400;
    // Constructor
    SimpleFrame() {
        setTitle("Hello");
        setSize(WIDTH,HEIGHT);
    }
}
