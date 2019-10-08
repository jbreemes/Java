package H11;

import java.applet.Applet;
import java.awt.*;

public class circle extends Applet {

    public void init() {


    }
    //for (teller = 0; teller <= 10; teller++) {
    //y += 20;

    public void paint(Graphics g) {

        int teller;
        int y = 150;
        int x = 150;

        int k = 10;
        int d = 10;

        for (teller = 6; teller <= 10; teller++) {
            k += 10;
            d += 10;
            x -= 5;
            y -= 5;


            g.drawOval(x,y,k,d);
        }



    }
}