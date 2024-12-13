package beans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListSELL extends JFrame implements ActionListener {

    private JTextField itemNameField, itemPriceField;
    private JTextArea itemDescriptionArea;
    private JComboBox<String> categoryDropdown;
    private JButton submitButton, backButton;

    public ListSELL() {
        setTitle("Sell Your Items");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(210, 225, 195));

        JLabel titleLabel = new JLabel("List Your Item for Sale");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(150, 20, 300, 30);
        add(titleLabel);

        JLabel itemNameLabel = new JLabel("Item Name:");
        itemNameLabel.setBounds(50, 80, 100, 25);
        add(itemNameLabel);

        itemNameField = new JTextField();
        itemNameField.setBounds(150, 80, 300, 25);
        add(itemNameField);

        JLabel itemPriceLabel = new JLabel("Price:");
        itemPriceLabel.setBounds(50, 120, 100, 25);
        add(itemPriceLabel);

        itemPriceField = new JTextField();
        itemPriceField.setBounds(150, 120, 300, 25);
        add(itemPriceField);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setBounds(50, 160, 100, 25);
        add(categoryLabel);

        // Dropdown for category selection
        String[] categories = {"Metal", "Electronic", "Clothes", "Plastics", "Food", "Others"};
        categoryDropdown = new JComboBox<>(categories);
        categoryDropdown.setBounds(150, 160, 300, 25);
        add(categoryDropdown);

        JLabel itemDescriptionLabel = new JLabel("Description:");
        itemDescriptionLabel.setBounds(50, 200, 100, 25);
        add(itemDescriptionLabel);

        itemDescriptionArea = new JTextArea();
        itemDescriptionArea.setBounds(150, 200, 300, 100);
        itemDescriptionArea.setLineWrap(true);
        itemDescriptionArea.setWrapStyleWord(true);
        add(itemDescriptionArea);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 320, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        backButton = new JButton("Back");
        backButton.setBounds(270, 320, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String itemName = itemNameField.getText();
            String itemPrice = itemPriceField.getText();
            String category = (String) categoryDropdown.getSelectedItem();
            String itemDescription = itemDescriptionArea.getText();

            // Call a method to save these details using Hibernate
            saveItemToDatabase(itemName, itemPrice, category, itemDescription);

            JOptionPane.showMessageDialog(this, "Item submitted successfully!");
        } else if (e.getSource() == backButton) {
            this.dispose();
            new Login().setVisible(true);
        }
    }

    private void saveItemToDatabase(String itemName, String itemPrice, String category, String itemDescription) {
        Item item = new Item(itemName, Double.parseDouble(itemPrice), category, itemDescription);
        hibernateUtil.saveItem(item);
    }

    public static void main(String[] args) {
        new ListSELL();
    }
}
