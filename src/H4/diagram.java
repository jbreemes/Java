package H4;

import java.awt.*;
import java.applet.*;

public class diagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {


        //statiek

        g.setColor(Color.blue);
        g.fillRect(75,150,30,100);
        g.drawRect(75,150,30,100);


        g.setColor(Color.black);
        g.drawRect(125,100,30,150);

        g.setColor(Color.red);
        g.fillRect(175,50,30,200);
        g.drawRect(175,50,30,200);

        g.setColor(Color.black);
        //nummers
        g.drawString("0",40,260);
        g.drawString("20",35,210);
        g.drawString("40",35,160);
        g.drawString("80",35,110);
        g.drawString("100",28,60);

        //verticaal en horizontaal lijnen
        g.fillRect(50,50,2,200);
        g.drawRect(50,50,2,200);

        g.fillRect(50,250,200,2);
         g.drawRect(50,250,200,2);

        //namen
        g.drawRect(280,65,100,70);
        g.drawString("valerie", 290,85);
        g.drawString("Hans", 290,105);
        g.drawString("Jeroen", 290,125);

        g.setColor(Color.blue);
        g.fillRect(335,75,10,10);
        g.drawRect(335,75,10,10);

        g.setColor(Color.black);
        g.drawRect(335,95,10,10);

        g.setColor(Color.red);
        g.fillRect(335,115,10,10);
        g.drawRect(335,115,10,10);

        g.setColor(Color.black);




    }

}
