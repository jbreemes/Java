package H11;

import java.applet.Applet;
import java.awt.*;

public class schaakbord extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {

        int y = 50;
        int x = 50;

        int breedte = 25;
        int hoogte = 25;
        int line = 24;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6)
            {
            g.setColor(Color.black);
            g.fillRect(x, y, breedte, hoogte);
            }

            else {
            g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }


        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }


        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }


        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7)
            {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.drawRect(x, y, line, line);
            }

            x+=breedte;

        }

    }
}
