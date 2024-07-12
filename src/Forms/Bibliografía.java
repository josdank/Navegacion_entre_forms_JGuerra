package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bibliografía {
    private JTextPane miNombreEsJosuéTextPane;
    private JButton volverLoginButton;
    private JButton avanzarHobbiesButton;
    private JLabel img3;
    public JPanel mainPanel1;
    private JLabel img5;
    private JLabel img6;

    public Bibliografía() {
        ImageIcon icon = new ImageIcon("src/personal.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH));
        img3.setIcon(icon);
        icon = new ImageIcon("src/channels4_profile.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
        img5.setIcon(icon);

        icon = new ImageIcon("src/channels4_profile.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
        img6.setIcon(icon);

        volverLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Biografía");
                frame.setContentPane(new login().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JFrame hobbies_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel1);
                hobbies_frame.dispose();
            }
        });
        avanzarHobbiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Biografía");
                frame.setContentPane(new Hobbie().mainPanel2);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JFrame hobbies_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel1);
                hobbies_frame.dispose();
            }
        });
    }

    public void setVisible(boolean b) {
    }
}
