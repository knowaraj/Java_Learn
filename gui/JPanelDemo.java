package gui;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    JPanelDemo() {
        setLayout(new GridLayout(0, 1));
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JButton("North"),  BorderLayout.NORTH);
        p1.add(new JButton("South"),  BorderLayout.SOUTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout());
        p2.add(new JButton("b1"));
        p2.add(new JButton("b2"));
        p2.add(new JButton("b3"));
        add(p1);
        add(p2);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }

}
