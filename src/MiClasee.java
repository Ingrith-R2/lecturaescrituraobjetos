import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MiClasee {
    JPanel rootpanel;
    private JLabel nombre;
    private JButton SAVEBOTON;
    private JFormattedTextField txto1;
    private JFormattedTextField texto2;
    private JFormattedTextField texto3;
    private JButton btoGuardar;
    int i = 0;

public MiClasee() {
    btoGuardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    SAVEBOTON.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

}
    public static void main(String[] args) {
        JFrame frame = new JFrame("MiClasee");
        frame.setContentPane(new MiClasee().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}