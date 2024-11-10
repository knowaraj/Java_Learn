package gui;

import javax.swing.*;

public class GroupLayoutDemo extends JFrame {
    GroupLayoutDemo() {
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");

        GroupLayout groupLayout = new GroupLayout(getContentPane());

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup().addComponent(btn1).addComponent(btn2).addComponent(btn3)).addComponent(btn4));

        groupLayout.setVerticalGroup(groupLayout.createParallelGroup().addGroup(groupLayout.createSequentialGroup().addComponent(btn1).addComponent(btn2).addComponent(btn3)).addComponent(btn4));


        setLayout(groupLayout);
        setSize(200, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
