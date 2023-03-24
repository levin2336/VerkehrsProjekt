import abiturklassen.SuchBaumZeichner;
import ifl1.Zaehlung;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KfZErfassung extends JFrame {
    private JPanel pnMain;
    private JButton btCar;
    private JButton btTruck;
    private JButton btBike;
    private JTextField tfOrt;
    private JLabel lbText;

    private final Zaehlung model;

    public KfZErfassung() {
        model = new Zaehlung();

        setContentPane(pnMain);
        setTitle("KFZ Erfassung");
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carButtonPressed(e);
            }
        });
        btTruck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                truckButtonPressed(e);
            }
        });
        btBike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bikeButtonPressed(e);
            }
        });
    }

    public static void main(String[] args) {
        KfZErfassung program = new KfZErfassung();
    }

    private void carButtonPressed(ActionEvent e) {
        if (tfOrt.getText() != null && tfOrt.getText() != "") {
            System.out.println("---" + tfOrt.getText() + "---");
            model.erfasseKfz(tfOrt.getText(), 'B');
        }
    }

    private void truckButtonPressed(ActionEvent e) {
        if (tfOrt.getText() != null) {
            model.erfasseKfz(tfOrt.getText(), 'C');
        }
    }

    private void bikeButtonPressed(ActionEvent e) {
        SuchBaumZeichner zeichner = new SuchBaumZeichner(300, 400, model.getVerkehrszaehlung());
    }
}
