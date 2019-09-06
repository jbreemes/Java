package H4;

import java.applet.Applet;
import java.awt.*;

public class Stoplight extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        //paal
        g.fillRect(150,50,40,100);
        g.drawRect(150,50,40,100);

        g.fillRect(167,150,5,200);
        g.drawRect(167,150,5,200);

        //licht
        g.setColor(Color.green);
        g.fillArc(161,60,20,20,0,500);

        g.setColor(Color.yellow);
        g.fillArc(161,90,20,20,0,500);

        g.setColor(Color.red);
        g.fillArc(161,120,20,20,0,500);

    }

}

