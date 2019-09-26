package H10;
//uuuuuhm
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Praktijk extends Applet {
    TextField tekstveld;
    Button knop;
    double invoer;

    boolean bool;

    public void init() {


        tekstveld = new TextField("", 8);
        add(tekstveld);

        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);

    }

    public void paint(Graphics g) {

        int x = 58;
        int y = 78;

        if(bool) {

            if(invoer < 4) {
                g.drawString("Het cijfer is: slecht", x, y);
            }
            else if(invoer == 4) {
                g.drawString("Het cijfer is: Onvoldoende", x, y);
            }
            else if(invoer == 5) {
                g.drawString("Het cijfer is: Matig", x, y);
            }
            else if(invoer == 6) {
                g.drawString("Het cijfer is: Voldoende", x, y);
            }
            else if(invoer == 7) {
                g.drawString("Het cijfer is: Voldoende", x , y);
            }
            else if(invoer > 7) {
                g.drawString("Het cijfer is: Goed", x, y);
            }
            else if(invoer > 10) {
                g.drawString("Foute invoer",x ,y);
            }

        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            bool = true;


            repaint();

        }
    }

}
