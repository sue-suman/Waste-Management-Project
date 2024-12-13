package beans;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TOSELL extends JFrame implements ActionListener {

    JButton buttonWT,buttonWT1,buttonWT2,buttonWT3,buttonWT4;
    JButton metalB,electronicB,clothesB,plasticsB,foodB,othersB;

    TOSELL(){
        this.setLayout(null);
        this.setSize(1150, 650);
        this.setVisible(true);
        this.setTitle("A STEP TO LOVE OUR MOTHER EARTH");
        this.setLocation(200, 75);
        Color bgc = new Color(191, 194, 149);
        this.getContentPane().setBackground(bgc);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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


        //Page
        JLabel text = new JLabel("Choose from the options below... ");
        text.setBounds(390, 65, 1000, 60);
        text.setFont(new Font("Railway", Font.BOLD, 38));
        this.add(text);
        this.setVisible(true);

        Color bb = new Color(243, 238, 223);

        this.metalB=new JButton("Metal Waste");
        this.metalB.setBounds(390,150,200,110);
        this.metalB.setFont(new Font("OSWALD", 1, 25));
        this.metalB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.metalB.setBackground(bb);
        this.metalB.addActionListener(this);
        this.add(this.metalB);
        this.setVisible(true);

        this.electronicB=new JButton("Electronic Waste");
        this.electronicB.setBounds(620,150,220,110);
        this.electronicB.setFont(new Font("OSWALD", 1, 25));
        this.electronicB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.electronicB.setBackground(bb);
        this.electronicB.addActionListener(this);
        this.add(this.electronicB);
        this.setVisible(true);

        this.plasticsB=new JButton("Plastic Waste");
        this.plasticsB.setBounds(870,150,200,110);
        this.plasticsB.setFont(new Font("OSWALD", 1, 25));
        this.plasticsB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.plasticsB.setBackground(bb);
        this.plasticsB.addActionListener(this);
        this.add(this.plasticsB);
        this.setVisible(true);

        this.clothesB=new JButton("Cloth Waste");
        this.clothesB.setBounds(390,290,200,110);
        this.clothesB.setFont(new Font("OSWALD", 1, 25));
        this.clothesB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.clothesB.setBackground(bb);
        this.clothesB.addActionListener(this);
        this.add(this.clothesB);
        this.setVisible(true);

        this.foodB=new JButton("Food Waste");
        this.foodB.setBounds(620,290,220,110);
        this.foodB.setFont(new Font("OSWALD", 1, 25));
        this.foodB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.foodB.setBackground(bb);
        this.foodB.addActionListener(this);
        this.add(this.foodB);
        this.setVisible(true);

        this.othersB=new JButton("Others");
        this.othersB.setBounds(870,290,200,110);
        this.othersB.setFont(new Font("OSWALD", 1, 25));
        this.othersB.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.othersB.setBackground(bb);
        this.othersB.addActionListener(this);
        this.add(this.othersB);
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
        new TOSELL();
    }
}