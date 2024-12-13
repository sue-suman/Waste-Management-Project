package beans;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class STORE extends JFrame implements ActionListener {
    STORE(){
        this.setLayout(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 columns
        this.setSize(1150, 650);
        this.setTitle("Our Store - Waste Collection For MOTHER EARTH");
        this.setLocation(200, 75);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Color bgColor = new Color(191, 194, 149);
        this.getContentPane().setBackground(bgColor);

        // Main container panel with padding around items
        JPanel container = new JPanel(new BorderLayout());
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 20px padding on all sides
        container.setBackground(bgColor);


        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(bgColor);

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 16));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the store window
                new Login().setVisible(true); // Open Login frame
            }
        });
        topPanel.add(backButton);

        // Center panel with items layout
        JPanel itemsPanel = new JPanel(new GridLayout(2, 3, 20, 20)); // 2 rows, 3 columns, 10px gap
        itemsPanel.setBackground(bgColor);

        // Add store item cards to the center panel
        addStoreItem(itemsPanel, "Vermicompost", "icons/compost.png", "Natural fertilizer for your garden.");
        addStoreItem(itemsPanel, "Recycled Furniture", "icons/furniture.png", "Eco-friendly, stylish furniture.");
        addStoreItem(itemsPanel, "Eco Bags", "icons/ecobag.png", "Reusable bags for all your shopping.");
        addStoreItem(itemsPanel, "Organic Soap", "icons/soap.png", "Handmade, all-natural soap.");
        addStoreItem(itemsPanel, "Plant Pots", "icons/plantpot.png", "Biodegradable pots for your plants.");
        addStoreItem(itemsPanel, "Eco-friendly Stationery", "icons/stationery.png", "Notebooks, pens, and more.");

        // Add panels to the main container
        container.add(topPanel, BorderLayout.NORTH);
        container.add(itemsPanel, BorderLayout.CENTER);

        // Add container to the frame
        this.add(container);
        this.setVisible(true);
    }

    // Method to create a store item card and add it to the items panel
    private void addStoreItem(JPanel parentPanel, String name, String iconPath, String description) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(223, 227, 189));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15)); // Padding within each item card

        // Product image
        ImageIcon icon = new ImageIcon(new ImageIcon(iconPath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(icon);
        panel.add(imageLabel, BorderLayout.NORTH);

        // Product name
        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(nameLabel, BorderLayout.CENTER);

        // Product description
        JLabel descriptionLabel = new JLabel("<html><center>" + description + "</center></html>", SwingConstants.CENTER);
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(descriptionLabel, BorderLayout.SOUTH);

        parentPanel.add(panel);
    }

    public static void main(String[] args) {
        new STORE();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}