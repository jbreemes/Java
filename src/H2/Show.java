/*
opdracht 2.1
 */

package H2;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() { setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Jozua Breemes", 150, 160 );
    }

}