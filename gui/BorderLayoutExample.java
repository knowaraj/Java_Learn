package gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    BorderLayoutExample() {
        setLayout(new BorderLayout());
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
