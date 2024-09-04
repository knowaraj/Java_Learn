package gui;

import javax.swing.*;

public class FileChooserDemo extends JFrame {

    FileChooserDemo() {
        JFileChooser jFileChooser = new JFileChooser();
        add(jFileChooser);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FileChooserDemo();
    }
}
