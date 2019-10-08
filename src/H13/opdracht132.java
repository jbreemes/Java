package H13;

import java.awt.*;
import java.applet.*;

public class opdracht132 extends Applet {

    public void paint(Graphics g) {

        driehoek(g,100,200,200,460,400,300);
    }

    void driehoek ( Graphics g, int x, int y, int xx, int yy, int xxx, int yyy) {

        g.drawLine(x,y,xx,yy);
        g.drawLine(xx,yy,xxx,yyy);
        g.drawLine(xxx,yyy,x,y);

    }
}
