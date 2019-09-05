/*
Opdracht 1
*/
package H4;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawPolygon(new int[] {100, 150, 200}, new int[] {100, 50, 100}, 3);

        g.drawRect(100,100,100,100);
        g.drawRect(150,150,25,50);
        g.drawRect(115,150,25,20);


        g.drawRect(85,85,15,5);
        g
        g.drawRect(85,80,15,5);

        g.drawRect(85,75,15,5);

        g.drawRect(100,75,2,25);



    }

}