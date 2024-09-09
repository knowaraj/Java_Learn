package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener {

    JRadioButton pacc, bacc;
    JTextArea info;
    JTextField fnamea, lnamea, street1, street2, cityfield, zip, phonefield;
    JComboBox<String> countries, provinces;

    Form() {
        setTitle("User Form");
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.anchor = GridBagConstraints.WEST;

        // Account type
        JLabel accType = new JLabel("Account Type *");
        pacc = new JRadioButton("Personal Account");
        bacc = new JRadioButton("Business Account");

        ButtonGroup bg = new ButtonGroup();
        bg.add(pacc);
        bg.add(bacc);

        JPanel accounts = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        accounts.add(pacc);
        accounts.add(bacc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(accType, gbc);
        gbc.gridx = 1;
        panel.add(accounts, gbc);

        // First Name
        JLabel fname = new JLabel("First Name *");
        fnamea = new JTextField(25);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(fname, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(fnamea, gbc);

        // Last Name
        JLabel lname = new JLabel("Last Name *");
        lnamea = new JTextField(25);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lname, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(lnamea, gbc);

        // Country
        JLabel country = new JLabel("Country/Region *");
        String[] items = {"United States", "Nepal", "Other"};
        countries = new JComboBox<>(items);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(country, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(countries, gbc);

        // Street1
        JLabel streeta = new JLabel("Street Address*");
        street1 = new JTextField(25);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(streeta, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(street1, gbc);

        // Street 2
        JLabel streetb = new JLabel("Street Address 2 ");
        street2 = new JTextField(25);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(streetb, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(street2, gbc);

        // City
        JLabel city = new JLabel("City*");
        cityfield = new JTextField(25);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(city, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(cityfield, gbc);

        // State/Province
        JLabel state = new JLabel("State/Province *");
        String[] items1 = {"Select State or Province", "State no 1", "State no 2", "Other"};
        provinces = new JComboBox<>(items1);
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(state, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(provinces, gbc);

        // Zip/Postal
        JLabel postal = new JLabel("Zip/Postal Code*");
        zip = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(postal, gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(zip, gbc);

        // Phone
        JLabel phone = new JLabel("Phone Number *");
        phonefield = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(phone, gbc);
        gbc.gridx = 1;
        panel.add(phonefield, gbc);

        // Info text area
        info = new JTextArea(10, 30);
        info.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(info,gbc);

        // Submit button
        JButton submit = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 10;
        panel.add(submit, gbc);
        submit.addActionListener(this);

        add(panel);
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Form();
    }

    public void actionPerformed(ActionEvent e) {
        String accountType = pacc.isSelected() ? "Personal Account" : "Business Account";
        String firstName = fnamea.getText();
        String lastName = lnamea.getText();
        String streetAddress1 = street1.getText();
        String streetAddress2 = street2.getText();
        String city = cityfield.getText();
        String selectedCountry = (String) countries.getSelectedItem();
        String stateProvince = (String) provinces.getSelectedItem();
        String postalCode = zip.getText();
        String phoneNumber = phonefield.getText();
        info.setText("Account Type: " + accountType + "\n"
                + "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Street Address 1: " + streetAddress1 + "\n"
                + "Street Address 2: " + streetAddress2 + "\n"
                + "City: " + city + "\n"
                + "Country: " + selectedCountry + "\n"
                + "State/Province: " + stateProvince + "\n"
                + "Postal Code: " + postalCode + "\n"
                + "Phone Number: " + phoneNumber + "\n");
    }
}
