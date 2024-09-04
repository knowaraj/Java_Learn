package gui;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.HORIZONTAL;

public class GridBagDemo extends JFrame {

    GridBagDemo() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx= 0;
        gbc.gridy =0;
        JButton btn1 = new JButton("One");
        add(btn1,gbc);

        gbc.gridx=1;
        gbc.gridy = 0;
        JButton btn2 = new JButton("two");
        add(btn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton btn3 = new JButton("Three");
        add(btn3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JButton btn4 = new JButton("Four");
        add(btn4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        JButton btn5 = new JButton("Five");
        add(btn5, gbc);

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
      new  GridBagDemo();
    }
}
