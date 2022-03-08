package travel.management.system;

import javax.swing.*;

public class Paytm extends JFrame {
    Paytm() {
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
            j.setPage("https://paytm.com");
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load, Error 404</html>");
        }

        JScrollPane js = new JScrollPane();
        getContentPane().add(js);
        setBounds(280, 80, 800, 600);
    }

    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }
}
