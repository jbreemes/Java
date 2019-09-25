package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class schrikkeljaar extends Applet {

    TextField tekstvak;
    TextField jaar;
    Button knop;
    String tekst;
    String tekst2;
    String s;
    String Antw;
    int jaartal;
    int invoer;

    public void init() {

        tekstvak = new TextField("M", 4);
        knop = new Button("Bereken");
        jaar = new TextField("j",4);

        add(jaar);
        add(tekstvak);
        add(knop);







        knop.addActionListener(new knoplistener());
    }




    public class knoplistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(invoer));
            invoer = Integer.parseInt(tekstvak.getText());
            int maand = invoer;
            switch (maand) {
                case 1:
                    tekst = "Januari bestaat uit 31 dagen.";
                    break;
                case 2: tekst = "Februari "+ tekst2;

                    s = jaar.getText();
                    jaartal = Integer.parseInt(s);
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        tekst2 = "bestaat uit 29 dagen."; //schrikkeljaar
                    } else {
                        tekst2 = "bestaat uit 28 dagen.";
                    }
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
                    tekst = "kies uit 1-12";
                    break;

            }
            repaint();
        }
    }





    public void paint(Graphics g) {
        g.drawString("De maand " + tekst, 100, 100);
    }





}
