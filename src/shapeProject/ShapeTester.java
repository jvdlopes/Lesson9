package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class ShapeTester {

    
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        
        //Shape s = new Shape(); -> not allowed
        Shape a = new Wheel(100,100,50,6); //ok
        Shape b = new Rect(-200,-200,75,50);
        a.draw(p);
        b.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("Press <enter> to change Wheel to rectangle" + " and rect to Circle");
        s.nextLine();
        
        p.setColor(Color.white);
        a.draw(p);
        b.draw(p);
        a = makeOneShapeFromAnother(a,1);
        a = makeOneShapeFromAnother(b,2);
        p.setColor(Color.blue);
        a.draw(p);
        b.draw(p);
        Shape bb = new Rect(); //ok
        Circle c = new Wheel(); // ok Parent can be a child
        Circle cc = new Circle();
        //c is both a Circle and a Wheel
        //c is also a Shape
        Wheel w = new Wheel(); //w is a wheel, Circle and shape
        //Wheel w = new Circle(); //no child can't be parent
        //All Wheels are Circles, but all Circles are not neccessarily Wheels
        System.out.println("Is c a shape? -> " + (c instanceof Shape)); //t
        System.out.println("Is c a Circle? -> " + (c instanceof Circle)); //t
        System.out.println("Is c a Wheel? -> " + (c instanceof Wheel)); //t
        System.out.println("Is w a Circle? -> " + (w instanceof Wheel)); //t
        System.out.println("Is cc a Wheel? -> " + (cc instanceof Wheel)); //f
    }
    
    public static Shape makeOneShapeFromAnother(Shape inShape, int type){
        //1=Rect, 2= Circle, 3=Wheel
        Shape outShape;
        if(type==1){
            double area = inShape.area();
            return new Rect(inShape.getXPos(), inShape.getYPos(),
                            Math.sqrt(area), Math.sqrt(area));
        }
        else if(type==2){
            double area = inShape.area();
            double rad = Math.sqrt(area / Math.PI);
            return new Circle(inShape.getXPos(), inShape.getYPos(), rad);
        }
        else{
            double area = inShape.area();
            double rad = Math.sqrt(area / Math.PI);
            return new Wheel(inShape.getXPos(), inShape.getYPos(), rad, 5);
        }
    }
    
}
