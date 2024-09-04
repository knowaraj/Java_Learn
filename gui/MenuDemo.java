package gui;

import javax.swing.*;
import java.awt.*;

public class MenuDemo extends JFrame {
    MenuDemo() {
        JMenuBar jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("Help");

        jMenuBar.add(m1);
        jMenuBar.add(m2);
        jMenuBar.add(m3);

        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Save");
        JMenu export = new JMenu("Export");
        JMenuItem i4 = new JMenuItem("Export as PDF");
        JMenuItem i5 = new JMenuItem("Export as PNG");
        export.add(i4);
        export.add(i5);
         m1.add(i1);
         m1.add(i2);
         m1.add(export);


         JDialog dialog = new JDialog(this);
         dialog.setLayout(new FlowLayout());
         dialog.add(new JButton("My Button"));
         dialog.setSize(200, 200);
         dialog.setVisible(true);
         setSize(400, 400);
         setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
