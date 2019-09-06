package H4;

import java.applet.Applet;
import java.awt.*;


public class fillarc extends Applet {

    public void init() { setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillArc(140,100,100,100,0,500);


    }

}

