package gui.eventhandeling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPerformedDemo extends JFrame {

    ActionPerformedDemo() {
        setLayout(new FlowLayout());
        JButton button = new JButton("My Button");
        JTextField tf = new JTextField(10);
        add(tf);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String upperCase = tf.getText().toUpperCase();
                tf.setText(upperCase);
            }
        });

        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ActionPerformedDemo();
    }

}
