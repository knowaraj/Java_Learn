package src.ExamPrac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usercolor extends JFrame implements ActionListener{
    JTextField t1;
    JLabel l1,l2;
    JButton b1;
    Usercolor(){
        setLayout(new FlowLayout());
        l2=new JLabel("Enter your color : ");
        t1= new JTextField(20);
        b1= new JButton("set");
        b1.addActionListener(this);
        l1= new JLabel();
        add(l2);
        add(t1);
        add(b1);
        add(l1);
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Usercolor();
    }
    public void actionPerformed(ActionEvent e){
        try {
            String color = t1.getText().toLowerCase();
            l2.setText("helloo");
            l2.setForeground((Color) Color.class.getField(color).get(null));
        }
        catch (Exception m){
            System.out.println("Error");

        }
    }
}
