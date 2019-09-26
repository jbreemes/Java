package H11;

import java.applet.Applet;
import java.awt.*;

public class fibonacchi extends Applet {

    public void init() {


    }
    //for (teller = 0; teller <= 10; teller++) {
    //y += 20;

    public void paint(Graphics g) {

     int teller;
     int y = 10;
     int a=1;
     int b=0;
     int c;

     for (teller=0; teller <=15; teller++ ){
         y += 15;
         c= a+b;
         g.drawString("" + c, 100,y);

         a= b;
         b= c;




        }




    }
}