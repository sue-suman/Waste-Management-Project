package beans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TOBUY extends JFrame implements ActionListener {
    JButton furnitureButton, electronicsButton, clothingButton, householdButton, toysButton;

    public TOBUY() {
        this.setLayout(new GridLayout(2, 3, 20, 20)); // 2 rows, 3 columns for the categories
        this.setSize(1150, 650);
        this.setTitle("Waste Collection For MOTHER EARTH - TO BUY");
        this.setLocation(200, 75);
        this.getContentPane().setBackground(new Color(191, 194, 149));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding cards for each buying category
        addCategoryCard("Furniture", "/icons/furniture.png", furnitureButton = new JButton("Buy"));
        addCategoryCard("Electronics", "/icons/electronics.png", electronicsButton = new JButton("Buy"));
        addCategoryCard("Clothing", "/icons/clothing.png", clothingButton = new JButton("Buy"));
        addCategoryCard("Household Items", "/icons/household.png", householdButton = new JButton("Buy"));
        addCategoryCard("Toys and Books", "/icons/toys.png", toysButton = new JButton("Buy"));
    }

    private void addCategoryCard(String category, String imagePath, JButton buyButton) {
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setBackground(new Color(224, 224, 224));
        cardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Image for the category
        ImageIcon icon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cardPanel.add(imageLabel, BorderLayout.CENTER);

        // Category label
        JLabel label = new JLabel(category);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("OSWALD", Font.BOLD, 18));
        cardPanel.add(label, BorderLayout.NORTH);

        // Buy button
        buyButton.setFont(new Font("OSWALD", Font.PLAIN, 16));
        buyButton.setBackground(new Color(152, 155, 119));
        buyButton.addActionListener(this);
        buyButton.setActionCommand(category); // Set action command to identify the button
        cardPanel.add(buyButton, BorderLayout.SOUTH);

        this.add(cardPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String category = e.getActionCommand(); // Get the category from the button's action command
        JOptionPane.showMessageDialog(this, "You selected to buy: " + category);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TOBUY::new);
    }
}
