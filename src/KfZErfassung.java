import abiturklassen.SuchBaumZeichner;
import ifl1.Zaehlung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KfZErfassung extends JFrame {
    private JPanel pnMain;
    private JButton btCar;
    private JButton btTruck;
    private JButton btBike;
    private JTextField tfOrt;
    private JLabel lbText;

    private final Zaehlung model = new Zaehlung();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

    SuchBaumZeichner zeichner = new SuchBaumZeichner(d.width / 2 + 8, d.height, model.getVerkehrszaehlung());

    public KfZErfassung() {

        setContentPane(pnMain);
        setTitle("KFZ Erfassung");
        setSize(d.width / 2 + 8, d.height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        int x = (0);
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);

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
            model.erfasseKfz(tfOrt.getText(), 'B');
        }
        zeichner.zeigeBaum();
    }

    private void truckButtonPressed(ActionEvent e) {
        if (tfOrt.getText() != null) {
            model.erfasseKfz(tfOrt.getText(), 'C');
        }
        zeichner.zeigeBaum();
    }

    private void bikeButtonPressed(ActionEvent e) {
        if (tfOrt.getText() != null) {
            model.erfasseKfz(tfOrt.getText(), 'A');
        }
        zeichner.zeigeBaum();
    }
}
