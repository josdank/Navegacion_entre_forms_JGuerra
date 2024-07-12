package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbie {
    public JPanel mainPanel2;
    private JLabel VIDEOjuego;
    private JLabel Libro;
    private JLabel Espacio;
    private JLabel Cocina;
    private JButton volver;
    private JButton exitButton;

    public Hobbie() {
        ImageIcon icon = new ImageIcon("src/juego.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        VIDEOjuego.setIcon(icon);

        icon = new ImageIcon("src/libros.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Libro.setIcon(icon);

        icon = new ImageIcon("src/astronomia.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Espacio.setIcon(icon);

        icon = new ImageIcon("src/cocina.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        Cocina.setIcon(icon);
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Biografía");
                frame.setContentPane(new Bibliografía().mainPanel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                JFrame hobbies_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel2);
                hobbies_frame.dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
