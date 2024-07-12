import javax.swing.*;

import Forms.Bibliografía;
import Forms.Hobbie;
import Forms.login;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setContentPane(new login().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}