package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class keer extends Applet {

    TextField tekstveld;
    Button knop;
    boolean bowl;

    public void init() {

        tekstveld = new TextField("", 8);
        add(tekstveld);

        knop = new Button("Ok");
        knop.addActionListener(new knoplistener());
        add(knop);

    }


    public void paint(Graphics g) {

        if (bowl){



        }

    }


    class knoplistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s = tekstveld.getText();


            repaint();

        }
    }
}
