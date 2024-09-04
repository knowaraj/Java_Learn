package gui;

import javax.swing.*;

public class MyGUI extends JFrame {

    MyGUI() {
        setLayout(null);
        JLabel label = new JLabel("One");
        label.setBounds(100, 100, 50, 50);
        JButton button = new JButton("two");
        button.setBounds(200, 200, 100, 50);
        add(label);
        add(button);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
