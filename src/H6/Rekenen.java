package H6;

import java.awt.*;
import java.applet.*;

public class Rekenen extends Applet {

    double Jan;
    double Ali;
    double Jeanette;
    double Me;
    double Bedrag;
    double Geld;



    public void init() {

        Geld = 113;
        Bedrag = (Geld/4);
        Jan = (Geld/4);
        Ali  = (Geld/4);
        Jeanette  = (Geld/4);



    }

    public void paint(Graphics g) {
        g.drawString("Bedrag 113 delen voor 4 pers", 10,30 );
        g.drawString("Ali Ontvangt: " + Bedrag, 10,50);
        g.drawString("Jeanette ontvangt: "+ Bedrag,10,70);
        g.drawString("Ik ontvang: "+ Bedrag,10,90);



    }
}