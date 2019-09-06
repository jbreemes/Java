package H5;

import java.awt.*;
import java.applet.*;

public class Variablen extends Applet {

    private Color Kleur;
    private Color Lijn;

    private int Hoogte;
    private int Breedte;
    private int X;
    private int Y;

    public void init() {

    Kleur = Color.magenta;
    Lijn = Color.BLACK;
    Breedte = 200;
    Hoogte = 100;
    X = 10;
    Y = 10;


    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(X,Y,X+Breedte,Y);
        g.drawString("line",100,25);

        //Rechthoek
        g.drawRect(X,Y+50,Breedte,Hoogte);
        g.drawString("Rectangel",80,Y+Hoogte+60);

        //rectovaal
        g.setColor(Kleur);
        g.fillRect(X+Breedte+10,Y+50,Breedte,Hoogte);
        g.setColor(Lijn);
        g.drawOval(X+Breedte+10,Y+50,Breedte,Hoogte);
        g.drawString("Gevulde rechthoek met ovaal",250,170);

        //taartpunt
        g.setColor(Kleur);
        g.fillArc(X+Breedte+Breedte+20,Y+50,Breedte+1,Hoogte+1,0,50);
        g.setColor(Lijn);
        g.drawOval(X+Breedte+Breedte+20,Y+50,Breedte,Hoogte);
        g.drawString("Taartpunt met ovaal eromheen",450,170);


        //afgeronde rechthoek
        g.drawRoundRect(X,Y+Hoogte+Hoogte,Breedte,Hoogte,25,25);
        g.drawString("Afgeronde rechthoek",50,330);

        //Gevulde Ovaal
        g.setColor(Kleur);
        g.fillOval(X+Breedte+20,Y+Hoogte+Hoogte,Breedte+1,Hoogte);
        g.setColor(Lijn);
        g.drawString("Gevulde ovaal",295,330);

        //cirkel
        g.drawOval(X+Breedte+Breedte+75,Y+Hoogte+Hoogte,/*Breedte*/Hoogte,Hoogte);
        g.drawString("Cirkel",520,330);






    }

}
