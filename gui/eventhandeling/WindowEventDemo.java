package gui.eventhandeling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends JFrame {


    WindowEventDemo() {
        setLayout(new FlowLayout());


        addWindowListener(new WindowListener() {

            public void windowOpened(WindowEvent e) {
                System.out.println("Open");
            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("De iconfified");

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Activate");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Deactivate");
            }
        });



        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventDemo();
    }
}
