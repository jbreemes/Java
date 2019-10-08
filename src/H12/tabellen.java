package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class tabellen extends Applet {
    int waarden[] = new int[5];
    TextField tekst [] = new TextField[5];
    boolean cool;

    public void init() {
        Button Ok = new Button("Ok");
        Ok.addActionListener(new Oklistener());

        for(int a= 0; a < tekst.length; a++){
            tekst [a] = new TextField(5);
            add(tekst[a]);
        }
        add(Ok);
    }

    public void paint (Graphics g){
        int y =50;

        if(cool) {
            for(int a=0; a < tekst.length; a++){
                g.drawString(""+waarden[a],50,y);
                y+= 20;

            }
        }
    }

    public class Oklistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int a=0; a < tekst.length; a++) {
                String s = tekst[a].getText();
                waarden[a] = Integer.parseInt(s);
                if (a == 4) {
                    Arrays.sort(waarden);
                    cool = true;

                }
                repaint();
            }
        }
    }
}
