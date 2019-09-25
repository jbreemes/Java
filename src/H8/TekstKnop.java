package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TekstKnop extends Applet {
    TextField tekst;
    String T;

    Button Ok;
    Button Refresh;

    public void init() {
        tekst = new TextField("", 30);
        Ok = new Button("Ok");
        Ok.addActionListener( new Send() );
        Refresh = new Button("Refresh");
        Refresh.addActionListener(new Reset() );
        T=" ";

        add(tekst);
        add(Ok);
        add(Refresh);


    }

    public void paint(Graphics g) {
        g.drawString("say somethang ",50, 60 );
        g.drawString(T,50,80);
    }





    class Send implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            T = tekst.getText( );
            repaint();

        }
    }

    class Reset implements ActionListener {


      public void actionPerformed(ActionEvent e) {
          tekst.setText(" ");
          repaint();

      }
  }


}
