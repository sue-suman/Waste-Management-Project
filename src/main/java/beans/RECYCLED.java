package beans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RECYCLED extends JFrame implements ActionListener {
    JButton compostButton, plasticProductsButton, metalProductsButton, glassProductsButton, woodProductsButton;

    public RECYCLED() {
        this.setLayout(new GridLayout(2, 3, 20, 20)); // 2 rows, 3 columns for the categories
        this.setSize(1150, 650);
        this.setTitle("Waste Collection For MOTHER EARTH - RECYCLED PRODUCTS");
        this.setLocation(200, 75);
        this.getContentPane().setBackground(new Color(191, 194, 149));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding cards for each recycled category
        addCategoryCard("Compost & Fertilizers", "icons/compost.png", compostButton = new JButton("Buy"));
        addCategoryCard("Plastic Products", "icons/plastic.png", plasticProductsButton = new JButton("Buy"));
        addCategoryCard("Metal Products", "icons/metal.png", metalProductsButton = new JButton("Buy"));
        addCategoryCard("Glass Products", "icons/glass.png", glassProductsButton = new JButton("Buy"));
        addCategoryCard("Wood Products", "icons/wood.png", woodProductsButton = new JButton("Buy"));
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
        SwingUtilities.invokeLater(RECYCLED::new);
    }
}