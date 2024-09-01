package gui;
import javax.swing.*;
import java.awt.*;
public class MixedUI extends JFrame {
    MixedUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("All in one");
        setSize(900,900);
        setVisible(true);
        setLayout(new FlowLayout());
        JLabel l = new JLabel("Label Here");
        ImageIcon i = new ImageIcon("user.png");
        JLabel l1 = new JLabel(i);
        JTextField textf = new JTextField(15);
        JTextArea textarea = new JTextArea(15,15);
        JPasswordField pass = new JPasswordField( 15);
        JCheckBox cb = new JCheckBox("I agree the terms and conditions");
        JRadioButton rb = new JRadioButton("Male");
        JRadioButton rb1 = new JRadioButton("FeMale");
        JRadioButton rb2 = new JRadioButton("Other");
        ButtonGroup group = new ButtonGroup();
        String [] items= {"Math","English","Java"};
        JComboBox <String> combo = new JComboBox<>(items);
        group.add(rb);
        group.add(rb1);
        group.add(rb2);
        add(combo);
        add(cb);
        add(rb);
        add(rb1);
        add(rb2);
        add(l);
        add(l1);
        add(textf);
        add(textarea);
        add(pass);

    }

    public static void main(String[] args) {
        new MixedUI();
    }
}
