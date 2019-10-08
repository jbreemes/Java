package H12;

import java.awt.*;
import java.applet.*;


public class getal extends Applet {

    double gemiddelde[];
    double a;
    double b;

    public void init() {
        gemiddelde = new double [10];


        for (int teller = 0; teller < gemiddelde.length; teller ++) {
            gemiddelde[teller] = 10 *  teller + 10;
            a += gemiddelde[teller];

        }
        a /= gemiddelde.length;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < gemiddelde.length; teller ++){
            g.drawString("" + gemiddelde[teller], 50, 20 * teller + 20);
        }
g.drawString("gemiddelde ="+a,120,20);
    }
}
