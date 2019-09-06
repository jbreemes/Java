package H4;

import java.applet.Applet;
import java.awt.*;

public class Tekenen extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        //Lijn
       g.drawLine(10,10,210,10);
       g.drawString("line",100,25);

        //Rechthoek
       g.drawRect(10,50,200,100);
       g.drawString("Rectangel",80,165);

       //rectovaal
       g.drawString("Gevulde rechthoek met ovaal",250,165);
       g.setColor(Color.magenta);
       g.fillRect(230,50,200,100);
       g.setColor(Color.black);
       g.drawOval(230,50,200,100);

       //taartpunt
       g.setColor(Color.magenta);
       g.fillArc(460,50,201,100,0,50);
       g.setColor(Color.black);
       g.drawOval(460,50,200,100);
       g.drawString("Taartpunt met ovaal erin",500,165);

       //afgeronde rechthoek
        g.drawRoundRect(10,200,200,100,25,25);
        g.drawString("Afgeronde rechthoek",50,320);

        //Ovaal
        g.setColor(Color.magenta);
        g.fillOval(230,200,201,101);
        g.drawOval(230,200,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",295,320);

        //cirkel
        g.drawOval(500,200,100,100);
        g.drawString("Cirkel",535,320);

    }


}