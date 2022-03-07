package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable {

    Thread t1;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);

        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();

    }

    public void run() {
        try {
            Thread.sleep(3000);
            this.setVisible(false);
            new Login().setVisible(true);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();
        frame.setVisible(true);
        int x = 1;
        for (int i = 1; i < 700; i += 6, x += 5) {
            frame.setLocation(650 - (x + i) / 2, 350 - (i / 2));
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
