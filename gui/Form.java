package gui;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    Form(){
        setTitle("User Form");
        JPanel panel  = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.anchor = GridBagConstraints.WEST;

        //Accounts
        JLabel accType = new JLabel("Account Type *");
        JRadioButton pacc = new JRadioButton("Personal Account");
        JRadioButton bacc = new JRadioButton("Business Account");

        ButtonGroup bg = new ButtonGroup();
        bg.add(pacc);
        bg.add(bacc);

        JPanel accounts = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        accounts.add(pacc);
        accounts.add(bacc);
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(accType, gbc);
        gbc.gridx=1;
        panel.add(accounts, gbc);

        //First Name
        JLabel fname = new JLabel("First Name *");
        JTextField fnamea = new JTextField(25);
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(fname,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        panel.add(fnamea,gbc);

        //Last Name
        JLabel lname = new JLabel("Last Name *");
        JTextField lnamea = new JTextField(25);
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(lname,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        panel.add(lnamea,gbc);
        //Country
        JLabel country = new JLabel("Country/Region *");
        String [] items= {"United States","Nepal","Other"};
        JComboBox<String> countries = new JComboBox<>(items);
        gbc.gridx=0;
        gbc.gridy=3;
        panel.add(country,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        panel.add(countries,gbc);
        //Street1
        JLabel streeta = new JLabel("Street Address*");
        JTextField street1 = new JTextField(25);
        gbc.gridx=0;
        gbc.gridy=4;
        panel.add(streeta,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        panel.add(street1,gbc);
        //Street 2
        JLabel streetb = new JLabel("Street Address 2 ");
        JTextField street2 = new JTextField(25);
        gbc.gridx=0;
        gbc.gridy=5;
        panel.add(streetb,gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        panel.add(street2,gbc);
        //City
        JLabel city = new JLabel("City*");
        JTextField cityfield = new JTextField(25);
        gbc.gridx=0;
        gbc.gridy=6;
        panel.add(city,gbc);
        gbc.gridx=1;
        gbc.gridy=6;
        panel.add(cityfield,gbc);

        //State/province
        JLabel state = new JLabel("State/Province *");
        String [] items1= {"Select State or Province","State no 1","State no 2","Other"};
        JComboBox<String> provinces = new JComboBox<>(items1);
        gbc.gridx=0;
        gbc.gridy=7;
        panel.add(state,gbc);
        gbc.gridx=1;
        gbc.gridy=7;
        panel.add(provinces,gbc);

        //Zip/Postal
        JLabel postal = new JLabel("Zip/Postal Code*");
        JTextField zip = new JTextField(5);
        gbc.gridx=0;
        gbc.gridy=8;
        panel.add(postal,gbc);
        gbc.gridx=1;
        gbc.gridy=8;
        panel.add(zip,gbc);

        //Phone
        JLabel phone = new JLabel("Phone Number *");
        JTextField phonefield = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(phone, gbc);
        gbc.gridx = 1;
        panel.add(phonefield, gbc);

        add(panel);
        setSize(600,600);
        setVisible(true);

    }

    public static void main(String[] args) {

        new Form();
    }
}
