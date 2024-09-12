package gui.eventhandeling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerDemo extends JFrame {

    MouseListenerDemo() {
        setLayout(new FlowLayout());
        JButton btn1 = new JButton("Click Me");
        JLabel label = new JLabel();
        add(btn1); add(label);
        btn1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                label.setText("Entered");
            }
            public void mouseExited(MouseEvent e) {
                label.setText("Exited");

            }
            public void mouseClicked(MouseEvent e) {
                label.setText("Clicked");
            }
        });
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}
