package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maand extends Applet {

    TextField tekstvak;
    Button knop;
    int invoer;
    String tekst;
    String dag;
    public void init() {

        tekstvak = new TextField(1);
        knop = new Button("Bereken");

        add(tekstvak);
        add(knop);

        knop.addActionListener(new knoplistener());
    }
    public class knoplistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(invoer));
            invoer = Integer.parseInt(tekstvak.getText());
            int maand = invoer;
            switch (maand){
                case 1:
                    tekst = "Januari bestaat uit 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari bestaat uit 28 of 29 dagen.";
                    break;
                case 3:
                    tekst = "Maart bestaat uit 31 dagen.";
                    break;
                case 4:
                    tekst = "April bestaat uit 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei bestaat uit 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni bestaat uit 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli bestaat uit 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus bestaat uit 31 dagen.";
                    break;
                case 9:
                    tekst = "September bestaat uit 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober bestaat uit 31 dagen.";
                    break;
                case 11:
                    tekst = "November bestaat uit 30 dagen.";
                    break;
                case 12:
                    tekst = "December bestaat uit 31 dagen.";
                    break;
                default:
                    tekst = "bestaat 1 t/m 12";
                    break;

            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("De maand " + tekst, 100, 100);


    }

}
