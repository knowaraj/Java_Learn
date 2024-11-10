package gui;

import javax.swing.*;
import java.awt.*;

public class FirstGUI extends JFrame{

    FirstGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My title");
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("test.png");
        JLabel label1 = new JLabel("First");
        JLabel label2 = new JLabel("Second");
        JLabel label3 = new JLabel(icon);
        JTextField tf = new JTextField("test");
        tf.setForeground(Color.RED);
        add(tf);
        add(label1);
        add(label2);
        add(label3);
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstGUI();
    }
}
