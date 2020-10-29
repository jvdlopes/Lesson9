package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class DrawShapes {
   
    public static void main(String[] args) {
       Shape x = new Rect(0,0,200,75);
       Shape y = new Circle(50,50,100);
       Shape z = new Wheel(-200, 100, 75, 5);
       Pen p = new StandardPen(new SketchPadWindow(800,600));
       p.setColor(Color.red);
       p.setWidth(10);
       x.draw(p);
       p.setColor(Color.green);
       y.draw(p);
       p.setColor(Color.blue);
       z.draw(p);
       
       Scanner s = new Scanner(System.in);
       System.out.print("Press <enter> to move rectangle to -200,-200 ");
       s.nextLine();
       p.setColor(Color.white);
       x.draw(p);
       x.move(-200, -200);
       p.setColor(Color.red);
       x.draw(p);
       
       System.out.print("Press <enter> to resize by 1/2 ");
       s.nextLine();
       p.setColor(Color.white);
       y.draw(p);
       y.stretchBy(.5);
       p.setColor(Color.red);
       y.draw(p);
       
       System.out.print("Press <enter> to change spokes amount ");
       s.nextLine();
       p.setColor(Color.white);
       z.draw(p);
       ((Wheel)z).setSpokes(10);
       p.setColor(Color.blue);
       z.draw(p);
    }
    
}
