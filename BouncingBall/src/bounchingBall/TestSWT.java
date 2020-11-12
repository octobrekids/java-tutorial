package bounchingBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestSWT extends JFrame{
    private JTextField textField;
    private JLabel label;
    private final JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
    private int angleX = 1;
    private int angleY = 1;
    private int speed = 10;

    TestSWT() {
        initialize();
    }

    public TestSWT(String title){
        super(title);
    }

    public void initialize() {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        this.internalFrame.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText(internalFrame.getBounds().toString());
            }
        });
        internalFrame.setBounds(10,55,420,200);

        frame.getContentPane().add(this.internalFrame);
        internalFrame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10,0,514,4);

        Points p = new Points(10,10,2,Color.red);
        p.setBounds(p.getX(),p.getY(),p.getSize().height,p.getSize().width);
        internalFrame.getContentPane().add(p);

        final Circle cir = new Circle(250,200,20,Color.blue);
        cir.setBounds(cir.getX(),cir.getY(),cir.getDiameter(),cir.getDiameter());
        internalFrame.getContentPane().add(cir);
        internalFrame.setVisible(true);


        label = new JLabel("Boundary");
        panel.add(label);

        textField = new JTextField(25);
        panel.add(textField);
        textField.setText("here" + p.getLocation());

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method sub
                Dimension size = internalFrame.getSize();
                Insets insets = internalFrame.getInsets();

                int w = size.width - insets.left - insets.right;
                int h = size.height - insets.top - insets.bottom;

                int cirDiameter = cir.getDiameter();
                int BOX_WIDTH = internalFrame.getWidth();
                int BOX_HEIGHT = internalFrame.getHeight();
                int cirX = cir.getX();
                int cirY = cir.getY();

                if(cirX + angleX < 0){
                    angleX = speed;
                }
                else if(cirX + angleX > BOX_WIDTH - 50){
                    angleX = -speed;
                }
                else if(cirY + angleY < 0){
                    angleY = speed;
                }
                else if(cirY + angleY > BOX_HEIGHT - 50){
                    angleY = -speed;
                }
                cirX = cirX + angleX;
                cirY = cirY + angleY;
                cir.setLocation(cirX,cirY);
            }
        };
        Timer displayTimer = new Timer(50, listener);
        displayTimer.start();
    }



}
