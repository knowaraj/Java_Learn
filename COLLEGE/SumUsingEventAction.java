package COLLEGE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumUsingEventAction extends JFrame{
    JTextField tf1 , tf2, tf3;
    JButton jb;
    SumUsingEventAction(){
        setLayout(new FlowLayout());
         tf1 = new JTextField(10);
         tf2 = new JTextField(10);
         tf3 = new JTextField(10);
         jb = new JButton("sum");

        add(tf1);
        add(tf2);
        add(jb);
        add(tf3);
        jb.addKeyListener(new EventHandler(this));
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SumUsingEventAction();
    }

}

class EventHandler extends KeyAdapter{

    SumUsingEventAction obj;

    public EventHandler(SumUsingEventAction obj) {
        this.obj = obj;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int text = Integer.valueOf(obj.tf1.getText()) + Integer.valueOf(obj.tf2.getText());
        obj.tf3.setText(String.valueOf(text));
    }
}
