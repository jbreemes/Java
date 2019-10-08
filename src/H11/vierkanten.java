package H11;

import java.applet.Applet;
import java.awt.*;

public class vierkanten extends Applet {

    public void init() {


    }
    //for (teller = 0; teller <= 10; teller++) {
    //y += 20;

    public void paint(Graphics g) {

        int teller;
        int y = 10;
        int x = 10;


        for (teller = 0; teller <= 4; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x,y,20,20);
        }



    }
}