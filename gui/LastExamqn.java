package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LastExamqn extends JFrame implements ActionListener {
    JButton order;
    JCheckBox pizza,burger,tea;
    JLabel jb;

    LastExamqn(){
        JPanel jp = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3,3,3,3);
        gbc.anchor = GridBagConstraints.WEST;
        jb = new JLabel("FOOD ORDERING SYSTEM");
        gbc.gridx=1;
        gbc.gridy=0;
        jp.add(jb,gbc);

        pizza = new JCheckBox("Pizza @100");
        gbc.gridx=1;
        gbc.gridy=1;
        jp.add(pizza,gbc);
        burger = new JCheckBox("Burger @50");
        gbc.gridx=1;
        gbc.gridy=2;
        jp.add(burger,gbc);
        tea = new JCheckBox("Tea @30");
        gbc.gridx=1;
        gbc.gridy=3;
        jp.add(tea,gbc);

        order = new JButton("Order");
        gbc.gridx=1;
        gbc.gridy=4;
        jp.add(order,gbc);
        order.addActionListener(this);
        add(jp);
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LastExamqn();
    }
    public void actionPerformed(ActionEvent e){

        int total = 0;
        StringBuilder bill = new StringBuilder("Bill :\n");

        if (pizza.isSelected()) {
            total += 100;
            bill.append("Pizza @100\n");
        }
        if (burger.isSelected()) {
            total += 50;
            bill.append("Burger @50\n");
        }
        if (tea.isSelected()) {
            total += 50;
            bill.append("Tea @30\n");
        }
        bill.append("\nTotal Amount: " + total);
        JOptionPane.showMessageDialog(null, bill);
    }

}
