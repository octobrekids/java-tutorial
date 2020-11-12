package guiFrame;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        // Create new frame from SimpleFrame
        SimpleFrame window = new SimpleFrame("Hello World");

        // declare radiobutton group
        ButtonGroup group = new ButtonGroup();

        JRadioButton r1 = new JRadioButton("Programmer", false);
        JRadioButton r2 = new JRadioButton("Accountant", false);
        JRadioButton r3 = new JRadioButton("Engineer", false);

        // add radio to group
        group.add(r1);
        group.add(r2);
        group.add(r3);

        // declare label
        JLabel label = new JLabel();
        label.setText("Hello ka");

        // declare button
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Save");

        // set layout from left to right and at the center
        window.setLayout(new FlowLayout());

        window.add(label);
        window.add(button1);
        window.add(button2);

        // add radio to frame
        window.add(r1);
        window.add(r2);
        window.add(r3);

        // set close operation -> minimize, expand, close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set frame to the center of the screen
        window.setLocationRelativeTo(null);

        // show frame
        window.setVisible(true);
    }
}
