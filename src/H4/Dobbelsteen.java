package H4;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawRoundRect (50,50,100,100,25,25);

        g.fillArc(61,60,20,20,0,500);
        g.fillArc(120,60,20,20,0,500);
        g.fillArc(61,120,20,20,0,500);
        g.fillArc(120,120,20,20,0,500);

    }

}
