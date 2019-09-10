package H6;

import java.applet.Applet;
import java.awt.*;

public class Jaar extends Applet {
    int seconden;
    int minuten;
    int uren;
    int dag;
    int jaar;

    public void init(){
        seconden = 60;
        minuten = 60;
        dag = 24;
        jaar = 365;
    }

    public void paint(Graphics g){
        //uur.
        g.drawString("Er zitten seconden in een uur: " + seconden * minuten, 20, 20);
        //dag.
        g.drawString("Er zitten seconden in een dag: " + (seconden * minuten) * dag, 20, 40);
        //jaar.
        g.drawString("Er zitten seconden in een jaar: " + (seconden * minuten) * dag * jaar, 20, 60);
    }
}