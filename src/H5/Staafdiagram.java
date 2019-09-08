package H5;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    int Valery;
    int Jeroen;
    int Hans;


    int Formule;


    public void init() {





    }

    public void paint(Graphics g) {

        Valery = 40 * 2;
        Hans = 80  * 2;
        Jeroen = 100 * 2;


        Formule = 250;





        // Valery
        g.setColor(Color.BLUE);
        g.fillRect(90, Formule - Valery, 30, Valery);

        // Jeroen
        g.setColor(Color.BLACK);
        g.drawRect(150, Formule - Jeroen, 30, Jeroen);

        // Hans
        g.setColor(Color.RED);
        g.fillRect(210, Formule - Hans, 30, Hans);

        //nummers
        g.setColor(Color.black);
        g.drawString("0",40,250);
        g.drawString("10",40,220);
        g.drawString("20",40,230);
        g.drawString("30",35,220);
        g.drawString("40",35,210);
        g.drawString("50",35,200);
        g.drawString("60",40,190);
        g.drawString("70",40,180);
        g.drawString("80",35,170);
        g.drawString("90",35,160);
        g.drawString("100",28,50);

        //horizontal
        g.fillRect(50,50,2,200);
        g.drawRect(50,50,2,200);
        //vertical
        g.fillRect(50,250,200,2);
        g.drawRect(50,250,200,2);

        //namen
        g.drawRect(280,65,100,70);
        g.drawString("valery", 290,85);
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

