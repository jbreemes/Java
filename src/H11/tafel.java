package H11;

import java.applet.Applet;
import java.awt.*;

public class tafel extends Applet {

    public void init() {


    }
    //for (teller = 0; teller <= 10; teller++) {
    //y += 20;

    public void paint(Graphics g) {

        int teller;
        int y = 10;
        int a = 0;
        int b = 0;
        int c;

        for (teller = 0; teller <= 9; teller++) {
            y += 10;
            c = b + 3;
            g.drawString("" + c, 100, y);

            a = b;
            b = c;


        }


    }
}