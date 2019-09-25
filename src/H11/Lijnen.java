package H11;

import java.applet.Applet;
import java.awt.*;

public class Lijnen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int begin;
        int x = 0;

        for(begin = 0; begin < 10; begin++) {
            x += 20;
            g.drawLine(x, 50, x, 200);
        }
    }
}
