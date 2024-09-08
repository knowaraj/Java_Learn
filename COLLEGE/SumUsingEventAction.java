package COLLEGE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumUsingEventAction extends JFrame {
    SumUsingEventAction(){
        setLayout(new FlowLayout());
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JTextField tf3 = new JTextField(10);
        JLabel label = new JLabel();
        JButton jb = new JButton("sum");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = tf1.getText();
                Integer num1 = Integer.valueOf(a);

                String b = tf2.getText();
                Integer num2 = Integer.valueOf(b);

                Integer num3 = num1+num2;
                String c = String.valueOf(num3);
                label.setText(" The sum is "+ c);
            }
        });
        add(tf1);
        add(tf2);
        add(tf3);
        add(jb);
        add(label);
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SumUsingEventAction();
    }
}
