package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class CheckPackage extends JFrame {

    CheckPackage() {
        setBounds(280, 100, 900, 600);

        String[] package1 = new String[] { "5 Days and 5 Nights", "Only Lunch", "Half Day City Tour",
                "Daily Buffet", "Welcome Drinks", "Full Day Island Cruise", "Travel Guider", "BOOK NOW",
                "SUMMER SPECIAL", "Rs 12000/-", "package1.jpg" };

        String[] package2 = new String[] { "10 Days and 10 Nights", "Lunch And Dinner", "Half Day City Tour",
                "Night Safari", "Welcome Drinks", "Full Day Island Cruise", "Travel Guider", "BOOK NOW",
                "WINTER SPECIAL", "Rs 25000/-", "package2.jpg" };

        String[] package3 = new String[] { "15 Days and 15 Nights", "BBQ Dinner", "Full Day City Tour",
                "Horse Riding", "Welcome Drinks", "Full Day Island Cruise", "Travel Guider", "BOOK NOW",
                "WINTER SPECIAL", "Rs 50000/-", "package3.jpg" };

        JTabbedPane pane = new JTabbedPane();

        JPanel p1 = createPackage(package1);
        pane.addTab("SILVER PACKAGE", null, p1);

        JPanel p2 = createPackage(package2);
        pane.addTab("GOLD PACKAGE", null, p2);

        JPanel p3 = createPackage(package3);
        pane.addTab("DIAMOND PACKAGE", null, p3);

        add(pane, BorderLayout.CENTER);
    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l2 = new JLabel(pack[0]);
        l2.setBounds(30, 40, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[1]);
        l3.setBounds(30, 80, 300, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[2]);
        l4.setBounds(30, 120, 300, 30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[3]);
        l5.setBounds(30, 160, 300, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[4]);
        l6.setBounds(30, 200, 300, 30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[5]);
        l7.setBounds(30, 240, 300, 30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[6]);
        l8.setBounds(30, 280, 300, 30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l8);

        JLabel l9 = new JLabel(pack[7]);
        l9.setBounds(30, 410, 300, 30);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[8]);
        l10.setBounds(300, 470, 300, 30);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l10);

        JLabel l11 = new JLabel(pack[9]);
        l11.setBounds(700, 465, 300, 30);
        l11.setForeground(Color.BLUE);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/" + pack[10]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 0, 500, 400);
        p1.add(l12);

        return p1;
    }

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
