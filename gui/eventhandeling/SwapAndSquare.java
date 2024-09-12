package gui.eventhandeling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwapAndSquare extends JFrame implements ActionListener {
    JTextField num1, num2;
    JButton swap, square;
    JLabel errorLabel;

    SwapAndSquare() {
        setLayout(new FlowLayout());
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        swap = new JButton("Swap");
        square = new JButton("Square");

        square.addActionListener(this);
        swap.addActionListener(this);

        add(num1);add(num2);
        add(square);add(swap);
        errorLabel = new JLabel();
        add(errorLabel);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwapAndSquare();
    }


    public void actionPerformed(ActionEvent event) {

        try{
            int n1 = Integer.valueOf(num1.getText());
            int n2 = Integer.valueOf(num2.getText());

            if(event.getSource() == swap) {
                String temp = num1.getText();

                num1.setText(num2.getText());
                num2.setText(temp);
            } else {
                num1.setText(String.valueOf(n1 * n1));
                num2.setText(String.valueOf(n2 * n2));
            }
        } catch (NumberFormatException e) {
            errorLabel.setForeground(Color.red);
            errorLabel.setText("Invalid input");
        }

    }
}
