package gui.eventhandeling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumClear extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;
    JButton btn1, btn2;

    SumClear() {
        setLayout(new FlowLayout());
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        btn1 = new JButton("Add");
        btn1.setActionCommand("add");
        btn2 = new JButton("Clear");
        btn2.setActionCommand("clear");

        add(tf1); add(tf2); add(btn1); add(btn2); add(tf3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SumClear();
    }


    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(btn1)) {
            int sum = Integer.valueOf(tf1.getText()) + Integer.valueOf(tf2.getText());
            tf3.setText(String.valueOf(sum));
        } else {
            tf3.setText("");
            tf2.setText("");
            tf1.setText("");

        }
    }
}
