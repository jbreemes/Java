package H4;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor (Color.red);
        g.fillRect (115,40,100,25);
        g.drawRect(115, 40, 100, 25);
        g.setColor (Color.white);
        g.fillRect (115,65,100,25);
        g.drawRect(115, 65, 100, 25);
        g.setColor (Color.blue);
        g.fillRect (115,90,100,25);
        g.drawRect(115, 90, 100, 25);
        g.setColor (Color.white);
        g.drawOval(215, 38, 1, 180);
    }
}