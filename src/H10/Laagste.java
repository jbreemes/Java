package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laagste extends Applet {
    int getal;
    TextField tekstvak;
    int uitkomst;

    public void init(){
        tekstvak = new TextField(10);
        tekstvak.addActionListener(new VakListener());
        add(tekstvak);
        uitkomst = 100;

    }
    public void paint(Graphics g){
        g.drawString(String.valueOf(uitkomst), 50, 50);
    }
    class VakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if (uitkomst > getal){
                getal = uitkomst;
            }
            else {

            }
            repaint();
        }
    }
}