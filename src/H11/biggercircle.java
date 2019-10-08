package H11;

import java.applet.Applet;
import java.awt.*;

public class biggercircle extends Applet {

    public void init() {


    }
    //for (teller = 0; teller <= 10; teller++) {
    //y += 20;

    public void paint(Graphics g) {

        int teller;
        int y = 400;
        int x = 400;

        int k = 10;
        int d = 10;

        for (teller = 0; teller <= 50; teller++) {
            k += 20;
            d += 20;
            x -= 10;
            y -= 10;

            g.drawOval(x,y,k,d);

        }



    }
}