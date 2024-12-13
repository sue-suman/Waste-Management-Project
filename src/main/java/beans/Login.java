package beans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton buttonWT,buttonWT1,buttonWT2,buttonWT3,buttonWT4;

    public Login() {
        this.setLayout(null);
        this.setSize(1150, 650);
        this.setVisible(true);
        this.setTitle("A STEP TO LOVE OUR MOTHER EARTH");
        this.setLocation(200, 75);
        Color bgc = new Color(191, 194, 149);
        this.getContentPane().setBackground(bgc);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("WELCOME TO YOUR FIRST STEP ");
        text.setBounds(360, 100, 1000, 60);
        text.setFont(new Font("Railway", Font.BOLD, 43));
        this.add(text);
        this.setVisible(true);
        JLabel text0 = new JLabel("TOWARDS CLEAN AND");
        text0.setBounds(360, 180, 1000, 60);
        text0.setFont(new Font("Railway", Font.BOLD, 43));
        this.add(text0);
        this.setVisible(true);
        JLabel text1 = new JLabel("GREEN EARTH");
        text1.setBounds(360, 260, 1000, 60);
        text1.setFont(new Font("Railway", Font.BOLD, 43));
        this.add(text1);
        this.setVisible(true);


        this.buttonWT = new JButton("To SELL");
        this.buttonWT.setBounds(00, 70, 320, 70);
        this.buttonWT.setFont(new Font("OSWALD", 1, 30));
        Color buc = new Color(152, 155, 119);
        this.buttonWT.setBackground(buc);
        this.buttonWT.addActionListener(this);
        this.add(this.buttonWT);
        this.setVisible(true);

        this.buttonWT1 = new JButton("To BUY");
        this.buttonWT1.setBounds(00, 150, 320, 70);
        this.buttonWT1.setFont(new Font("OSWALD", 1, 30));
        this.buttonWT1.setBackground(buc);
        this.buttonWT1.addActionListener(this);
        this.add(this.buttonWT1);
        this.setVisible(true);

        this.buttonWT2 = new JButton("Recycled Goods");
        this.buttonWT2.setBounds(00, 230, 320, 84);
        this.buttonWT2.setFont(new Font("OSWALD", 1, 30));
        this.buttonWT2.setBackground(buc);
        this.buttonWT2.addActionListener(this);
        this.add(this.buttonWT2);
        this.setVisible(true);

        this.buttonWT3 = new JButton("Our Store");
        this.buttonWT3.setBounds(00, 325, 320, 70);
        this.buttonWT3.setFont(new Font("OSWALD", 1, 30));
        this.buttonWT3.setBackground(buc);
        this.buttonWT3.addActionListener(this);
        this.add(this.buttonWT3);
        this.setVisible(true);

        this.buttonWT4 = new JButton("About");
        this.buttonWT4.setBounds(00, 405, 320, 70);
        this.buttonWT4.setFont(new Font("OSWALD", 1, 30));
        this.buttonWT4.setBackground(buc);
        this.buttonWT4.addActionListener(this);
        this.add(this.buttonWT4);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.buttonWT) {
            this.setVisible(false);
            new TOSELL().setVisible(true);
        }else if (ae.getSource()==this.buttonWT1){
            this.setVisible(false);
            new TOBUY().setVisible(true);
        }else if (ae.getSource()==this.buttonWT2){
            this.setVisible(false);
            new RECYCLED().setVisible(true);
        }else if (ae.getSource()==this.buttonWT3){
            this.setVisible(false);
            new STORE().setVisible(true);
        }else if (ae.getSource()==this.buttonWT4){
            this.setVisible(false);
            new ABOUT().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
